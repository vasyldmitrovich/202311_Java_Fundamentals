package com.softserve.edu06.pt.task3;

public class ColorLine extends Line {
    String color;

    public ColorLine(Point startPoint, Point endPoint, String color) {
        super(startPoint, endPoint);
        this.color = color;
    }

    @Override
    public String toString() {
        return "ColorLine{" +
                "color='" + color + '\'' +
                ", startPoint=" + startPoint +
                ", endPoint=" + endPoint +
                '}';
    }
}