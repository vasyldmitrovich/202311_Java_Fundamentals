package com.softserve.edu6.pt;

public class pt3 {
    public static void main(String[] args) {
        Line[]  line = {
          new Line(new Point(1,8 ), new Point(89,100)),
                new Line(new Point(10,-8 ), new Point(8,-100)),
                new Line(new Point(15,82 ), new Point(69,10)),
                new ColorLine(new Point(150,820 ), new Point(69,104),"red"),
                new ColorLine(new Point(155,52 ), new Point(59,105),"blue"),
                new ColorLine(new Point(145,72 ), new Point(29,103),"green"),

        };
        for (Line curentLine : line){
            curentLine.print();
        }
    }

}
