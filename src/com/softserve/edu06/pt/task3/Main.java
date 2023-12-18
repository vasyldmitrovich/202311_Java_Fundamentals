package com.softserve.edu06.pt.task3;

public class Main { // DON'T RUN
    public static void main(String[] args) {
    }
}

class Point {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public void print () {
        System.out.println(toString());
    }
}

class Line {
    Point startPoint, endPoint;

    public Line(Point startPoint, Point endPoint) {
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }

    @Override
    public String toString() {
        return "Line{" +
                "startPoint=" + startPoint +
                ", endPoint=" + endPoint +
                '}';
    }

    public void print () {
        System.out.println(toString());
    }
}

class ColorLine extends Line {
    String color;

    public ColorLine(Point startPoint, Point endPoint, String color) {
        super(startPoint, endPoint);
        this.color = color;
    }

    @Override
    public String toString() {
        return "ColorLine{" +
                "color='" + color + '\'' +
                '}';
    }

    public void print () {
        System.out.println(toString());
    }
}