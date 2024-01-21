package com.softserve.edu10.hw.task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import static com.softserve.edu10.hw.task3.Student.printStudents;
import static com.softserve.edu10.hw.task3.Student.sortByCourse;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Artur", 2));
        students.add(new Student("Maksym", 1));
        students.add(new Student("Vitaliy", 3));
        students.add(new Student("Anna", 2));
        students.add(new Student("Marta", 1));

        System.out.println("Sorted by names:");
        Collections.sort(students);
        students.forEach(s -> System.out.println(s.getName()));

        System.out.println("\nSorted by courses:");
        sortByCourse(students);
        students.forEach(s -> System.out.println(s.getName()));

        System.out.println("\nStudents in course 2:");
        printStudents(students, 2);
    }
}

class Student implements Comparable<Student> {
    private String name;
    private int course;

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public int getCourse() {
        return course;
    }

    public static void printStudents(List<Student> students, int targetCourse) {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getCourse() == targetCourse) {
                System.out.println(student.getName());
            }
        }
    }

    @Override
    public int compareTo(Student other) {
        return this.name.compareTo(other.name);
    }

    public static void sortByCourse(List<Student> students) {
        Collections.sort(students, (s1, s2) -> Integer.compare(s1.getCourse(), s2.getCourse()));
    }
}