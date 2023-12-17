package com.softserve.edu03.hw;

import java.util.Scanner;

public class hw2 {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        System.out.println("Input the first number:");
        int n1 = sc.nextInt();

        System.out.println("Input the second number:");
        int n2 = sc.nextInt();

        System.out.println("Input the third number:");
        int n3 = sc.nextInt();

        minNumber(n1,n2,n3);

    }
    static void minNumber(int n1,int n2,int n3) {
        int min = n1;

        if (n1 > n2) {
            if (n2< n3) min =n2;
            else min=n3;
        }
        else if (n1>n3) min =n3;
        System.out.println("The smallest number " + min);
    }




}
