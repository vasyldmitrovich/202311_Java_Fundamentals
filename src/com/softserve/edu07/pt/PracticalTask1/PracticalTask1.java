package com.softserve.edu07.pt.PracticalTask1;


public class PracticalTask1 {
    public static void main(String[] args) {
        Animal[] animals = {
                new Cat(),
                new Dog(),
                new Cat(),
                new Dog()
        };

        for (var animal : animals) {
            animal.voice();
            animal.feed();
            System.out.println();
        }
    }
}


