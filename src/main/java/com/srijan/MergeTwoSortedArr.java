package com.srijan;

public class MergeTwoSortedArr {
    public static int[] merge(int [] arr1, int[] arr2, int n, int m){
        int [] result = new int[n + m];
        int i = 0;
        int j = 0;
        int k = 0;
        while(i < n && j< m && k <(m+n)){
            if(arr1[i] < arr2[j]){
                result [k] = arr1[i];
                i++;

            }else {
                result[k] = arr2[j];
                j++;

            }
            k++;
        }
        while (i < n && k <(m+n) ){
            result [k] = arr1[i];
            i++;
            k++;
        }
        while (j < m && k <(m+n)){
            result[k] = arr2[j];
            j++;
            k++;
        }
        return result;


    }

    public static void main(String[] args) {
        int[] arr1 = {2, 3, 5, 10, 0, 0};
        int[] arr2 = {4, 6, 11, 15};
        int n = 4;
        int m = 4;
        int[] result = merge(arr1, arr2, n, m);
        for(int i = 0; i< result.length; i++){
            System.out.print(result[i] + " ");
        }

    }
}
