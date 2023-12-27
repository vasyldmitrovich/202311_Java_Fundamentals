package com.softserve.edu06.hw.task1;

public class Main {
    public static void main(String[] args) {
        Bird[] birds = new Bird[4];
        birds[0] = new Eagle(true, true);
        birds[1] = new Kiwi(true, true);
        birds[2] = new Swallow(true, true);
        birds[3] = new Penguin(true, true);

        for (Bird bird : birds) {
            bird.fly();
            System.out.println("Feathers: " + bird.isFeathers());
            System.out.println("Lays eggs: " + bird.isLayEggs());
            System.out.println();
        }
    }
}
