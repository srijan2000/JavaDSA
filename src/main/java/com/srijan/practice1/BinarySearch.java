package com.srijan.practice1;

public class BinarySearch {
    public static int search(int[] nums, int key){
        int low = 0;
        int high = nums.length -1;
        while(low <= high){
            int mid =  (low + high)/2;
            if(nums[mid] == key){
                return mid;
            }
            if(nums[mid] < key){
                low = mid -1;
            }else{
                high = mid- 1;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        int []nums = {1, 10, 20, 47, 59, 65, 75, 88, 99};
        int key = 65;

        System.out.println(search(nums, key));
    }
}
