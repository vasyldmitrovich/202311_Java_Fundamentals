package com.softserve.edu03.pt.Task1;

public class SomeSimpleMath {
    private int num1;
    private int num2;

    static int getTotal (int num1, int num2) {
        return num1 + num2;
    }

    static double getAverage ( int num1, int num2 ) {
        return ( (double) num1 + num2 ) / 2;
    }

    static int getNumber(String prompt) {
        System.out.print("Enter the " + prompt + " number: ");
        return Main.SCANNER.nextInt();
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
}
