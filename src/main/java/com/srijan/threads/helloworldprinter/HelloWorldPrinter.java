package com.srijan.threads.helloworldprinter;
// Print "Hello World " on a seperate thread
// DOn't think in terms of thread
//Think in terms of what task needs to be done in parallel

public class HelloWorldPrinter implements Runnable {

    @Override
    public void run() {
        System.out.println("Hello World");
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        HelloWorldPrinter h = new HelloWorldPrinter();
        Thread t = new Thread(h);
        t.start();// Internally it will call run method
        System.out.println(t.currentThread().getName());
    }
}
