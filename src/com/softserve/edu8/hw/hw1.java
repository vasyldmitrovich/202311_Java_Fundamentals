package com.softserve.edu8.hw;

public class hw1 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student student1 = new Student(new FullName("Vasya", "Pupkin"), 20, 4);
        Student student2 = (Student) student1.clone();

        student2.setCourse(5);
        System.out.println("student1:" + student1.info() + student1.activity());
        System.out.println("student2:" + student2.info() + student2.activity());
    }
}

