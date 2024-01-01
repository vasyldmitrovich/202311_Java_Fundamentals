package com.softserve.edu10.hw.hw3;

import java.util.List;

class Student implements Comparable <Student>{
    String name;
    Integer course;

    public static void printStudents(List<Student> listStudents, int course) {
        for (Student student : listStudents) {
            if (student.getCourse() == course) {
                System.out.println(student.getName());
            }
        }
    }



    public void setName(String name) {
        this.name = name;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public int getCourse() {
        return course;
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

    @Override
    public int compareTo(Student o) {

        int result = this.name.compareTo(o.name);


        if (result == 0) {
            result = this.course.compareTo(o.course);
        }
        return result;
    }
}
