package com.softserve.edu06.hw.task1;

public class App {//Good all is good
    public static void main(String[] args) {
        Bird[] birds = new Bird[4];

        Eagle eagle = new Eagle();
        eagle.setFeathers("Grey");
        eagle.setLayEggs(3);
        eagle.setName("Eagle");
        birds[0] = eagle;

        Swallow swallow = new Swallow();
        swallow.setFeathers("black, white");
        swallow.setLayEggs(5);
        swallow.setName("Swallow");

        birds[1] = swallow;

        Penguin penguin = new Penguin();
        penguin.setFeathers("black, white");
        penguin.setLayEggs(2);
        penguin.setName("Penguin");
        birds[2] = penguin;

        Kiwi kiwi = new Kiwi();
        kiwi.setFeathers("maro");
        kiwi.setLayEggs(1);
        kiwi.setName("Kiwi");
        birds[3] = kiwi;

        for (Bird b:birds){
             System.out.println(b + b.fly());
        }
    }
}
