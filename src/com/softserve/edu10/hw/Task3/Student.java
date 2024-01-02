package com.softserve.edu10.hw.Task3;

import java.util.*;

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

    public int getCourse() {
        return course;
    }

    @Override
    public String toString() {
        return "Name = " + name +
                ", Course = " + course;
    }

    public static Comparator<Student> compareByName(){
        return Comparator.comparing(Student::getName);
    }
    public static Comparator<Student> compareByCourse(){
        return Comparator.comparingInt(Student::getCourse);
    }

}
