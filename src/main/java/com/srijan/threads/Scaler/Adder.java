package com.srijan.threads.Scaler;

public class Adder implements Runnable{
    @Override
    public void run() {
        System.out.println("I am the Adder Class" + Thread.currentThread().getName());

    }
}
