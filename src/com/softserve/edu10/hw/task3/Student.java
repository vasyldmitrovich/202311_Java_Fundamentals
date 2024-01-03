package com.softserve.edu10.hw.task3;

import java.util.Iterator;
import java.util.List;

public class Student {
    private String name;
    private int course;

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

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }

    public static void printStudents(List<Student> students, int course) {
        Iterator<Student> iterator = students.listIterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getCourse() == course) {
                System.out.println(student.name);
            }
        }

    }

    public int compareByName(Student other) {
        return this.getName().compareTo(other.getName());
    }

    public int compareByCourse(Student other) {
        return this.getCourse() - other.getCourse();
    }
}
