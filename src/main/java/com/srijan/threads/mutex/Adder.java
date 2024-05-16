package com.srijan.threads.mutex;

import java.util.concurrent.locks.Lock;

public class Adder implements Runnable{
    private Lock lock;
    private Count count;
    public Adder(Count count, Lock lock){
        this.count = count;
        this.lock = lock;
    }
    @Override
    public void run() {
        for(int i = 1; i <= 10000; i++){
            lock.lock();
            count.value += i;
            lock.unlock();
        }

    }
}
