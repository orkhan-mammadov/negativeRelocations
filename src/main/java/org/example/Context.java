package org.example;

public class Context {

    private int relocations;
    private long sum;

    private int minimum;

    public void incrementRelocations() {
        relocations++;
    }

    public void setMinimum(int negative) {
        if(negative < this.minimum) {
            this.minimum = negative;
        }
    }

    public int getMinimum() {
        return this.minimum;
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
