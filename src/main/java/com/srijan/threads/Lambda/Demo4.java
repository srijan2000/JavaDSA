package com.srijan.threads.Lambda;


import java.util.function.Consumer;

public class Demo4 {
    public static void main(String[] args) {
        Consumer<String> c = s-> System.out.println(s);
        c.accept("Welcome ");
    }
}
