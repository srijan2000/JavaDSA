package com.srijan.streams.streamMethod;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

//sorted
public class Demo1 {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(2, 4, 1, 3, 7, 5, 9);
        List<Integer> sortedList = list1.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedList);//ascending order

        List<Integer> reverseSortedList = list1.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(reverseSortedList);// Desceding order

        List<String> list2 = Arrays.asList("John", "Mary", "Kim", "David", "Smith");
        list2.stream().sorted().forEach(a -> System.out.print(a + " "));
        System.out.println();
        list2.stream().sorted(Comparator.reverseOrder()).forEach(a -> System.out.print(a + " "));



    }
}
