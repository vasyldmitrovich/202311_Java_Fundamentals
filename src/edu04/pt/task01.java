package edu04.pt;

import java.util.Scanner;

public class task01 {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        int num1 = SCANNER.nextInt();
        int num2 = SCANNER.nextInt();
        int num3 = SCANNER.nextInt();

        int count = 0;
        if (num1 % 2 != 0) count++;
        if (num2 % 2 != 0) count++;
        if (num3 % 2 != 0) count++;
        System.out.println("There are " + count + " odd numbers");
    }
}
