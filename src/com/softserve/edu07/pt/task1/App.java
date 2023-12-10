package com.softserve.edu07.pt.task1;

public class App {
    public static void main(String[] args) {

        Animal[] animals = new Animal[5];

        animals[0] = new Dog();
        animals[1] = new Dog();
        animals[2] = new Cat();
        animals[3] = new Cat();
        animals[4] = new Cat();

        for (Animal an:animals) {
            an.voice();
            an.feed();
        }

    }
}
