package com.srijan.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamNonTerminalMethods2 {
    public static void main(String[] args) {
        List<Integer> numbersList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        //count()
        long numberOfEvenNumbers = numbersList.stream().filter(n -> n % 2 == 0).count();
        System.out.println(numberOfEvenNumbers);

        Optional<Integer> min = numbersList.stream().min((val1, val2) -> {
            return val1.compareTo(val2);
        });
        System.out.println(min.get());



    }
}
