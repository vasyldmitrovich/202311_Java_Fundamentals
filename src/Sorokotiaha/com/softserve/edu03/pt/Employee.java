package Sorokotiaha.com.softserve.edu03.pt;

public class Employee {
    private String name;
    private double rate;
    private int hours;
    static double totalSum;

    public Employee(String name, double rate, int hours) {
        this.name = name;
        this.rate = rate;
        this.hours = hours;
        getSalary();
    }

    public  void getSalary() {
        double salary = this.rate * this.hours;
        Employee.totalSum = Employee.totalSum + getBonuses(salary);
    }

    public String toString() {
        return "Employee:" + this.name + " rate:" + this.rate + " hours:" + this.hours ;
    }

    public double getBonuses(double salary) {
        return  salary * 1.1;
    }
}

