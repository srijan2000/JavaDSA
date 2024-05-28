package com.srijan.java8.features;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Developer {
    String name;
    long salary;
    int age;

    Developer(String name, long salary, int age){
        this.name = name;
        this.salary = salary;
        this.age = age;

    }
   public String getName(){
        return name;
    }
    public long getSalary(){
        return salary;
    }
    public int getAge(){
        return age;
    }
    private static List<Developer> getDevelopers(){
        List<Developer> result = new ArrayList<>();
        result.add(new Developer("mkyong",70000, 33));
        result.add(new Developer("alvin", 80000, 20));
        result.add(new Developer("jason", 100000, 10));
        result.add(new Developer("iris", 170000, 55));

        return result;
    }

    public static void main(String[] args) {

        List<Developer> listDevs = getDevelopers();

        System.out.println("Before Sort : ");
        for (Developer developer : listDevs) {
            System.out.println(developer.getName() + ", " + developer.getAge() + ", " + developer.getSalary());
        }
        System.out.println();

       /* Collections.sort(listDevs, new Comparator<Developer>() {
            @Override
            public int compare(Developer o1, Developer o2) {
                return o1.getAge()- o2.getAge();
            }
        });
        System.out.println("After Sort : ");
        for(Developer dev : listDevs){
            System.out.println(dev.getName() + ", " + dev.getAge()+ ", "+ dev.getSalary());
        }*/

       /* Collections.sort(listDevs, new Comparator<Developer>() {
            @Override
            public int compare(Developer o1, Developer o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });*/

        listDevs.sort((o1, o2) -> o1.getAge() - o2.getAge());
        System.out.println("After Sort by Age : ");
        for (Developer dev : listDevs) {
            System.out.println(dev.getName() + ", " + dev.getAge() + ", " + dev.getSalary());
        }
        System.out.println();

        listDevs.sort((o1, o2) -> o1.getName().compareTo(o2.getName()));
        System.out.println("After Sort by Name : ");
        for (Developer dev : listDevs) {
            System.out.println(dev.getName() + ", " + dev.getAge() + ", " + dev.getSalary());
        }


    }


}
