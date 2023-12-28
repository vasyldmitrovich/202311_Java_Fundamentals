package com.softserve.edu07.pt.task1;

import com.softserve.edu07.pt.task1.Animal;
import com.softserve.edu07.pt.task1.Cat;
import com.softserve.edu07.pt.task1.Dog;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = {
                new Cat(),
                new Dog(),
        };

        for (var animal : animals) {
            animal.voice();
            animal.feed();
        }
    }
}
