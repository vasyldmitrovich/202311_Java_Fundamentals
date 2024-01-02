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


    public static void printStudents(List<Student> studentsList, int currentCourse) {//Methods like that should be not here, should be in App.java class

        Iterator<Student> iterator = studentsList.iterator();
        boolean found = false;

        while (iterator.hasNext()){
            Student student = iterator.next();

            if(student.course == currentCourse){
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

    //And next two methods too
    public static void print(List<Student> studentsList){
        Iterator <Student> iterator = studentsList.iterator();

        while(iterator.hasNext()){
            Student student = iterator.next();
            System.out.println(student.toString());
        }
    }

    public static void sortedPrint(List<Student> studentsList, String input){

        switch (input.toLowerCase(Locale.ROOT)){
            case "name" -> studentsList.sort(compareByName());
            case "course" -> studentsList.sort(compareByCourse());
        }

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
