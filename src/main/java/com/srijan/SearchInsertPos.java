package com.srijan;
// Given a sorted array of distinct integers and a target value,
//return the index if the target is found. if not, return the index
//where it would be if it were inserted in order
// The algorithm should run in O(log n) time
public class SearchInsertPos {
    public static int searchInsert(int[] arr, int target){
        int low = 0;
        int high = arr.length -1;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(arr[mid] == target){
                return mid;
            }
            if(arr[mid] < target){
                low = mid + 1;
            }else{
                high = mid-1;
            }
        }
        return low;

    }

    public static void main(String[] args) {
        int[] arr = {1, 10, 20, 47, 59, 65, 75, 88, 99};
        int target = 66;
        System.out.println(searchInsert(arr, target));
    }
}
