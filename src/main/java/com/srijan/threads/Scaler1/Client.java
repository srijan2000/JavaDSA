package com.srijan.threads.Scaler1;

import com.srijan.threads.Scaler.ScalerThread;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        Adder a = new Adder(x, y);
        ScalerThread s1 = new ScalerThread(a);
        s1.start();

    }
}
