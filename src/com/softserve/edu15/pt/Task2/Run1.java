package com.softserve.edu15.pt.Task2;

public class Run1 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello, world");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
            }
        }
    }
}
