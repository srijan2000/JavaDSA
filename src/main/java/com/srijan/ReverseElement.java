package com.srijan;

public class ReverseElement {
    static void reverse(int nums[], int start, int end){
        int temp;
        for(int i =0; i< nums.length -1; i++){
            while(start< end){
                 temp = nums[start];
                 nums[start] = nums[end];
                 nums[end] = temp;
                 start++;
                 end--;

            }

        }
        for(int i = 0; i< nums.length; i++){
            System.out.print(nums[i] + " ");
        }

    }
    public static void main(String[] args) {

        int nums[] = { 2, 11, 5, 10, 7, 8};
        reverse(nums,0, nums.length-1);
    }
}
