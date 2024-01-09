package com.softserve.edu15.pt.practicalTask1;

import java.time.Duration;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            System.out.println("I study Java");
            Thread.sleep(Duration.of(1, ChronoUnit.SECONDS));
            //TimeUnit.SECONDS.sleep(1);
        }
    }
}
