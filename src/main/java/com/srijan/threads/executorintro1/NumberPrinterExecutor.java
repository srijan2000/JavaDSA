package com.srijan.threads.executorintro1;
// MultiThreaded
public class NumberPrinterExecutor implements Runnable {
    int x;
    NumberPrinterExecutor(int x){
        this.x = x;
    }
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " " + x);

    }
}
