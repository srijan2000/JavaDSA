package com.srijan;


import java.util.*;


public class ThreeSum {
    public static List<List<Integer>> threeSum(int[] nums){
        Arrays.sort(nums);
        List<List<Integer>>res = new ArrayList<>();
        //-4,-1,-1,0,1,2
        for(int i = 0; i < nums.length; i++){
            if(i !=0 && nums[i] == nums[i-1]){
                continue;
            }
            int L = i+1;
            int R = nums.length-1;
            while(L<R){
                if(nums[i] + nums[L] + nums[R] == 0){
                    List<Integer> sub = new ArrayList<>();
                    sub.add(nums[i]);
                    sub.add(nums[L]);
                    sub.add(nums[R]);
                    res.add(sub);

                    L++;
                    R--;
                    while(L < R && nums[L] ==nums[L+1]){
                        L++;
                    }
                    while(L < R && nums[R] ==nums[R-1]){
                        R--;
                    }

                }

                else if (nums[i] + nums[L] + nums[R] < 0){
                    L++;
                }
                else{
                    R--;
                }
            }

        }
        return res;

    }

    public static void main(String[] args) {
        int nums[] = {-1,0,1,2,-1,-4};
        List<List<Integer>> Solution = threeSum(nums);
        for(List<Integer> triplet : Solution) {
            System.out.println(triplet);
        }

    }
}
