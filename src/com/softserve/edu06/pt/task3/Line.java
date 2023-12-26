package com.softserve.edu06.pt.task3;

public class Line {
    Point startPoint;
    Point endPoint;

    public Line(Point startPoint, Point endPoint) {
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }

    @Override
    public String toString() {
        return "Line" +
                "startPoint = " + startPoint +
                ", endPoint = " + endPoint;
    }

    void printLine () {
        System.out.println(toString());
    }
}