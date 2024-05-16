package com.srijan.threads.helloworldprinter1;

public class Main1 {
    public static void doSomething(){
        System.out.println("Get this Thread : " + Thread.currentThread().getName());

    }

    public static void main(String[] args) {
        System.out.println("Hello World !");
        System.out.println(Thread.currentThread().getName());
        doSomething();
    }
}
