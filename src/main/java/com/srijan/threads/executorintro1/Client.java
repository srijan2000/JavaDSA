package com.srijan.threads.executorintro1;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
    public static void main(String[] args) {

        //Executor executor = Executors.newFixedThreadPool(10);
        ExecutorService executor = Executors.newFixedThreadPool(10);
        for(int i = 1; i <= 100; i++){
            NumberPrinterExecutor npe = new NumberPrinterExecutor(i);
            executor.execute(npe);
        }
        executor.shutdown();


    }
}
