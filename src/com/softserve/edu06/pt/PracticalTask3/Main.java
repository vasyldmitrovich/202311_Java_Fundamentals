package com.softserve.edu06.pt.PracticalTask3;

public class Main {
    public static void main(String[] args) {
        Line[] lines = {
                new Line(new Point(1, 2), new Point(3, 4)),
                new Line(1, 2, 3, 4),
                new ColorLine((new Line(1, 2, 3, 4)), "RED"),
                new ColorLine(1, 10, 3, -4, "BLUE"),
                new ColorLine(new Point(11, 22), new Point(3, 4), "GREEN"),


        };

        for (var line : lines) {
            line.print();
        }
    }
}
