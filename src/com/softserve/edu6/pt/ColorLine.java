package com.softserve.edu6.pt;

class ColorLine extends Line {
    String color;

    public ColorLine(Point point1, Point point2, String color) {
        super(point1, point2);
        this.color = color;
    }

    @Override
    public String toString() {
        return "ColorLine{" +
                "color='" + color + '\'' +

                "} " + super.toString();
    }

    public void print() {
        System.out.println(toString());
    }

}
