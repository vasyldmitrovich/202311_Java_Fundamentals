package com.softserve.edu08.hw.task2;

import com.softserve.edu08.hw.task1.FullName;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student(new FullName("Artur", "Ivanov"), 22, 6);
        Student student2 = new Student(new FullName("Marta", "Getter"), 26, 3);

        System.out.println(student1.info());
        System.out.println(student1.activity());
        System.out.println();

        System.out.println(student2.info());
        System.out.println(student2.activity());
        System.out.println();

        Student clonedStudent1 = student1.clone();
        clonedStudent1 = new Student(clonedStudent1.getFullName(), clonedStudent1.getAge(), 20);
        System.out.println(clonedStudent1.info());
        System.out.println("Activity: " + clonedStudent1.activity());


    }
}
