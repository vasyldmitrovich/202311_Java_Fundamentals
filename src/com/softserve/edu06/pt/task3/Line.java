package com.softserve.edu06.pt.task3;

public class Line {

    Point a;
    Point b;

    public Point getA() {
        return a;
    }

    public void setA(Point a) {
        this.a = a;
    }

    public Point getB() {
        return b;
    }

    public void setB(Point b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "Line{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }

    void print(){
        System.out.println("This line with points: a = " + this.a + ", b = " + this.b);
    }
}
