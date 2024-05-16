package com.srijan.threads.print1to100;

public class NumberPrinter implements Runnable {
    private int num;

    NumberPrinter(int i){
        this.num = i;

    }

    public void run(){
        System.out.println(num + Thread.currentThread().getName());
    }
}
