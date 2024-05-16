package com.srijan.threads.mergesortthreads;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) throws Exception {
        List<Integer> list = List.of(2, 10, 5, 3, 6, 4, 11);
        ExecutorService executorService = Executors.newCachedThreadPool();

       // MergeSorter mergeSorter = new MergeSorter(list);
        //List<Integer> sortedArray = mergeSorter.call();
        MergeSorter mergeSorter = new MergeSorter(list, executorService);

       Future<List<Integer>> sortedArray = executorService.submit(mergeSorter);

        System.out.println(sortedArray.get());

        executorService.shutdown();

    }
}
