package com.srijan.threads.helloworldprinter1;

public class HelloworldPrinter1 implements Runnable{
    @Override
    public void run() {
        System.out.println("Hello World");
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        HelloworldPrinter1 helloworldPrinter1 = new HelloworldPrinter1();
        Thread t1 = new Thread(helloworldPrinter1);
        t1.start();
        System.out.println(Thread.currentThread().getName());
    }
}
