package com.softserve.edu08.hw;

public class Homework {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student[] students = {
            new Student( new FullName( "Pepita", "Jimenez" ), 46, 3),
            new Student( new FullName( "Pedro", "Sanchez" ), 78, 2),
        };

        System.out.println("Output prior to the cloning exercise:\n");
        for( Student s: students ) {
            System.out.println(s.info());
            System.out.println(s.activity());
            System.out.println();
        }

        Student oneMoreStudent = students[0].clone();
        oneMoreStudent.setCourse(5);

        System.out.println("Output after the cloning:\n");
        for( Student s: students ) {
            System.out.println(s.info());
            System.out.println(s.activity());
            System.out.println();
        }
        System.out.println(oneMoreStudent.info());
        System.out.println(oneMoreStudent.activity());
    }
}
