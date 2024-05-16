package com.srijan.threads.mergesortThreads1;

import java.util.*;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class MergeSorter implements Callable<List<Integer>> {

    private List<Integer> ArrayToSort;
    private ExecutorService executorService;

    MergeSorter(List<Integer> Array, ExecutorService executorService){
        ArrayToSort = Array;
        executorService = executorService;
    }
    public List<Integer> call() throws Exception{
        if(ArrayToSort.size() <= 1){
            return ArrayToSort;
        }
        int mid = ArrayToSort.size()/2;
        List<Integer> leftArr = new ArrayList<>();
        for(int i = 0; i < mid; i ++) {
            leftArr.add(ArrayToSort.get(i));
        }
        List<Integer> rightArr = new ArrayList<>();
        for(int i = mid; i < ArrayToSort.size(); i++){
            rightArr.add(ArrayToSort.get(i));
        }
        MergeSorter leftSorter = new MergeSorter(leftArr, executorService);
        MergeSorter rightSorter = new MergeSorter(rightArr, executorService);
        Future<List<Integer>> leftSortedArrayFuture = executorService.submit(leftSorter);
        Future<List<Integer>> rightSortedArrayFuture = executorService.submit(rightSorter);

        int i = 0;
        int j = 0;
        List<Integer> sortedArray = new ArrayList<>();
        List<Integer> leftSortedArray = leftSortedArrayFuture.get();
        List<Integer> rightSortedArray = rightSortedArrayFuture.get();
        while (i < leftSortedArray.size() && j < rightSortedArray.size()){
            if(leftSortedArray.get(i) < rightSortedArray.get(j)){
                sortedArray.add(leftSortedArray.get(i));
                i++;
            }else {
                sortedArray.add(rightSortedArray.get(j));
                j++;
            }
        }
        while (i < leftSortedArray.size()){
            sortedArray.add(leftSortedArray.get(i));
            i++;
        }
        while(j < rightSortedArray.size()){
            sortedArray.add(rightSortedArray.get(j));
            j++;
        }

        return sortedArray;


    }
}