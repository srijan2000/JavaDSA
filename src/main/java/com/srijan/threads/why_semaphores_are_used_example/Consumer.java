package com.srijan.threads.why_semaphores_are_used_example;
import java.util.*;
public class Consumer implements Runnable{

    private Queue<Object> queue;
    private int maxSize;

    public Consumer(Queue <Object> queue, int maxSize){
        this.queue = queue;
        this.maxSize = maxSize;
    }
    @Override
    public void run() {
        while (true){
            if(queue.size() > 0){
                queue.remove();
            }
        }


    }
}
