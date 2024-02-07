package com.softserve.edu15.hw.hw1;

import java.util.concurrent.TimeUnit;

public class hw1 {
    public static void main(String[] args) throws InterruptedException {
        var t1 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Text1");
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                }
            }
        });
        var t2 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Text2");
            }
        });
        var t3 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Text3");
            }
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        t3.start();

    }

}
