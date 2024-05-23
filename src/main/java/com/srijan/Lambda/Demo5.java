package com.srijan.Lambda;


import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class Employee2{
    String ename;
    int salary;
    String gender;

    Employee2(String ename, int salary, String gender){
        this.ename = ename;
        this.salary = salary;
        this.gender = gender;
    }

}
public class Demo5 {
    public static void main(String[] args) {
        ArrayList<Employee2> emplist = new ArrayList<Employee2>();
        emplist.add(new Employee2("David", 50000, "Male"));
        emplist.add(new Employee2("John", 30000, "Male"));
        emplist.add(new Employee2("Mary", 20000,"Female"));
        emplist.add(new Employee2("Scott", 60000, "Male"));

        Function<Employee2, Integer> function = e -> (
            (e.salary*10)/100
        );


        Predicate<Integer> predicate = (a)-> a >=5000;

        Consumer<Employee2> c = (emp) ->{
            System.out.println(emp.ename);
            System.out.println(emp.salary);
            System.out.println(emp.gender);
        };

        for (Employee2 e : emplist){
            System.out.println(function.apply(e));
            predicate.test(e.salary);
            c.accept(e);
        }


    }

}
