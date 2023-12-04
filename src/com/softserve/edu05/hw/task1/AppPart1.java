package com.softserve.edu05.hw.task1;

import java.util.Scanner;

public class AppPart1 {
    public static void main(String[] args) {

        int[] months = {31,28,31,30,31,30,31,31,30,31,30,31};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of month: ");
        int i = Integer.parseInt(scanner.nextLine());
        System.out.println("There are " + months[i-1] + " days in this year.");

    }
}
