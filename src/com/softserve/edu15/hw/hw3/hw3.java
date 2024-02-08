package com.softserve.edu15.hw.hw3;

import java.util.concurrent.TimeUnit;

public class hw3 {
    public static void main(String[] args) {

        var t2 = new Thread(() -> {
            for (int i = 0; i < 3; i++) {
                System.out.println("Thread number two");
                try {
                    TimeUnit.SECONDS.sleep(2);
                } catch (InterruptedException e) {

                }
            }
        });
        var t1 = new Thread(() -> {
            t2.start();
        });
        var t3 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Thread number three");
                try {
                    TimeUnit.SECONDS.sleep(2);
                } catch (InterruptedException e) {

                }
            }
        });
        t1.start();
        t3.start();
    }
}
