package com.srijan;
//Insertion sort is a simple sorting algorithm
//that works the way we sort playing cards in our hands
//In Insertion sort we divide the given array into two parts -
//sorted part and unsorted part.
// From unsorted part, we take first element and place at its
//correct position is sorted array. THis is done by shifting all the elements
//which are larger than first element by one position
// Its repeated till unsorted array is not empty

public class InsertionSort  {
    public static int[] insert(int []arr){
        int n = arr.length;
        for(int i =1; i < n; i++){
            int temp = arr[i];
            int j = i-1;
            while(j >=0 && arr[j] > temp){
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = temp;
        }
        return arr;

    }
    public static void main(String[] args) {
        int arr[] = {7, 3, 5, 1, 2, 6};
        int result[] = insert(arr);
        for(int i = 0; i< result.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
