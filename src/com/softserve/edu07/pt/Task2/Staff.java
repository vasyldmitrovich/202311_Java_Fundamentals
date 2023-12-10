package com.softserve.edu07.pt.Task2;

public class Staff extends Person{


    public Staff(String name) {
        super(name);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    void print() {
        System.out.println("My name is " + getName());
        System.out.print("I am a ");
    }
   public int salary(){
        return 0;
   }
}
