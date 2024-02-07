package com.softserve.edu15.pt.pt2;

import java.util.concurrent.TimeUnit;

public class pt2 {
    public static void main(String[] args) throws InterruptedException {
        var t1 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Hello world");
                try {
                    TimeUnit.SECONDS.sleep(2);
                } catch (InterruptedException e) {

                }
            }
        });

        var t2 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Peace in the world");
                try {
                    TimeUnit.SECONDS.sleep(3);
                } catch (InterruptedException e) {

                }
            }
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("My name is Oleh");

    }
}
