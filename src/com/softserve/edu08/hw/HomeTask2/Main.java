package com.softserve.edu08.hw.HomeTask2;

import com.softserve.edu08.hw.HomeTask1.FullName;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(new FullName("Lewis ", "Hamilton"), 36, 1));
        students.add(new Student(new FullName("Lando ", "Norris"), 20, 3));

        for (var student : students) {
            System.out.println(student.info());
        }

        students.add(students.get(0).clone());
        students.get(2).setCourse(5);

        System.out.println("======================");

        for (var student : students) {
            System.out.println(student.info());
        }


    }
}