package org.example;

import java.util.Optional;
import java.util.PriorityQueue;

public class Solution {

    public static int solution(int[] A) {
        long sum = 0;
        int relocations = 0;
        PriorityQueue<Integer> negatives = new PriorityQueue<>(); //Stores negative numbers in natural order that has been added to sum
        
        for (int current : A) {
            long newSum = sum + current;
            if (current < 0) {
                if (newSum >= 0) {
                    sum = newSum;
                    negatives.add(current);
                } else {
                    // finds the smallest negative number that has been added to sum or returns 0 if there are no negative numbers
                    int storedMin = Optional.ofNullable(negatives.peek()).orElse(0);
                    if (storedMin < current) {
                        // if there is smaller number than current, then subtract it from sum, remove it from queue
                        // and add 'current' to sum, add it to queue, and increment relocations
                        sum = sum - storedMin;
                        relocations++;
                        sum += current;
                        negatives.poll();
                        negatives.add(current);
                    } else {
                        // if the 'current' is smaller than the smallest negative number that has been added to sum,
                        // then just increment relocation
                        relocations++;
                    }
                }
            } else {
                sum = newSum;
            }
        }
        return relocations;
    }

}
