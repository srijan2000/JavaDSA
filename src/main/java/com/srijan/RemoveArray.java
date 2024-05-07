package com.srijan;

public class RemoveArray {
    static int RemoveArray(int nums[]){
        int n = nums.length;
        int L = 0;
        int R = 1;

        while(R < n){
            if(nums[L] != nums[R]){
                L++;
                nums[L] = nums[R];
            }
            R++;
        }


        return L+1;

    }

    public static void main(String[] args) {
        int nums[] = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4, 5};
        int result = RemoveArray(nums);
        System.out.print("Unique Elements : ");
        for(int i = 0; i< result; i++){
            System.out.print(nums[i] + " ");
        }
    }
}
