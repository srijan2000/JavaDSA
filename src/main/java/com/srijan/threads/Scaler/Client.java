package com.srijan.threads.Scaler;

public class Client {
    public static void main(String[] args) {
        System.out.println("I am the main class " + Thread.currentThread().getName());
        Adder a = new Adder();
        Subtractor s = new Subtractor();

        ScalerThread sc = new ScalerThread(a);
        ScalerThread c = new ScalerThread(s);

        sc.start();
        c.start();
    }
}
