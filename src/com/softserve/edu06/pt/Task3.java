package com.softserve.edu06.pt;

// well, I am utterly not sure about what's below

public class Task3 {
    public static void main(String[] args) {
        Line[] lines = {
                new Line( new Point( 1,2), new Point( 2,3) ),
                new Line( new Point( 2,3), new Point( 3,4) ),
                new Line( new Point( 5,6), new Point( 6,7) ),
                new ColorLine( new Point( 7,8), new Point( 8,9), "white" ),
                new ColorLine( new Point( 4,5), new Point( 3,4), "blue" ),
                new ColorLine( new Point( 3,2), new Point(5,4), "green"),
        };

        lines[0].print(lines);
    }
}


class Point {
    private int x;
    private int y;

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

    void print() {}
}
class Line {
    Point p1 = new Point(5,6);
    Point p2 = new Point( 6,7);

    public Line(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    @Override
    public String toString() {
        return "Line{" +
                "p1=" + p1 +
                ", p2=" + p2 +
                '}';
    }

    void print(Line[] lines) {
        for( Line l: lines ) {
            System.out.println(l);
        }
    }
}
class ColorLine extends Line {
    private String color;

    public ColorLine(Point p1, Point p2, String color) {
        super(p1, p2);
        this.color = color;
    }

    @Override
    public String toString() {
        return "ColorLine{" +
                "color='" + color + '\'' +
                ", p1=" + p1 +
                ", p2=" + p2 +
                '}';
    }

    void print() {}
}
