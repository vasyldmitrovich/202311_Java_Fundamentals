package com.softserve.edu06.pt.task3;

public class App {
    public static void main(String[] args) {

        Line[] lines = new Line[5];

        Line line1 = new Line();
        line1.setA(new Point(1, 2));
        line1.setB(new Point(10, 20));
        lines[0] = line1;

        Line line2 = new Line();
        line2.setA(new Point(3, 5));
        line2.setB(new Point(10, 20));
        lines[1] = line2;

        ColorLine line3 = new ColorLine();
        line3.setA(new Point(3, 5));
        line3.setB(new Point(10, 20));
        line3.setColor("green");
        lines[2] = line3;

        ColorLine line4 = new ColorLine();
        line4.setA(new Point(5, 5));
        line4.setB(new Point(15, 25));
        line4.setColor("white");
        lines[3] = line4;

        ColorLine line5 = new ColorLine();
        line5.setA(new Point(13, 50));
        line5.setB(new Point(100, 200));
        line5.setColor("red");
        lines[4] = line5;

        for (Line l:lines){
            l.print();
        }
    }
}
