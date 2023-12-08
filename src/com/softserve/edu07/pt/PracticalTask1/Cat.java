package com.softserve.edu07.pt.PracticalTask1;

public class Cat implements Animal {
    @Override
    public void voice() {
        System.out.println("Cat say \"Meow\"");
    }

    @Override
    public void feed() {
        System.out.println("The cat purrs and eats fish!");
    }
}
