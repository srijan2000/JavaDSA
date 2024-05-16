package com.srijan.threads.print1to100_1;

public class NumberPrinter_1 implements Runnable{

    int num;

    NumberPrinter_1(int i){
        this.num = i;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " : " + num);

    }
}
