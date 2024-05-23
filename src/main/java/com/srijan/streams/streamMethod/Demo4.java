package com.srijan.streams.streamMethod;

import java.util.*;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo4 {
    public static void main(String[] args) {
        List<String> string1 = Arrays.asList("Srijan", "Venkat", "Anitha");
        List<String> string2 = Arrays.asList("Sam", "vashista", "Shiva");
        Stream<String> stream1 = string1.stream();
        Stream<String> stream2 = string2.stream();
       List<String> finalList =  Stream.concat(stream1, stream2).collect(Collectors.toList());
       for(String iteam : finalList){
           System.out.print(iteam + " ");
       }
    }
}
