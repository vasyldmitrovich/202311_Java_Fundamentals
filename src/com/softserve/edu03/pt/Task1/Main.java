package com.softserve.edu03.pt.Task1;

import java.util.Scanner;

public class Main {

    static public final Scanner SCANNER = new Scanner( System.in );

    public static void main(String[] args) {

        SomeSimpleMath ssm = new SomeSimpleMath();

        int num1 = SomeSimpleMath.getNumber("first");
        ssm.setNum1(num1);

        int num2 = SomeSimpleMath.getNumber("second");
        ssm.setNum2(num2);

        int summe = SomeSimpleMath.getTotal(ssm.getNum1(), ssm.getNum2());
        System.out.println("The sum of " + ssm.getNum1() + " and " + ssm.getNum2() + " is " + summe);

        double mittelwert = SomeSimpleMath.getAverage(ssm.getNum1(), ssm.getNum2());
        System.out.printf("The average of " + ssm.getNum1() + " and " + ssm.getNum2() + " is %.1f", mittelwert);
    }
}
