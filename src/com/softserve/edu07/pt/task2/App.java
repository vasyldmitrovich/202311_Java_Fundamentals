package com.softserve.edu07.pt.task2;

public class App {
    public static void main(String[] args) {
           Person[] persons = new Person[4];

           persons[0] = new Student("Petro");
           persons[1] = new Teacher("Dmitro");
           persons[2] = new Teacher("Svitlana");
           persons[3] = new Cleaner("Katerina");
           for (Person per:persons){
               per.print();
               if (per instanceof Staff){
                   ((Staff) per).salary();
               }
               System.out.println("==============================");
           }
    }
}
