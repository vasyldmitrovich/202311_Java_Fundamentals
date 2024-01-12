package com.softserve.edu15.pt.Task2;

public class App {
    public static void main(String[] args) throws InterruptedException {

        Run1 t1 = new Run1();
        Run2 t2 = new Run2();

        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("My name is Max!");
    }
}
