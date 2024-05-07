package com.srijan.practice1;

public class SecondMax {
    static int secondMax(int nums[]){
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for(int i = 0; i< nums.length; i++){
            if(max < nums[i]){
                max = nums[i];
            }
        }
        for(int i = 0; i < nums.length; i++){
            if(nums[i]  > secondMax && nums[i] != max){
                secondMax = nums[i];
            }
        }
        return secondMax;
    }
    public static void main(String[] args) {
        int nums[] = {13, 34, 2, 34, 33, 1};
        System.out.println(secondMax(nums));
    }
}
