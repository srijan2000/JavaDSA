package com.srijan.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Student{
    String sname;
    int sid;
    char grade;

    Student(String sname, int sid, char grade){
        this.sname = sname;
        this.sid = sid;
        this.grade = grade;
    }
}
public class FlatMapDemo3 {
    public static void main(String[] args) {
       // List<Student> list1 = Arrays.asList(new Student("Smith", 101, 'A'), new Student("Sam", 102, 'B'), new Student("Manuala", 103, 'C'));

        List<Student> studentList1 = new ArrayList<Student>();
        studentList1.add(new Student("Smith", 101, 'A'));
        studentList1.add(new Student("John", 102,'B'));
        studentList1.add(new Student("Kenedy", 103, 'C'));

        List<Student> studentList2 = new ArrayList<Student>();
        studentList2.add(new Student("Scott", 104, 'A'));
        studentList2.add(new Student("Mary", 105,'B'));
        studentList2.add(new Student("Kitty", 106, 'C'));

        List<List<Student>> studentList = Arrays.asList(studentList1, studentList2);
        //Before Java 8
        for( List<Student>student:studentList){
            for (Student studentName : student){
                System.out.println(studentName.sname);
            }
        }

       /* List<String> StudenName = studentList.stream().flatMap(x -> x.stream()).map(s -> s.sname).collect(Collectors.toList());
        System.out.println(StudenName);*/

    }
}
