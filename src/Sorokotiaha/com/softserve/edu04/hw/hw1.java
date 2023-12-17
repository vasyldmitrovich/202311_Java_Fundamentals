package Sorokotiaha.com.softserve.edu04.hw;

import java.util.Locale;
import java.util.Scanner;

public class hw1 {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        System.out.println("Enter 3 numbers:");
        sc.useLocale(Locale.ROOT);
        double n1 = sc.nextDouble();
        double n2 = sc.nextDouble();
        double n3 = sc.nextDouble();


        if ((n1 >= -5) && (n1 <=5) && (n2 >= -5) && (n2 <=5) && (n3 >= -5) && (n3 <=5)) {
            System.out.println("all numbers are in the range [-5;5]");
        }
        else {
            System.out.println("numbers are out of range [-5;5]");
        }
    }
}
