package com.softserve.edu09.hw;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Homework2 {
    public static final Scanner SCANNER = new Scanner( System.in );

    public static void main(String[] args) {

        // below is a "database" from which the Random method will create our students
        String[] names = {"Pacheco", "Pablo", "Pedro", "Pepita", "Mercedes", "Juan", "Maria", "Mariana", "Iker", "Roberto", "Perfecta",
                "Juana", "Esmeralda", "Nataly", "Ignacio"};
        int[] courses = {1, 2, 3, 4, 5};
        int[] groups = {11, 12, 13};
        double[] grades = {2, 3, 4, 5};

        var rnd = new Random();

        // Create a collection that holds all objects.
        List<Student> students = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            int name = rnd.nextInt(0,14);
            int course = rnd.nextInt(0, 4);
            int group = rnd.nextInt(0, 3);
            int grade = rnd.nextInt(0, 4);
            students.add(new Student(names[name], courses[course], groups[group], grades[grade]));
        }

        System.out.println("Original list of students: ");
        for(Student s: students) {
            System.out.println(s);
        }
        System.out.println();

        // performance review
        removeSlackersPromoteAchievers(students);

        System.out.println("List of students after the performance review: ");
        for(Student s: students) {
            System.out.println(s);
        }

        System.out.println();

        // prompting the user for the course number
        int courseNum = promptUserForCourseNum();

        // outputting students enrolled in a particular course
        printStudents(students, courseNum);

   }

    // Write a methods that:
    // removes students with a grade point average of less than 3.
    // promotes students with a grade larger than or equal to 3.
    static void removeSlackersPromoteAchievers( List<Student> students ) {
        var it = students.iterator();
        while(it.hasNext() ) {
            Student student = it.next();
            if( student.getGrades() >= 3 ) {
                student.setCourse(student.getCourse() + 1);
            } else {
                it.remove();
            }
        }
    }

    // printStudents(List<Student> students, int course) which takes a list of students and a course number as inputs.
    // This method should print out the names of the students who are enrolled in the specified course number to the console
    static void printStudents(List<Student> students, int course) {
        boolean enrollment = false;
        for( Student s : students ) {
            if( s.getCourse() == course ) {
                enrollment = true;
                break;
            }
        }
        if( enrollment == true ) {
            System.out.println("Below is the list of students who are enrolled in course #" + course + ":");
            for( Student s: students ) {
                if( s.getCourse() == course ) {
                    System.out.println(s.getName());
                }
            }
        } else {
            System.out.println("None of the students is enrolled in course #" + course);
        }
    }

    // prompting the user for the course number
    static int promptUserForCourseNum() {
        System.out.print("Enter the number of the course [1 - 5]: ");
        int courseNum = 0;
        while( true ) {
            courseNum = SCANNER.nextInt();
            if( courseNum < 1 || courseNum > 5 ) {
                System.out.println("The course number should be an integer from the following range: 1, 2, 3, 4, 5.");
                System.out.print("Please enter a valid course number: ");
            } else {
                break;
            }
        }
        return courseNum;
    }
}

class Student {
    private String name;
    private int course;
    private int group;
    private double grades;

    public Student(String name, int course, int group, double grades) {
        this.name = name;
        this.course = course;
        this.group = group;
        this.grades = grades;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                ", group=" + group +
                ", grades=" + grades +
                '}';
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

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public double getGrades() {
        return grades;
    }

    public void setGrades(double grades) {
        this.grades = grades;
    }
}
