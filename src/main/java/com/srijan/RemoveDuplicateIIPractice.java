package com.srijan;

public class RemoveDuplicateIIPractice {
    static int remove(int nums[]){
        int L = 0;
        int R = 1;
        int n = nums.length;
        int count = 0;
        while(R < n){
            if(nums[L] == nums[R] && count < 1 ){
                count++;
                L++;
                nums[L] = nums[R];
            }else if(nums[L] != nums[R]){
                count = 0;
                L++;
                nums[L] = nums[R];
            }
            R++;


        }
        return L+1;

    }
    public static void main(String[] args) {
        int nums[] = {0,0,1,1,1,1,2,3,3};
        int n = remove(nums);
        for(int i = 0; i<n ; i++ ){
            System.out.print(nums[i] + " ");
        }

    }
}
