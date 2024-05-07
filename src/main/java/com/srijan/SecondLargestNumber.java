package com.srijan;

public class SecondLargestNumber {
    static int secondLargest(int arr[]){
        int index = 0;
        for(int i = 0; i<arr.length; i++){
            if(index < arr[i]){
                index = arr[i];
            }

        }
        System.out.println(index);
        int index1 = 0;
        for(int i = 0; i< arr.length; i++){

            if(arr[i] > index1 && arr[i] < index  ){
                index1 = arr[i];

            }

        }
        System.out.println(index1);
        return index1;



    }
    public static void main(String[] args) {
        int arr[] = {12, 0, 1, 10, 34, 1};
        int sol =  secondLargest(arr);

    }
}
