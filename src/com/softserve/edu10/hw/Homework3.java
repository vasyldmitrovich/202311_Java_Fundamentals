package com.softserve.edu10.hw;

import java.util.*;

public class Homework3 {
    public static final Scanner SCANNER = new Scanner( System.in );

    public static void main(String[] args) {

        Student st1 = new Student("One", 1);
        Student st2 = new Student("Two", 2);
        Student st3 = new Student("Three", 3);
        Student st4 = new Student("Four", 1);
        Student st5 = new Student("Five", 2);
        Student st6 = new Student("Six", 3);
        Student st7 = new Student("Seven", 1);
        Student st8 = new Student("Eight", 2);

        List<Student> studentList = new ArrayList<>();
        studentList.add(st1);
        studentList.add(st2);
        studentList.add(st3);
        studentList.add(st4);
        studentList.add(st5);
        studentList.add(st6);
        studentList.add(st7);
        studentList.add(st8);

        System.out.print("User, enter number of the course [1, 2, 3]: ");
        int courseNum = SCANNER.nextInt();

        Student.printStudents(studentList, courseNum);

        System.out.println("\nStudent list sorted by name: ");
        studentList.sort(new StudentNameComparator());
        for(var st: studentList ) {
            System.out.println(st);
        }

        System.out.println("\nStudent list sorted by course: ");
        studentList.sort(new StudentCourseComparator());
        for(var st: studentList ) {
            System.out.println(st);
        }
    }
}
class Student {
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

    @Override
    public String toString() {
        return "Student " + name +
                ", course " + course;
    }

    public static void printStudents(List<Student> students, int courseNumber) {

        Iterator<Student> iterator = students.iterator();

        while( iterator.hasNext() ) {
            Student st = iterator.next();
            if( st.getCourse() == courseNumber ) {
                System.out.println(st);
            }
        }
    }
}
class StudentNameComparator implements Comparator<Student> {
    @Override
    public int compare(Student firstStudent, Student secondStudent) {
        return firstStudent.getName().compareTo(secondStudent.getName());
    }
}

class StudentCourseComparator implements Comparator<Student> {
    @Override
    public int compare(Student firstStudent, Student secondStudent) {
        int result = firstStudent.getCourse() - secondStudent.getCourse();
        if( result == 0 ) {
            result = firstStudent.getName().compareTo(secondStudent.getName());
        }
        return result;
    }
}
