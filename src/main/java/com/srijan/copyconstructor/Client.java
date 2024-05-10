package com.srijan.copyconstructor;

public class Client {
    public static void main(String[] args) {
        Student student = new Student();
        student.name = "aditya";
        student.age = 98;
        student.batch = "May 23";

        Student s1 = new Student(student);
    }
}
