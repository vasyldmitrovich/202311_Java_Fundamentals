package com.softserve.edu06.hw.Task2;

public class Developer extends Employee {

   private final String position;

    public Developer(String name, int age,String position, double salary) {
        super(name, age, salary);
        this.position = position;
    }

    @Override
    public String report() {
         String superString = super.report();
         String [] splitted = superString.split(",");

         return splitted[0] + "," + splitted[1] + "," + " Position : "+ position +
                 "," + splitted[2];
    }
}
