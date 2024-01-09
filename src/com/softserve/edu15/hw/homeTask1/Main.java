package com.softserve.edu15.hw.homeTask1;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        var t1 = new Thread(() -> printMessageFiveTimes("Thread 1"));
        var t2 = new Thread(() -> printMessageFiveTimes("Thread 2"));
        var t3 = new Thread(() -> printMessageFiveTimes("Thread 3"));

        t1.start();
        t2.start();
        t1.join();
        t2.join();
        t3.start();

    }

    static void printMessageFiveTimes(String message) {
        for (int i = 0; i < 5; i++) {
            System.out.println(message);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                //
            }
        }
    }
}
