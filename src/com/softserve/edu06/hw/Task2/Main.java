package com.softserve.edu06.hw.Task2;

public class Main {//Ok
    public static void main(String[] args) {

        Employee employee1 = new Employee("Jora",25,300000000);
        Employee employee2 = new Developer("Alex",23,"QA",50000);
        Employee employee3 = new Developer("Antoha",25,"Developer",75000);
        Employee employee4 = new Employee("Alexei",31,20000);
        Employee employee5 = new Developer("Oleg",19,"Intern",17000);
        Employee employee6 = new Employee("Mario",21,35000);
        Employee employee7 = new Developer("Alexandr",27,"Lead",100000);

        Employee[] employees = new Employee[]{
          employee1, employee2, employee3, employee4, employee5, employee6, employee7
        };

        for (Employee employee : employees){
            System.out.println(employee.report());
        }

    }
}
