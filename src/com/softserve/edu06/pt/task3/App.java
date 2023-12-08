package com.softserve.edu06.pt.task3;

public class App {
    public static void main(String[] args) {

        Line[] lines = new Line[5];

        Line line1 = new Line();
        line1.a = new Point(1, 2);
        line1.b = new Point(10, 20);
        lines[0] = line1;

        Line line2 = new Line();
        line2.a = new Point(3, 5);
        line2.b = new Point(10, 20);
        lines[1] = line2;

        ColorLine line3 = new ColorLine();
        line3.a = new Point(3, 5);
        line3.b = new Point(10, 20);
        line3.color = "green";
        lines[2] = line3;

        ColorLine line4 = new ColorLine();
        line4.a = new Point(5, 5);
        line4.b = new Point(15, 25);
        line4.color = "white";
        lines[3] = line4;

        ColorLine line5 = new ColorLine();
        line5.a = new Point(13, 50);
        line5.b = new Point(100, 200);
        line5.color = "red";
        lines[4] = line5;

        for (Line l:lines){
            l.print();
        }
    }
}
