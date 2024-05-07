package com.srijan;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum1 {
    static List<List<Integer>> threeSum(int nums[]){
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        //-4,-1,-1,0,1,2
        for(int i = 0; i < nums.length; i++){
            if(i !=0 && nums[i] == nums[i-1] ){
                continue;
            }
            int L = i+1;
            int R = nums.length - 1;

            while (L < R){

                if(nums[i] + nums[L] + nums[R] == 0){
                    List<Integer> subList = new ArrayList<>();
                    subList.add(nums[i]);
                    subList.add(nums[L]);
                    subList.add(nums[R]);
                    result.add(subList);
                    L++;
                    R--;
                    while( L<R && nums[L] == nums[L-1]){
                        L++;
                    }
                    while(L<R && nums[R] == nums[R+1]){
                        R--;
                    }
                } else if (nums[i] + nums[L] + nums[R] < 0) {
                    L++;

                }
                else {
                    R--;
                }

            }
        }
        return result;

    }
    public static void main(String[] args) {
        int nums[] = {-1,0,1,2,-1,-4};
        List<List<Integer>> sol =  threeSum(nums);
        for(List<Integer> Iterator : sol){
            System.out.print(Iterator + " ");
        }
    }
}
