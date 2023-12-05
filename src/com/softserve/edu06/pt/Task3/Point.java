package com.softserve.edu06.pt.Task3;

public class Point {

    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point :" +
                " x = " + x +
                ", y = " + y;
    }

    public void print(){
        System.out.println(toString());
    }
}
