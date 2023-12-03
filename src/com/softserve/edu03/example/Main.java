package com.softserve.edu03.example;

import com.softserve.edu03.example.students.Student;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //В процесі

        Student student1 = new Student();
        System.out.print("Enter name: ");
        student1.setName(scanner.nextLine());
        System.out.print("Enter rating: ");
        student1.setRating(scanner.nextInt());
        System.out.println("Name student 1: " + student1.getName());
        System.out.println("His rating : " + student1.getRating());
        scanner.nextLine();

        Student student2 = new Student();
        System.out.print("Enter name: ");
        student2.setName(scanner.nextLine());
        System.out.print("Enter rating: ");
        student2.setRating(scanner.nextInt());
        System.out.println("Name student 1: " + student2.getName());
        System.out.println("His rating : " + student2.getRating());

        System.out.println("Total rating: " + Student.getTotalRating());


    }
}
