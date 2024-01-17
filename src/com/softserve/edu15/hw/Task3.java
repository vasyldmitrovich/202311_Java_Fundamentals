package com.softserve.edu15.hw;

public class Task3 {
    public static void main(String[] args) {
        Thread one = new Thread();
        Thread two = new Thread(() -> {
            for (int i=0; i < 3; i++) {
                System.out.println("Thread number two");
            }
            Thread three = new Thread(() -> {
                for (int i = 0; i < 5; i++) {
                    System.out.println("Thread number three");
                }
            });
            three.start();
        });
        one.start();
        two.start();

    }
}
