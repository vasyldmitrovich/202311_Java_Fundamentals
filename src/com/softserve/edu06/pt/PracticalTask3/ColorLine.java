package com.softserve.edu06.pt.PracticalTask3;

public class ColorLine extends Line {
    String color;

    public ColorLine(Point startPoint, Point endPoint, String color) {
        super(startPoint, endPoint);
        this.color = color;
    }

    public ColorLine(int x1, int y1, int x2, int y2, String color) {
        super(x1, y1, x2, y2);
        this.color = color;
    }

    public ColorLine(Line line, String color) {
        super(line.getStartPoint(), line.getEndPoint());
        this.color = color;

    }

    @Override
    public String toString() {
        return super.toString() + " of " + color + " color";
    }
}
