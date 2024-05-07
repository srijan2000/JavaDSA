package com.srijan;

import java.util.*;

public class TwoSumDSA {
    public static int[] twoSum(int arr[], int target){
        int result[] = new int[2];
        for(int i = 0; i < arr.length-1; i++){
            for(int j = i+1; j < arr.length; j++){
                if(arr[i] + arr[j] == target){
                    result[0] = arr[i];
                    result[1] = arr[j];
                    return result;
                }

            }
        }
        return result;
       /* int result[] = new int[2];
        Map map = new HashMap();
        for(int i = 0; i < arr.length; i++){
            if(!map.containsKey(target - arr[i])){
                map.put(arr[i], i);
            }
            else{
                result[1] = i;
                result[0] = (int) map.get(target - arr[i]);
                return result;
            }
        }
        throw new IllegalArgumentException("Two numbers not found ");*/
    }

    public static void main(String[] args) {
        int arr[] = {2, 11, 5, 10, 7, 8};
        int target = 9;
        int result [] = twoSum(arr, target);
        for(int i = 0; i< 2; i++){
            System.out.print(result[i] + " ");
        }
    }

}
