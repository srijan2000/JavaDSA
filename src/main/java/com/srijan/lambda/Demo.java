package com.srijan.lambda;
import java.util.function.Predicate;

public class Demo {

    public static void main(String[] args) {
        Predicate<Integer> p = i ->(i > 10);
        System.out.println(p.test(20));

        Predicate<String> pr = (s)->(s.length() >4);
        System.out.println(pr.test("Welcome"));
        System.out.println(pr.test("xyz"));

        String names[] = {"David", "Scott", "Smith", "John", "Mary"};
        for(String name : names){
            if(pr.test(name)){
                System.out.println(name);
            }
        }
    }
}
