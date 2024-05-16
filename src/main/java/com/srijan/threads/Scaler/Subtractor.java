package com.srijan.threads.Scaler;

public class Subtractor implements Runnable{
    @Override
    public void run() {
        System.out.println("I am the subtractor class" + Thread.currentThread().getName());

    }
}
