package com.srijan.java8.features;

import java.util.*;

public class LoopMapClassic {
    public static void main(String[] args){
        Map<String, Integer> map = new HashMap<>();
        /*
        map.put("A", 10);
        map.put("B", 20);
        map.put("C", 30);
        map.put("D", 40);
        map.put("E", 50);
        map.put("F", 60);
        *//*for(Map.Entry<String, Integer> entry : map.entrySet()*//**//* THe method returns a set of key - value mappings  *//**//*){
            System.out.println("Key : " + entry.getKey() + ", Value : " + entry.getValue());
        }*//*


        map.forEach((k, v) -> System.out.println("Key : " + k + ", Value : " + v));
        */
        /*map.put("A", 10);
        map.put("B", 20);
        map.put("C", 30);
        map.put(null, 40);
        map.put("E", null);
        map.put("F", 60);

        if(map != null){
            map.forEach((k, v) -> System.out.println("Key : " + k + ", Value : " + v));
        }
        System.out.println();
        System.out.println();
        map.forEach((k, v)-> {
            if(k != null){
                System.out.println("Key : " + k + ", Value : " + v);
            }
        });
        */
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add(null);
        list.add("D");
        list.add("E");

        list.stream()
                .filter(Objects :: nonNull)
                .forEach(System.out::println);

    }
}
