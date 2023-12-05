package com.softserve.edu06.pt.Task3;

public class ColorLine extends Line {

    private String color;


    public ColorLine(Point point1, Point point2, String color) {
        super(point1, point2);
        this.color = color;
    }


    @Override
    public String toString() {
        return super.toString() + " color = " + color ;
    }

    public void print(){
        System.out.println(toString());
    }
}
