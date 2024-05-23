package com.srijan.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Employee{
    int empId;
    String empName;
    int salary;

    Employee(int empId, String empName, int salary){
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
    }
}
public class Demo4_Filter_Map {
    public static void main(String[] args) {
       /* List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(101, "Alex", 10000));
        employeeList.add(new Employee(102, "Brian", 10000));
        employeeList.add(new Employee(103,"Charles", 30000 ));
        employeeList.add(new Employee(104,"David", 40000));
*/

        List<Employee> employeesList = Arrays.asList(
                new Employee(101, "Alex", 10000),
                new Employee(102, "Brian", 20000),
                new Employee(103, "Charles", 30000),
                new Employee(104, "David", 40000)
        );
        // Combination of filter and map
        List<Integer> employeeSalList = employeesList.stream()
                .filter(e -> e.salary > 20000)// Predicate
                .map( e -> e.salary)// Function
                .collect(Collectors.toList());

        System.out.println(employeeSalList);


     }
}
