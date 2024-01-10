package com.softserve.edu15.hw.task3;

public class Main {
    public static void main(String[] args) {
        Thread one = new Thread(() -> {
            Thread two = new Thread(() -> {
                for (int i = 0; i < 3; i++) {
                    System.out.println("Thread number two");
                }
            });

            two.start();

            try {
                two.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            Thread three = new Thread(() -> {
                for (int i = 0; i < 5; i++) {
                    System.out.println("Thread number three");
                }
            });

            three.start();
        });

        one.start();

        try {
            one.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

