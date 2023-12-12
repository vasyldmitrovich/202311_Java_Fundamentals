package edu03.pt;

public class Employee {
    private String name;
    private double rate;
    private double hour;
    private static double totalSum;

    public Employee() {
    }

    public Employee(String name, double rate, double hour) {
        this.hour = hour;
        this.name = name;
        this.rate = rate;
        totalSum += getSalary();
    }

    public String getName() {
        return name;
    }

    public double getRate() {
        return rate;
    }

    public double getHour() {
        return hour;
    }

    public double getSalary() {
        return rate * hour;
    }

    public double getBonus() {
        return getSalary() * 0.10;
    }

    public static double getTotalSum() {
        return totalSum;
    }

    public String toString() {
        return "Employee{name='" + name + "', rate=" + rate + ", hour=" + hour + "}";
    }

    public static void main(String[] args) {
        Employee employee1 = new Employee("Pavlo", 15.0, 40.0);
        Employee employee2 = new Employee("Roman", 20.0, 45.0);
        Employee employee3 = new Employee("Sofia", 18.0, 50.0);
        totalSum = employee1.getSalary() + employee2.getSalary() + employee3.getSalary();

        System.out.println("Total Salary of all employees: " + totalSum);
    }
}
