package com.softserve.edu15.hw.hw2;

public class hw2 {
    public static void main(String[] args) {
        final Friend alphonse =                new Friend("Alphonse");
        final Friend gaston =                new Friend("Gaston");
        new Thread(() -> {
            alphonse.bow(gaston);
        }).start();

        new Thread(() -> {
            gaston.bow(alphonse);
        }).start();
    }
}



