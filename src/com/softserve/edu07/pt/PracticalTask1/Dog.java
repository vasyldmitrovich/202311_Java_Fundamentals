package com.softserve.edu07.pt.PracticalTask1;

public class Dog implements Animal {
    @Override
    public void voice() {
        System.out.println("Dog say \"Woof\"");
    }

    @Override
    public void feed() {
        System.out.println("The dog wags its tail and eats a bone!");
    }
}
