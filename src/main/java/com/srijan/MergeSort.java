package com.srijan;
// Merge Sort is a divide and conquer algorithm
// Divide and Conquer recursively breaks down a problem
//into two or more sub-problems of the same or related type,
//until these become simple enough to be solved directly
//The solutions to the sub- problems are then combined to give a solution to the
//original problem

//Divide - In this step the algorithm takes middle point of array and
//divides the array into 2 halves.
//The algorithm is carried out recursively for half arrays,
//until there are no more half arrays to divide.

//Conquer - In this step starting from the bottom, we sort and merge
// the divided arrays and get the sorted array


public class MergeSort {

    public void printArray(int [] arr){
        int n = arr.length;
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public void sort(int arr[], int[] temp, int low, int high){
        if(low < high){
            int mid = low + (high - low)/2;
            sort(arr, temp, low, mid);
            sort(arr, temp, mid+ 1, high);
            merge(arr, temp, low, mid, high);

        }
    }
    private void merge(int[] arr, int[] temp, int low, int mid, int high){
        for(int i = low; i<= high; i++){
            temp [i] = arr[i];
        }
        int i = low;
        int j = mid + 1;
        int k = low;

        while(i <= mid && j <= high){
            if(temp[i] <= temp[j]){
                arr[k] = temp[i];
                i++;
            }else{
                arr[k] = temp[j];
                j++;
            }
            k++;
        }
        while( i <= mid){
            arr[k] = temp[i];
            k++;
            i++;

        }
        while(j <= high){
            arr[k] = temp[j];
            k++;
            j++;
        }
    }
    public static void main(String[] args){
        int[] arr = new int[] {9, 5, 2, 4, 3};
        MergeSort ms = new MergeSort();
        ms.sort(arr, new int[arr.length], 0, arr.length - 1);
        ms.printArray(arr);

    }
}
