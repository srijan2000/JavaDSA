package com.srijan.threads.print1to100;

public class Client {
    public static void main(String[] args) {
        for(int i = 1; i <= 100; i++){
            NumberPrinter nP = new NumberPrinter(i);
            Thread t = new Thread(nP);
            t.start();
        }
    }
}
