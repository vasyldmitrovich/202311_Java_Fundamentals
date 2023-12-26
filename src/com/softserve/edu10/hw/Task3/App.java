package com.softserve.edu10.hw.Task3;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Student> studentsList = new ArrayList<>();
        studentsList.add(new Student("Maxim",2));
        studentsList.add(new Student("Mario",3));
        studentsList.add(new Student("Alex",1));
        studentsList.add(new Student("Fedor",2));
        studentsList.add(new Student("Ben",2));
        studentsList.add(new Student("Stefan",3));
        studentsList.add(new Student("Norman",1));
        studentsList.add(new Student("Oleg",2));


        System.out.println("Students from (for example 3rd) course");
        Student.printStudents(studentsList,3);
        System.out.println("Students sorted by name");
        Student.sortedPrint(studentsList, "Name");
        Student.print(studentsList);
        System.out.println("Students sorted by course");
        Student.sortedPrint(studentsList, "course");
        Student.print(studentsList);
    }
}
