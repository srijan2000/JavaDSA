package com.srijan.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo2 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Melisandra", "Sansa", "Jon", "Daenerys", "Joffery");
        List<String> longnames = new ArrayList<String>();                // s -> sout(s)
      //  names.stream().filter(s -> s.length() > 4 && s.length() < 8).forEach(System.out::println);
        longnames = names.stream().filter(s->s.length() > 6 && s.length() < 8).collect(Collectors.toList());
        System.out.println(longnames);

    }
}
