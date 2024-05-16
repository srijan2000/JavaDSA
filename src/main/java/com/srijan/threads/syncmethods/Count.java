package com.srijan.threads.syncmethods;

public class Count {
    private int value = 0;

    public synchronized void incrValue(int x){
        value += x;
    }

    public int getValue() {
        return value;
    }
}
