package com.srijan.threads.Scaler;

import java.util.HashMap;

public class ScalerThread extends Thread{
    public static HashMap<String, String> map = new HashMap<>();
    private String target;

    public ScalerThread(Runnable r){
        super(r);
        target = r.getClass().getName();
    }

    public void start(){
        super.start();
        map.put(target, this.getName());
    }
}
