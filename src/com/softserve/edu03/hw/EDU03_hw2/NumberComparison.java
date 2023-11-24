package com.softserve.edu03.hw.EDU03_hw2;

public class NumberComparison {
    private int num1;
    private int num2;
    private int num3;

    public static int findLeastNumber ( int num1, int num2, int num3 ) {
        if (num1 < num2 && num1 < num3 ) return num1;
        if (num2 < num1 && num2 < num3 ) return num2;
        return num3;
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

    public int getNum3() {
        return num3;
    }

    public void setNum3(int num3) {
        this.num3 = num3;
    }
}
