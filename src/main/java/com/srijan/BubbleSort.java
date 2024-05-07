package com.srijan;

public class BubbleSort {
    public static int[] sort(int arr[]){
        int n = arr.length;

        for(int i = 0;i < n-1; i++){
            boolean isSwapped = false;

            for(int j = 0; j < n-1-i; j++){
                if(arr[j] > arr[j+1]){
                    isSwapped = true;
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                }
            }
            if(isSwapped == false){
                break;
            }
        }
        return arr;

    }
    public static void main(String[] args) {
        int arr[] = {5, 1, 2, 9, 10};
        int res[] = sort(arr);
        for(int i =0 ; i < res.length; i++){
            System.out.print(res[i] + " ");
        }


    }
}
