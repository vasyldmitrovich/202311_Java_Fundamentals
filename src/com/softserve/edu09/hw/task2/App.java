package com.softserve.edu09.hw.task2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        Student student1 = new Student("Petro", "2", 1);
        HashMap<String, Integer> grades = new HashMap<String, Integer>();
        grades.put("mathematics", 5);
        grades.put("english language", 5);
        grades.put("ukrainian language", 5);
        student1.setGrades(grades);
        students.add(student1);

        Student student2 = new Student("Vasil", "3", 2);
        HashMap<String, Integer> grades2 = new HashMap<String, Integer>();
        grades2.put("mathematics", 4);
        grades2.put("english language", 3);
        grades2.put("ukrainian language", 5);
        student2.setGrades(grades2);
        students.add(student2);

        Student student3 = new Student("Dmitro", "2", 3);
        HashMap<String, Integer> grades3 = new HashMap<String, Integer>();
        grades3.put("mathematics", 3);
        grades3.put("english language", 3);
        grades3.put("ukrainian language", 2);
        student3.setGrades(grades3);
        students.add(student3);

        Student student4 = new Student("Volodimir", "2", 1);
        HashMap<String, Integer> grades4 = new HashMap<String, Integer>();
        grades4.put("mathematics", 5);
        grades4.put("english language", 5);
        grades4.put("ukrainian language", 5);
        student4.setGrades(grades);
        students.add(student4);

        for (Student st : students) {
            System.out.println(st);
        }
        students = Student.checking(students);
        System.out.println("=======================================================================");
        for (Student st : students) {
            System.out.println(st);
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter course's number: ");
        int course = Integer.parseInt(scanner.nextLine());
        Student.printStudents(students, course);

    }
}
