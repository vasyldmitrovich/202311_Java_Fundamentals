package com.softserve.edu06.pt.Task3;

public class Main {
    public static void main(String[] args) {

        Line[] lines = new Line[4];

        Point point1 = new Point(1, 2);
        Point point2 = new Point(4, 6);

        lines[0] = new Line(point1, point2);
        lines[1] = new ColorLine(point1, point2, "Red");
        lines[2] = new ColorLine(new Point(3, 5), new Point(7, 8), "Blue");
        lines[3] = new ColorLine(new Point(40,32),new Point(23,17),"Orange");

        for (Line line : lines) {
            line.print();
        }
    }
}
