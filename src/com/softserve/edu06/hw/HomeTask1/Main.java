package com.softserve.edu06.hw.HomeTask1;

public class Main {
    public static void main(String[] args) {
        ABird[] birds = {
                new Swallow(),
                new Penguin(),
                new Kiwi(),
                new Eagle(),
        };

        for (var bird : birds) {
            System.out.println(bird);
            bird.fly();
        }
    }
}
