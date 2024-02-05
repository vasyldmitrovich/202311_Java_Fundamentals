package com.softserve.edu10.hw.homeTask03;

import java.util.Comparator;
import java.util.List;

public class Student {
    private String name;
    private int course;

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public static void printStudents(List<Student> students, int course){
        for (var student : students){
            if(student.getCourse() == course){
                System.out.println(student.getName());
            }
        }
    }

    public static void sortByNames(List<Student> students){
        students.sort(Comparator.comparing(Student::getName));
    }

    public static void sortByCourse(List<Student> students){
        students.sort(Comparator.comparing(Student::getCourse));
    }

    @Override
    public String toString() {
        return "[" +
                name +
                " " + course +
                ']';
    }
}
