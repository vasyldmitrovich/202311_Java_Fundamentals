package com.softserve.edu08.pt.Task1;

public class App {
    public static void main(String[] args) throws CloneNotSupportedException {
        Department department1 = new Department("Dep 1", "Sofia","Vitosha",23);
        Department cloneDep = (Department) department1.clone();

        cloneDep.getAddress().city= "Karlovo";

        Department[] array = new Department[]{
                department1,cloneDep
        };

        for (var element: array ){

            System.out.print(element.getName() + " ");
            System.out.println(element.getAddress());
        }
    }
}
