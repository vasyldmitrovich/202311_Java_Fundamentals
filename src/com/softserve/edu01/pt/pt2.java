package com.softserve.edu01.pt;

import java.util.Locale;
import java.util.Scanner;

public class pt2 {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        sc.useLocale(Locale.ROOT);
        System.out.println("Input first number");
        double n1 = sc.nextDouble();
        System.out.println("Input second number");
        double n2 = sc.nextDouble();
        System.out.println("Input third number");
        double n3 = sc.nextDouble();
        System.out.println("averege is " + (n1+n2+n3)/3);

    }
}
