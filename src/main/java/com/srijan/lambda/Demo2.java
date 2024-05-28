package com.srijan.lambda;

import java.util.ArrayList;
import java.util.function.Predicate;

class Employee{
    String ename;
    int salary;
    int experience;
    Employee(String name, int sal, int experience){
        this.ename = name;
        this.salary = sal;
        this.experience = experience;
    }

}
public class Demo2 {
    public static void main(String[] args) {
        Employee emp = new Employee("John", 50000,5);

        Predicate<Employee> pr = e -> (e.salary > 30000 && e.experience > 3);
        System.out.println(pr.test(emp));

        ArrayList<Employee> a1 = new ArrayList<>();
        a1.add(new Employee("John", 50000, 5));
        a1.add(new Employee("David", 20000, 2));
        a1.add(new Employee("Scott", 30000, 3));
        a1.add(new Employee("Scott", 40000, 6));
        for(Employee e : a1){
            if(pr.test(e)){
                System.out.println(e.ename + " " + e.salary);
            }
        }
    }
}
