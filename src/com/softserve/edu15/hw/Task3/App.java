package com.softserve.edu15.hw.Task3;

public class App {
    public static void main(String[] args) {

        Thread one = new Thread(()->{

            Thread two = new Thread(()->{

                for (int i = 0; i < 3; i++) {
                    System.out.println("Thread number two!");
                }

                Thread three = new Thread(()->{
                    for (int i = 0; i < 5; i++) {
                        System.out.println("Thread number three!");
                    }

                });
                three.start();
                try {
                    three.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });

            two.start();
            try {
                two.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        });

        one.start();
    }
}
