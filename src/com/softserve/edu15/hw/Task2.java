package com.softserve.edu15.hw;

public class Task2 {
    public synchronized static void main(String[] args) {
        var t = new Thread(() -> Task2.main(null));
        t.start();
        System.out.println("main");
        try {
            t.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
