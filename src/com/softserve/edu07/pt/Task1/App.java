package com.softserve.edu07.pt.Task1;

public class App {
    public static void main(String[] args) {//Good

        Animal[] animals = new Animal[]{

                new Dog(),
                new Dog(),
                new Cat(),
                new Cat(),
                new Dog()
        };

        for(Animal animal : animals){
            animal.voice();
            animal.feed();
        }
    }
}
