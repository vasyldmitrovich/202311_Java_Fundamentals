package edu04.hw;

import java.util.Scanner;

public class task01 {//Name of class from Upper case not lower case
    public static class RangeCheck {
        public static void main(String[] args) {
            var scanner = new Scanner(System.in);

            System.out.println("Enter three float numbers:");
            System.out.print("Number 1: ");
            float num1 = scanner.nextFloat();

            System.out.print("Number 2: ");
            float num2 = scanner.nextFloat();

            System.out.print("Number 3: ");
            float num3 = scanner.nextFloat();
            scanner.close();

            if ((num1 >= -5 && num1 <= 5) && (num2 >= -5 && num2 <= 5) && (num3 >= -5 && num3 <= 5)) {
                System.out.println("All numbers belong to the range [-5, 5]");
            } else {
                System.out.println("Not all numbers belong to the range [-5, 5]");
            }
        }
    }

}
