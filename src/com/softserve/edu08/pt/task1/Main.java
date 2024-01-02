package com.softserve.edu08.pt.task1;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Department department1 = new Department("IT", "Lviv","Sadova",2);
        Department cloneDep = (Department) department1.clone();

        cloneDep.getAddress().city= "Kyiv";

        Department[] array = new Department[]{
                department1,cloneDep
        };

        for (var element: array ){

            System.out.print(element.getName() + " ");
            System.out.println(element.getAddress());
        }
    }
}