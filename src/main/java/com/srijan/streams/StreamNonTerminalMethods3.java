package com.srijan.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamNonTerminalMethods3 {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("A","B","C","D","1","2", "3");
        Optional<String> reduced = stringList.stream().reduce((value, combinedValue)->{
            return combinedValue + value;
        });
        System.out.println(reduced.get());
    }
}
