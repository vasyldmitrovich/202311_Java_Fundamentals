package com.softserve.edu10.hw.Task3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

public class App {
    public static void main(String[] args) {
        List<Student> studentsList = new ArrayList<>();
        studentsList.add(new Student("Maxim",2));
        studentsList.add(new Student("Mario",3));
        studentsList.add(new Student("Alex",1));
        studentsList.add(new Student("Fedor",2));
        studentsList.add(new Student("Ben",2));
        studentsList.add(new Student("Stefan",3));
        studentsList.add(new Student("Norman",1));
        studentsList.add(new Student("Oleg",2));


        System.out.println("Students from (for example 3rd) course");
        printStudents(studentsList,3);
        System.out.println("Students sorted by name");
        sortedPrint(studentsList, "Name");
        print(studentsList);
        System.out.println("Students sorted by course");
        sortedPrint(studentsList, "course");
        print(studentsList);
    }
    public static void printStudents(List<Student> studentsList, int currentCourse) {//Methods like that should be not here, should be in App.java class

        Iterator<Student> iterator = studentsList.iterator();
        boolean found = false;

        while (iterator.hasNext()){
            Student student = iterator.next();

            if(student.getCourse() == currentCourse){
                System.out.println(student.toString());
                found = true;
            }
        }
        if(!found){
            System.out.printf("Students from %d course not found",currentCourse);
        }
//        for (var student : studentsList){
//            if(student.getCourse() == currentCourse){
//                System.out.println(student.toString());
//            }//another method without iterator
//        }

    }
    public static void print(List<Student> studentsList){
        Iterator <Student> iterator = studentsList.iterator();

        while(iterator.hasNext()){
            Student student = iterator.next();
            System.out.println(student.toString());
        }
    }

    public static void sortedPrint(List<Student> studentsList, String input){

        switch (input.toLowerCase(Locale.ROOT)){
            case "name" -> studentsList.sort(Student.compareByName());
            case "course" -> studentsList.sort(Student.compareByCourse());
        }

    }
}
