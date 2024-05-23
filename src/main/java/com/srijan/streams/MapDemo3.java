package com.srijan.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapDemo3 {
    public static void main(String[] args) {
        List<Integer> numberList = Arrays.asList(2, 3, 4, 5);
        List<Integer> multipliedList = new ArrayList<Integer>();

        multipliedList = numberList.stream().map(nums -> nums *3).collect(Collectors.toList());
        System.out.println(multipliedList);
    }
}
