package com.srijan.streams.streamMethod;
//anyMatch()
//allMatch()
//noneMatch()

import java.util.HashSet;
import java.util.Set;

public class Demo2 {
    public static void main(String[] args) {
        Set<String> fruites = new HashSet<String>();
        fruites.add("One apple");
        fruites.add("One mango");
        fruites.add("Two apples");
        fruites.add("More grapes");
        fruites.add("Two guavas");

        boolean result = fruites.stream().anyMatch(value -> {return value.startsWith("One");});
        System.out.println(result);

        result = fruites.stream().allMatch(value -> {return value.startsWith("One");});
        System.out.println(result);

        result = fruites.stream().noneMatch(value -> {return value.startsWith("One");});
        System.out.println(result);
    }
}
