package com.softserve.edu09.hw.task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student("Artur", "A", 1, Arrays.asList(5, 5, 5)));
        students.add(new Student("Maksym", "B", 1, Arrays.asList(3, 4, 5)));
        students.add(new Student("Anna", "C", 2, Arrays.asList(4, 4, 4)));

        students.removeIf(student -> student.getAverageGrade() < 3);

        for (Student student : students) {
            if (student.getCourse() == 2) {
                System.out.println(student.getName());
            }
        }
    }
}
