package com.srijan;

public class LinearSearch {
    public static int search(int []arr, int n, int x){
        for(int i = 0; i< n; i++){
            if(arr[i] == x){
                return i;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        int arr[] = {5, 1, 9, 2, 10, 15, 20};
        int n = arr.length -1;
        System.out.println(search(arr, n, 10));
    }
}
