package com.softserve.edu15.hw.homeTask2;

public class Main {
    private static final Object monitor1 = new Object();
    private static final Object monitor2 = new Object();

    public static void main(String[] args) throws InterruptedException {
        new Thread(() -> {
           synchronized (monitor1){
               try {
                   Thread.sleep(2000);
               } catch (InterruptedException e) {
                   throw new RuntimeException(e);
               }
               System.out.println("Do smt 1");
               synchronized (monitor2){
                   System.out.println("Do smt 2");
               }
           }
        }).start();
        synchronized (monitor2){
            Thread.sleep(2000);
            System.out.println("Main thread deadlock 1");
            synchronized (monitor1){
                Thread.sleep(2000);
                System.out.println("Main thread deadlock 2");
            }

        }
    }
}
