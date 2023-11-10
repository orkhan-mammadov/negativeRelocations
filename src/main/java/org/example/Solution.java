package org.example;

public class Solution {

    public static int solution(int[] A) {
        final Context context = new Context();
        for (int current : A) {
            long newSum = context.getSum() + current;
            if (current < 0) {
                if (newSum >= 0) {
                    context.setSum(newSum);
                    context.setMinimum(current);
                } else {
                    // finds the smallest negative number that has been added to sum or returns 0 if there are no negative numbers
                    int storedMin = context.getMinimum();
                    if (storedMin < current) {
                        // if there is smaller number than current, then subtract it from sum, remove it from queue
                        // and add 'current' to sum, add it to queue, and increment relocations
                        context.subtractSum(storedMin);
                        context.incrementRelocations();
                        context.addSum(current);
                        context.setMinimum(current);
                    } else {
                        // if the 'current' is smaller than the smallest negative number that has been added to sum,
                        // then just increment relocation
                        context.incrementRelocations();
                    }
                }
            } else {
                context.setSum(newSum);
            }
        }
        return context.getRelocations();
    }

}
