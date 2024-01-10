package com.softserve.edu15.hw.task2;

import java.util.concurrent.locks.ReentrantLock;

public class Main {

    private static ReentrantLock lock1 = new ReentrantLock();
    private static ReentrantLock lock2 = new ReentrantLock();

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(() -> task1());
        Thread thread2 = new Thread(() -> task2());

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println("End of main()");
    }

    public static void task1() {
        lock1.lock();
        System.out.println("Thread 1 acquired lock1");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        lock2.lock();
        System.out.println("Thread 1 acquired lock2");

        lock2.unlock();
        lock1.unlock();
    }

    public static void task2() {
        lock1.lock();
        System.out.println("Thread 2 acquired lock1");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        lock2.lock();
        System.out.println("Thread 2 acquired lock2");

        lock2.unlock();
        lock1.unlock();
    }
}