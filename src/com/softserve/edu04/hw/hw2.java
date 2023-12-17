package com.softserve.edu04.hw;

import java.util.Locale;
import java.util.Scanner;

public class hw2 {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        System.out.println("Enter three integer numbers:");
        sc.useLocale(Locale.ROOT);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        int max = n1;
        int min = n1;
        if (n1 > n2) {
            min = n2;
            if (n1 > n3) {
                if (n2 > n3) {
                    min = n3;
                }
            }
        } else if (n2 > n3) {
            max = n2;
            if (n1 > n3) {
                min = n3;
            }
        } else {
            max = n3;
        }

        System.out.println("max:" + max);
        System.out.println("min:" + min);
    }
}
