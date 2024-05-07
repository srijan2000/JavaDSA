package com.srijan;

public class RemoveDuplicates {
    public static int removeDuplicates(int nums[]){
        int L =0;
        int R = 1;
        int n = nums.length ;

        while(R < n ){
            if(nums[L] == nums[R]){
                R++;
            }
            else{
                L++;
                nums[L] = nums[R];
                R++;
            }
        }
        return L+1;

    }

    public static void main(String[] args) {
        int nums[] = {0,0,1,1,1,2,2,3,3,4};
        int k = removeDuplicates(nums);
        for(int i = 0 ;i< k; i++ ){
            System.out.print(nums[i] + " ");
        }


        //0,0,1,1,1,2,2,3,3,4

    }
}
