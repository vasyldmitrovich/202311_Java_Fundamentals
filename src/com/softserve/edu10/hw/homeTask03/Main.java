package com.softserve.edu10.hw.homeTask03;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("John", 2));
        students.add(new Student("Alex", 2));
        students.add(new Student("Yan", 3));
        students.add(new Student("Lewis", 1));
        students.add(new Student("Bob", 4));

        Student.printStudents(students, 2);

        Student.sortByNames(students);
        System.out.println("Sorted by name: " + students);
        Student.sortByCourse(students);
        System.out.println("Sorted by course: " + students);





    }
}
