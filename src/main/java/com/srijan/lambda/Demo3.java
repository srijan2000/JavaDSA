package com.srijan.lambda;

import java.util.Date;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Demo3 {

    public static void main(String[] args) {

        /*Function<Integer, Integer> f1 = n -> n * 2;
        Function<Integer, Integer> f2 = n -> n * n * n;
        System.out.println(f1.andThen(f2).apply(2));
        System.out.println(f1.compose(f2).apply(2));*/

        Consumer<String> c1 = s -> System.out.println(s+ " " + "Is white ");
        Consumer<String> c2 = s-> System.out.println(s + " "+ "is having four legs ");
        Consumer<String> c3 = s-> System.out.println(s + " " + "is eating grass ");

        c1.andThen(c2).andThen(c3).accept("Cow");

        Supplier<Date> s = ()-> new Date();
        System.out.println(s.get());
    }
}
