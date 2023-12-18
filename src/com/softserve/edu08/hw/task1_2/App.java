package com.softserve.edu08.hw.task1_2;

public class App {
    public static void main(String[] args) {
        Student student1 = new Student(20, new Person.FullName("Volodimir", "Kravets"), 5);
        Student student2 = new Student(19, new Person.FullName("Petro", "Mazul"), 9);
        System.out.println(student1.info() + student1.activity());
        System.out.println(student2.info() + student2.activity());
        try {
            Student student3 = (Student) student2.clone();
            student3.setCourse(15);
            System.out.println(student3.info() + student3.activity());
        }
        catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
