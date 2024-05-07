package com.srijan;

import java.util.Arrays;

public class NonZero {
    static int [] nonZero(int a[]){
        Arrays.sort(a);
        reverse(a,0, a.length-1);
        int L = 0;
        int R = a.length -1;
        int temp;
        while(L < R){
            if(a[R] == 0){
                R--;
            }
            else {
                temp = a[L];
                a[L] = a[R];
                a[R] = temp;
                L++;
                R--;

            }
        }
        return a;


    }

    static void reverse(int a[], int start, int end){
        int temp;
        while(start < end){
           temp = a[start];
           a[start] = a[end];
           a[end] = temp;
           start++;
           end--;
        }




    }
    public static void main(String[] args) {
        int a[] = {8, 1, 0, 2, 1, 0, 3};
        int sol[] = nonZero(a);
        for (int i = 0 ; i< sol.length; i++){
            System.out.print(sol[i] + " ");
        }
    }
}
