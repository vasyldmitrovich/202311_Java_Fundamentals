package com.softserve.edu03.hw.EDU03_hw1;

import static java.lang.Math.sqrt;

public class AreaOfATriangle {
    private int lengthSide1;
    private int lengthSide2;
    private int lengthSide3;

    static double triangleArea(int lengthSide1, int lengthSide2, int lengthSide3) {
        double semiPerimeter = (double)( lengthSide1 + lengthSide2 + lengthSide3 ) / 2;
        return sqrt( semiPerimeter *
                ( semiPerimeter - lengthSide1 ) *
                ( semiPerimeter - lengthSide2 ) *
                ( semiPerimeter - lengthSide3) );
    }

    public int getLengthSide1() {
        return lengthSide1;
    }

    public void setLengthSide1(int lengthSide1) {
        this.lengthSide1 = lengthSide1;
    }

    public int getLengthSide2() {
        return lengthSide2;
    }

    public void setLengthSide2(int lengthSide2) {
        this.lengthSide2 = lengthSide2;
    }

    public int getLengthSide3() {
        return lengthSide3;
    }

    public void setLengthSide3(int lengthSide3) {
        this.lengthSide3 = lengthSide3;
    }
}
