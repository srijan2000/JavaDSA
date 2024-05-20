package com.srijan.java8.features;

import java.util.stream.IntStream;

public class Java7VsJava8Example {
    public static void main(String[] args) {
        int total = 0;
        for(int i = 0; i <= 50; i++){
            total += i;
        }
        System.out.println("Total is : " + total);
        // Java 8
        int total1 = IntStream.rangeClosed(0, 50)// range
                .map(Integer :: new)// looping
                .sum();// sum operation
        System.out.println("Total is : " + total1);

    }
}
