package com.srijan;
//Given an Integer Array Sorted in Ascending Order, return an array of the squares
// of each number sorted in ascending order.
public class SquaresOfSortedArr {
    public static int[] sortedSquares(int[] arr){
        int n = arr.length;
        int[] result = new int[n];
        int i = 0;
        int j = n - 1;
        for(int k = n-1; k >=0; k--){
            if(Math.abs(arr[i]) > Math.abs(arr[j])){
                result[k] = arr[i] * arr[i];
                i++;

            }else{
                result[k] = arr[j]* arr[j];
                j--;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int arr[] = {-4, -1, 0, 3, 10};
        int arr1[] = sortedSquares(arr);
        for(int i = 0; i< arr.length; i++){
            System.out.print(arr1[i] + " ");
        }
    }

}
