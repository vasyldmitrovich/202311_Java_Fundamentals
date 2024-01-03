package com.softserve.edu10.hw.task3;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student("Petro", 5));
        students.add(new Student("Vadim", 4));
        students.add(new Student("Dmitro", 5));
        students.add(new Student("Olena", 3));
        students.add(new Student("Semen", 2));
        students.add(new Student("Orest", 1));

        students.sort(Student::compareByCourse);
        for (var st : students) {
            System.out.println(st);
        }

        System.out.println("=======================================");
        students.sort(Student::compareByName);
        for (var st : students) {
            System.out.println(st);
        }

        System.out.println("=======================================");
        Student.printStudents(students, 5);
    }
}
