package com.srijan;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSumII {
    static List<List<Integer>> threeSumm(int nums[]){
        Arrays.sort(nums);
        //-4,-1,-1,0,1,2
        List<List<Integer>> res = new ArrayList<>();
        for(int i = 0; i< nums.length; i++){
            int L = i+1;
            int R = nums.length-1;
            if(i !=0 && nums[i] == nums[i-1]){
                continue;
            }
            while (L < R){
                if (nums[i] + nums[L] + nums[R] == 0) {
                    List<Integer> subList = new ArrayList<>();
                    subList.add(nums[i]);
                    subList.add(nums[L]);
                    subList.add(nums[R]);
                    res.add(subList);
                    L++;
                    R--;
                    while(L < R && nums[L] == nums[L-1]){
                        L++;

                    }
                    while(L < R && nums[R] == nums[R+1]){
                        R--;

                    }


                }
                else if(nums[i] + nums[L] + nums[R] < 0){
                    L++;
                }
                else {
                    R--;
                }

            }
        }
        return res;

    }
    public static void main(String[] args) {
        int nums[] = {-1,0,1,2,-1,-4};
        List<List<Integer>> sol = threeSumm(nums);
        for (List<Integer> iterate : sol){
            System.out.println(iterate);
        }
    }
}
