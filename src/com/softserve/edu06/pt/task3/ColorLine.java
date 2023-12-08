package com.softserve.edu06.pt.task3;

public class ColorLine extends Line{
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "ColorLine{" +
                "color='" + color + '\'' +
                ", a=" + this.getA() +
                ", b=" + this.getB() +
                '}';
    }

    void print(){
        System.out.println("This line with points: a = " + this.getA() + ", b = " + this.getB() + ", color: " + this.color);

    }
}
