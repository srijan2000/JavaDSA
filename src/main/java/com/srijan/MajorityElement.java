package com.srijan;

public class MajorityElement {
    public static void main(String[] args) {
        int nums[] = {3, 2, 3};
        int sol =  MajorElement(nums);
        System.out.println("Major Element : "+ sol);

    }
    static int MajorElement(int []nums){
        int cand = 0;
        int count = 0;
        for(int i = 0; i< nums.length; i++){
            if(count == 0){
                cand = nums[i];

            } else if (cand == nums[i]) {
                count++;
            }else {
                count --;
            }
        }
        return cand;

    }
}
