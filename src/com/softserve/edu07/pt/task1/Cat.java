package com.softserve.edu07.pt.task1;

import com.softserve.edu07.pt.task1.Animal;

public class Cat implements Animal {
    @Override
    public void voice() {
        System.out.println("Meow");
    }

    @Override
    public void feed() {
        System.out.println("The cat eats a mouse");
    }
}
