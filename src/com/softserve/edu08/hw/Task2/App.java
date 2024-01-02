package com.softserve.edu08.hw.Task2;

import com.softserve.edu08.hw.Task1.FullName;
import com.softserve.edu08.hw.Task1.Person;

public class App{//Ok
    public static void main(String[] args) throws CloneNotSupportedException {

        Student firstStudent = new Student(new FullName("Jora","Revazov"),19,2);
        Student secondStudent = new Student(new FullName("Kira","Lazarova"),21,4);
        Student cloneStudent = (Student) firstStudent.clone();
        cloneStudent.setCourse(5);


        Student[] students = new Student[]{
                firstStudent,secondStudent,cloneStudent
        };

        for (var student : students)
        {
            System.out.println(student.info());
            System.out.println(student.activity());
        }




    }
}
