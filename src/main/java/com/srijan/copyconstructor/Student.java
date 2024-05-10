package com.srijan.copyconstructor;

public class Student {
    public String name;
    public int age;
    public String batch;

    public Student(Student st){
        this.name = st.name;
        this.age = st.age;
        this.batch = st.batch;
    }
    public Student(){

    }
}
