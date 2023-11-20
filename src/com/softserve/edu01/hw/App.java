package com.softserve.edu01.hw;

import java.util.Scanner;

public class App {



    public static void main(String[] args) {
        // Homeworks

        // Task 1
        Scanner scanner = new Scanner(System.in);
        System.out.println("input radius");
        double radius = scanner.nextDouble();
        double area = Math.PI * radius * radius;
        double perimetr = Math.PI * 2 * radius;
        System.out.println("area is" + area);
        System.out.println("perimetr is" + perimetr);




        // Task 2...


        System.out.println("What is your name: ");
        String answer = scanner.nextLine();
        System.out.println("You name is" + answer);
        System.out.println("Where do you live: ");
        String answer1 = scanner.nextLine();
        System.out.println("You live in" + answer1);
    }


    }

