package com.softserve.edu15.hw.Task1;

public class App{
    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new Thread1();
        Thread t2 = new Thread2();
        Thread t3 = new Thread3();

        t1.start();
        t2.start();
        t1.join();
        t2.join();
        t3.start();
    }
}
