package com.softserve.edu10.hw.hw3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class hw3 {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Bob", 3));
        students.add(new Student("Alex", 2));
        students.add(new Student("Alice", 4));
        students.add(new Student("Mark", 5));
        students.add(new Student("Lee", 2));
        System.out.println(students);

        Student.printStudents(students,2);

        Collections.sort(students);
        System.out.println(students);

    }
}
