package com.srijan;

public class MaximumSumSubArray {
    public static int maxSum(int arr[]){
        int currentSum = arr[0];
        int maxSumSoFar = arr[0];

        for(int i = 1; i< arr.length; i++){
            currentSum = currentSum + arr[i];
            if(currentSum < arr[i]){
                currentSum = arr[i];
            }
            if(maxSumSoFar < currentSum){
                maxSumSoFar = currentSum;
            }
        }
        return maxSumSoFar;

    }

    public static void main(String[] args) {
        int arr[] = {4, 3, -2, 6, -12, 7, -1, 6};
        int result = maxSum(arr);
        System.out.println(result);
    }
}
