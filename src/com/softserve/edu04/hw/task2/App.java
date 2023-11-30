package com.softserve.edu04.hw.task2;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int n1 = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter the second number: ");
        int n2 = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter the third number: ");
        int n3 = Integer.parseInt(scanner.nextLine());
        System.out.println("Maximum number: " + getMax(n1, n2, n3));
        System.out.println("Minimum number: " + getMin(n1, n2, n3));
    }

    static int getMax(int a1, int a2, int a3){
        return Math.max(Math.max(a1, a2), a3);
    }

    static int getMin(int a1, int a2, int a3){
        return Math.min(Math.min(a1, a2), a3);
    }
}
