package com.srijan.Lambda;
import java.util.ArrayList;
import java.util.function.Function;

class Employee1{
    String ename;
    int salary;

    Employee1(String name, int salary){
        this.ename = name;
        this.salary = salary;
    }
}
public class Function1 {
    public static void main(String[] args) {
       /* Function<Integer, Integer> f = i -> i*i;
        System.out.println(f.apply(5));

        Function<String, Integer> fn = s -> s.length();
        System.out.println(fn.apply("Welcome"));
*/
        ArrayList<Employee1> employee1s = new ArrayList<Employee1>();
        employee1s.add(new Employee1("David", 50000));
        employee1s.add(new Employee1("John", 20000));

        Function<Employee1, Integer> fn = e ->{
            int sal = e.salary;
            if(sal >= 10000 && sal <= 20000){
                return (sal * 10/100);
            }else if(sal > 20000 && sal <= 30000){
                return (sal * 20/100);
            }else if(sal > 30000 && sal <= 50000){
                return (sal * 30/100);
            }else{
                return (sal * 40/100);
            }
        };
        for(Employee1 employee1 : employee1s){
            System.out.println(fn.apply(employee1));
        }
    }
}
