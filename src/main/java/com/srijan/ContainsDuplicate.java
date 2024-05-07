package com.srijan;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    // int arr[] = {7, 3, 1, 4, 1};

    //return false if every element is distinct
   /* public static boolean isDistinct(int arr[]){
        for (int i =0; i< arr.length - 1; i++){
            for(int j = i+1; j< arr.length; j++){
                if(arr[i] == arr[j]){
                    return true;
                }
            }
        }
        return false;

    }*/
    public static boolean containsDuplicate(int[] nums){
       Set<Integer> set = new HashSet<>();
       for(int i = 0; i < nums.length; i++){
           if(set.contains(nums[i])){
               return true;
           }
           set.add(nums[i]);
       }
       return false;

    }

    public static void main(String[] args) {
        int arr[] = {7, 3, 1, 4, 1};
        System.out.println(containsDuplicate(arr));
    }
}
