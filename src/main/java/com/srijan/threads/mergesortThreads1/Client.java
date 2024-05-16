package com.srijan.threads.mergesortThreads1;

import com.srijan.threads.mergesortthreads.MergeSorter;

import java.util.List;
import java.util.concurrent.*;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
     List <Integer> list = List.of(2, 10, 5, 3, 6, 4, 11);
     ExecutorService executorService = Executors.newCachedThreadPool();

     MergeSorter mergeSorter = new MergeSorter(list, executorService);

     Future<List<Integer>> sortedArray = executorService.submit(mergeSorter);
        System.out.println(sortedArray.get());
        executorService.shutdown();
    }
}
