package com.softserve.edu04.hw.Task1;


public class Main {
    public static void main(String[] args) {

        Numbers num1 = new Numbers(-5.1,5.1,0);
        Numbers num2 = new Numbers(-6,9,6);
        Numbers num3 = new Numbers(1,1,1);
        Numbers.checkRange(num1);
        Numbers.checkRange(num2);
        Numbers.checkRange(num3);


    }
}
