package com.srijan.threads.Scaler1;

public class Adder implements Runnable {
    int x;
    int y;

    Adder(int x, int y){
        this.x = x;
        this.y = y;

    }
    @Override
    public void run() {
        int k = x + y;
        System.out.println(Thread.currentThread().getName() +" "+ k );

    }
}
