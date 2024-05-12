package com.srijan;

public class ZeroQueries {
    public int[] zeroQueries(int N, int [][]Q ){
        int []arr = new int[N];
        int query = Q.length;
        //this above statement will get the length of left [] which is it gets the no of rows ;

        for(int i = 0; i < query; i++){
            int s = Q[i][0];
            int v = Q[i][1];

            arr[s] = v;

        }
        int pref = arr[0];
        for(int i = 1; i < N; i++){
            pref += arr[i];
            arr[i] = pref;
        }
        return arr;

    }

    public static void main(String[] args) {
        int N = 8;
        int Q[][] ={
                {1, 3},
                {2, 4},
                {5,-1},
                {7, 9}
        };
        ZeroQueries z = new ZeroQueries();
        int arr[] = z.zeroQueries(N, Q);
        for(int i = 0; i< N; i++){
            System.out.print(arr[i] + " ");
        }


    }
}
