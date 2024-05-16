package com.srijan.threads.print1to100_1;

import com.srijan.threads.executorintro.NumberPrinter;

public class Client_1 {
    public static void main(String[] args) {
        for(int i = 1; i<= 100; i++){
            NumberPrinter_1 np = new NumberPrinter_1(i);
            Thread t = new Thread(np);
            t.start();
        }

    }
}
