package com.srijan;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public static int threeSumSmaller(int nums[], int target){

        Arrays.sort(nums);
        int n = nums.length;
        int counter = 0;
        for(int i = 0; i < n; i++){
            int L = i+1;
            int R = n-1;


            while(L < R){
                int curSum = nums[i] + nums[L]+ nums[R];
                List<Integer> sub = new ArrayList<>();
                if(curSum < target){
                    counter += (R-L);
                    L++;
                } else  {
                    R--;
                }
            }
        }
        return  counter;

    }
    public static void main(String[] args) {
        int nums[] = {-2,0,1,3};
        int target = 2;

     /*   List<List<Integer>> Solution = threeSumSmaller(nums, target);
        for(List<Integer> iterator : Solution){
            System.out.println(iterator);
        }
*/
        System.out.print(threeSumSmaller(nums, target));
    }
}
