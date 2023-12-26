package com.softserve.edu06.pt.task3;

public class Main {
    public static void main(String[] args) {
        Line[] lines = new Line[3];
        lines[0] = new Line(new Point(0, 0), new Point(1, 1));
        lines[1] = new ColorLine(new Point(2, 2), new Point(3, 3), "Blue");
        lines[2] = new Line(new Point(4, 4), new Point(5 ,5));

        for (Line line : lines) {
            line.printLine();
        }
    }
}