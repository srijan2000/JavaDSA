package com.srijan.threads.executorintro;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
    public static void main(String[] args) {
        //Executor executor = Executors.newFixedThreadPool(10);
       // This Executor is just to start the thread not to shut down the thread
        //Executor executor = Executors.newFixedThreadPool(10);

        // if number of task execeeds the number of threads it will put it in the queue
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        for(int i = 0 ; i<= 100; i++ ){
            if(i == 5 || i == 20){
                System.out.println("DEBUG");
            }
            NumberPrinter numberPrinter = new NumberPrinter(i);
            //executor.execute(numberPrinter);
            executorService.execute(numberPrinter);
        }
        executorService.shutdown();
    }
}
