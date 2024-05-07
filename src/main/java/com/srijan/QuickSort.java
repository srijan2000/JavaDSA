package com.srijan;
//Quick Sort is a divide and conquer algorithm.
// It involves 3 steps
//Pivot Selection - We pick an element and mark it as pivot.
//The pivot element can be first element, last element or any random element

//Partitioning: We reorder the array such that all elements greater than pivot comes
//after the pivot and all elements smaller than pivot comes before pivot. The
//elements equal to pivot can go either side of the pivot.
//After this partitioning the pivot is at its correct sorted position.

//Recursion - Recursively apply the above steps on the subarray formed
// to the left side of pivot and on the subarray formed on the right side of the
//pivot

public class QuickSort {
    public int partition(int []arr, int low, int high){

         int i = low;
         int j = low;
        int pivot = arr[high];
        while(i <= high){
            if(arr[i] <= pivot){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
            i++;
        }
        return j-1;
    }
    public void sort(int[] arr, int low, int high){
        if(low < high){
            int p = partition(arr, low, high);
            sort(arr, low, p-1);
            sort(arr, p+1, high);
        }
    }
    public void printArr(int arr[]){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }

    }
    public static void main(String[] args){
        int arr[] = {5, 2, 0, 1, 6, 3};
        QuickSort qs = new QuickSort();
        qs.sort(arr,0,arr.length-1);
        qs.printArr(arr);
    }

}
