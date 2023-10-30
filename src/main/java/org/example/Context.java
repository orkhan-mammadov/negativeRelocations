package org.example;

import java.util.Optional;
import java.util.PriorityQueue;

public class Context {

    private int relocations;
    private long sum;

    private final PriorityQueue<Integer> negatives = new PriorityQueue<>(); //Stores negative numbers in natural order that has been added to sum

    public void incrementRelocations() {
        relocations++;
    }

    public void addNegative(int negative) {
        negatives.add(negative);
    }

    public void removeMinNegative() {
        negatives.poll();
    }

    public int getMinNegative() {
        return Optional.ofNullable(negatives.peek()).orElse(0);
    }

    public void addSum(int current) {
        sum += current;
    }

    public void subtractSum(int current) {
        sum -= current;
    }

    public long getSum() {
        return sum;
    }

    public void setSum(long sum) {
        this.sum = sum;
    }

    public int getRelocations() {
        return relocations;
    }
}
