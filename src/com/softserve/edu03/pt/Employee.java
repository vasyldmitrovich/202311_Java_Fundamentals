package com.softserve.edu03.pt;

public class Employee {
    private String name;
    private int rate;
    private int hours;
    private static int totalSum;

    public Employee() {
    }

    public static double getTotalSumWithBonuses() {
        return totalSum + totalSum * 0.1;
    }


    public Employee(String name) {
        setName(name);
    }

    public Employee(String name, int rate, int hours) {
        setName(name);
        setRate(rate);
        setHours(hours);
    }

    /**
     * calculating the salary of an employee (formula rate * hours)
     *
     * @return int
     */
    public int getSalary() {
        return hours * rate;
    }

    /**
     * calculate 10% from salary
     *
     * @return int
     */
    public double getBonuses() {
        return getSalary() * 0.1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        int oldSalary = getSalary();
        this.rate = rate;
        int newSalary = getSalary();
        totalSum += (newSalary - oldSalary);
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        int oldSalary = getSalary();
        this.hours = hours;
        int newSalary = getSalary();
        totalSum += (newSalary - oldSalary);
    }

    public static int getTotalSum() {
        return totalSum;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", rate=" + rate +
                ", hours=" + hours +
                ", salary=" + getSalary() +
                ", bonuses= " + getBonuses() +
                ", salary with bonuses" + (getSalary() + getBonuses()) +
                '}';
    }
}
