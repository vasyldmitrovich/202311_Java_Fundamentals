package com.softserve.edu15.hw.homeTask3;

public class Main {
    public static void main(String[] args) {
        var one = new Thread(() ->{
            var two = new Thread(() ->{
                for (int i = 0; i < 3; i++) {
                    System.out.println("Thread number two");
                }
                var three = new Thread(() ->{
                    for (int i = 0; i < 5; i++) {
                        System.out.println("Thread number three");
                    }
                });
                three.start();
            });
            two.start();
        });
        one.start();

    }
}
