package com.srijan.threads.helloworldprinter;

public class Main {
    public static  void doSomething(){
        System.out.println("Printinh from doSomething : " + Thread.currentThread().getName());
    }
    public static void main(String[] args) {
        System.out.println("Hello world !");
        System.out.println(Thread.currentThread().getName());
        doSomething();
    }
}
