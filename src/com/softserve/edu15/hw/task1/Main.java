package com.softserve.edu15.hw.task1;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new Message("Message 1"));
        Thread thread2 = new Thread(new Message("Message 2"));
        Thread thread3 = new Thread(new Message("Message 3"));

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        thread3.start();
    }
}

class Message implements Runnable {

    private String message;

    public Message(String message) {
        this.message = message;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(message);
        }
    }
}