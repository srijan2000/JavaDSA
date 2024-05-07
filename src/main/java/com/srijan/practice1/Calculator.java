package com.srijan.practice1;

public class Calculator {

    public int sum(int a, int b){
        return a + b;
    }

    public int division(int a, int b){
        if(b == 0){
            throw new ArithmeticException("b should be zero");
        }
        return a / b;
    }
}
