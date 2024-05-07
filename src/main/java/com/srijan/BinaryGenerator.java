package com.srijan;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryGenerator {
    static String[] generateBinaryNumber(int n){
        String[] result = new String[n];
        Queue<String> q = new LinkedList<>();

        q.offer("1");
        for(int i =0; i < n; i++){
            result[i] = q.poll();
            String n1 = result[i] + "0";
            String n2 = result[i] + "1";
            q.offer(n1);
            q.offer(n2);
        }
        return result;


    }

    public static void main(String[] args) {
        int n = 9;
        String result[] = generateBinaryNumber(n);
        System.out.print("{");
        for(int i = 0; i< n; i++){
            if(i < n-1){
                System.out.print( result[i] + ", ");
            }
            else {
                System.out.print(result[i]);
            }

        }
        System.out.print("}");
    }
}
