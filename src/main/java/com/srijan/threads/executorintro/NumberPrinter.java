package com.srijan.threads.executorintro;

public class NumberPrinter implements Runnable {
    private int num;

    NumberPrinter(int i){
        this.num = i;

    }

    public void run(){

        System.out.println("Printed by thread : " + Thread.currentThread().getName() +": " +num );
    }
}