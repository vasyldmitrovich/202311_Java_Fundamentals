package com.softserve.edu06.pt.task3;

public class ColorLine extends Line{
    String color;

    @Override
    public String toString() {
        return "ColorLine{" +
                "color='" + color + '\'' +
                ", a=" + a +
                ", b=" + b +
                '}';
    }

    void print(){
        System.out.println("This line with points: a = " + this.a + ", b = " + this.b + ", color: " + this.color);

    }
}
