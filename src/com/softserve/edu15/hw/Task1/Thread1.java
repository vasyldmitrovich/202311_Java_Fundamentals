package com.softserve.edu15.hw.Task1;

public class Thread1 extends Thread{
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Hello form Thread 1 : " +"Message " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
