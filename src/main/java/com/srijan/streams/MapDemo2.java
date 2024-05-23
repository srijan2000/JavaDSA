package com.srijan.streams;

import java.util.Arrays;
import java.util.List;

public class MapDemo2 {
    public static void main(String[] args) {
        List<String> vehicles = Arrays.asList("bus", "car", "bicycle" , "flight", "trian ");
        // Without using streams
        /*for (String name : vehicles){
            System.out.print(name.length() + " ");
        }*/

        // Using Streams
        vehicles.stream().map(vname -> vname.length()).forEach(System.out::println);
    }
}
