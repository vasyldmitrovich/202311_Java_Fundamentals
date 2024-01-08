package com.softserve.edu09.hw.homeTask2;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("John", "Group1", 1,
                                            Map.of("Math", 5.0,
                                                    "English", 3.5,
                                                    "Litaature", 5.0
                                                    )));
        students.add(new Student("Alex", "Group2", 2,
                                            Map.of("Math", 1.0,
                                                    "English", 2.5,
                                                    "Litaature", 1.0
                                                    )));
        students.add(new Student("Bob", "Group3", 3,
                                            Map.of("Math", 4.0,
                                                    "English", 3.5,
                                                    "Litaature", 3.0
                                                    )));
        students.add(new Student("Dodo", "Group4", 3,
                                            Map.of("Math", 4.0,
                                                    "English", 3.5,
                                                    "Litaature", 3.0
                                                    )));


        for(var student : students){
            System.out.println(student);
        }

        Student.removeFromUniversityOrPromoteOnNextCourse(students);
        System.out.println("Removing and promoting students");
        for(var student : students){
            System.out.println(student);
        }
        Student.printStudents(students, 6);

    }
}
