package com.srijan.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo {

    public static void main(String[] args) {
        List<String> words = Arrays.asList("Cup", null, "Forest", "Sky", "Book", null,"Theatre");
        List<String>result =  words.stream().filter(s -> s != null).collect(Collectors.toList());
        System.out.println(result);
    }
}
