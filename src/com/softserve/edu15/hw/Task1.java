package com.softserve.edu15.hw;

import java.util.concurrent.TimeUnit;

public class Task1 {
    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 5; i++){
                System.out.println("Peace in all the peace");
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 5; i++){
                System.out.println("I study english");
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        Thread thread3 = new Thread(() -> {
            for (int i = 0; i < 5; i++){
                System.out.println("I study java");
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        thread3.start();
    }
}
