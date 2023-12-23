package com.softserve.edu09.hw.Task2;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Valentin","Group1",1,List.of(4.0,2.0,4.0)));
        students.add(new Student("Sergo","Group2",2,List.of(3.4,4.0,4.0)));
        students.add(new Student("Elena","Group3",2,List.of(3.0,2.0,1.0)));
        students.add(new Student("Maxim","Group3",3,List.of(3.4,3.0,4.5)));
        students.add(new Student("Vitalic","Group3",1,List.of(2.0,2.0,2.0)));


        System.out.println("Students :");
        Student.print(students);
        Student.removeStudentIfGradeIsLowerThan3(students);
        Student.print(students);
        Student.printStudentsByCourse(students,1);

    }
}
