package com.softserve.edu15.hw.Task2;

public class App {
    public static void main(String[] args) throws InterruptedException {

        Object firstKey = new Object();
        Object secondKey = new Object();

        Thread t1 = new Thread(()->{
            synchronized (firstKey){
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (secondKey){
                    for (int i = 1; i <= 5; i++) {
                        System.out.println("Thread 1: i = " + i);
                    }
                }
            }
        }
        );
        Thread t2 = new Thread(()->{
            synchronized (secondKey){
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (firstKey){
                    for (int i = 1; i <= 5; i++) {
                        System.out.println("Thread 2: i = " + i);
                    }
                }
            }
        }
        );
        System.out.println("Before start :");
        System.out.println("t1 : " + t1.getState());
        System.out.println("t2 : " + t2.getState());
        t1.start();
        t2.start();
        System.out.println("After start :");
        System.out.println("t1 : " + t1.getState());
        System.out.println("t2 : " + t2.getState());
    }
}
