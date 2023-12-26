package com.softserve.edu07.hw;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Random;


public class Homework1 {
    public static final Random R = new Random();
    public static final DecimalFormat DF = new DecimalFormat("0,000");

    public static void main(String[] args) {

        // create an array of employees
        Employee[] employees = createArrayOfEmployees();

        // assign values and paramenters to each employee
        assignParametersToEmployees( employees );
        System.out.println(Arrays.toString(employees));

        // sort arrays according to the size of average monthly remuneration, descending order
        sortArray(employees);

        // output the result of assignments and remuneration calculations
        outputResults( employees );

    }

    // create array of employees
    static Employee[] createArrayOfEmployees() {
        // array for 10 employees
        Employee[] employees = new Employee[10];

        // create the array of employees. The random generator is set to either 1 or 2.
        // 1 is Salaried Employee, 2 is Contract employee
        for (int i = 0; i < employees.length; i++) {
            int rnd = R.nextInt(1,3);
            switch (rnd) {
                case 1:
                    employees[i] = new SalariedEmployee();
                    break;
                default:
                    employees[i] = new ContractEmployee();
            }

            // assign employee ID to the employee
            String eid = "" + R.nextInt(100, 999);
            employees[i].setEmployeeId(eid);

            // assign names to employees.  Randomly choose names from the list provided in array 'names'
            String[] names = {
                    "Pedro", "Pablo", "Juan", "Jorge", "Iker", "Javier",
                    "Matilda", "Perfecta", "Mercedes", "Anna", "Pepita", "Jimena"
            };
            int num = R.nextInt(0,12);
            employees[i].setName(names[num]);
        }
        return employees;
    }

    // assign values and parameters to employees
    static void assignParametersToEmployees(Employee[] employees ) {
        for (int i = 0; i < employees.length; i++) {

            if( employees[i] instanceof SalariedEmployee se) {
                // soc sec number
                String ssn = "" + R.nextLong(100_000_000, 999_999_999);
                se.setSocialSecurityNumber(ssn);
                // monthly salary
                double ms = R.nextDouble(10000, 20000);
                se.setMonthlySalary(ms);
                // average monthly salary
                se.setMonthlyRemuneration(se.calculatePay());
            }

            if( employees[i] instanceof ContractEmployee ce ) {
                // federal tax id
                String ft = "" + R.nextLong(100_000_000, 999_999_999);
                ce.setFederalTaxIDmember(ft);
                // hourly rate
                double hr = R.nextDouble(150, 1000);
                ce.setHourlyRate(hr);
                // hours worked
                double hw = R.nextDouble(10, 160);
                ce.setNumOfHoursWorked(hw);
                // average monthly salary
                ce.setMonthlyRemuneration(ce.calculatePay());
            }
        }
    }

    // sort employees by the size of average monthly remuneration, descending order
    static void sortArray( Employee[] employees ) {
        Arrays.sort(employees);
    }

    // output the results
    static void outputResults( Employee[] employees ) {
        for( Employee e : employees ) {
            System.out.println(e);
            System.out.println();
        }
    }
}

interface Payment {
    double calculatePay();
}
abstract class Employee implements Comparable<Employee> {
    private String employeeId;
    private String name;
    private double monthlyRemuneration;

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMonthlyRemuneration() {
        return monthlyRemuneration;
    }

    public void setMonthlyRemuneration(double monthlyRemuneration) {
        this.monthlyRemuneration = monthlyRemuneration;
    }

    @Override
    public int compareTo(Employee employee) {
        int comp = Double.compare(employee.monthlyRemuneration, monthlyRemuneration);
        if( comp == 0 ) {
            comp = name.compareTo(employee.name);
        }
        return comp;
    }
}

class SalariedEmployee extends Employee implements Payment {//Interphase Payment should implement class Employee
    DecimalFormat df = new DecimalFormat("0");
    private String socialSecurityNumber;
    private double monthlySalary;

    @Override
    public double calculatePay() {
        return monthlySalary;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" +
                "employee Name='" + getName() + '\'' +
                ", employeeID= '" + getEmployeeId() + '\'' +
                ", socialSecurityNumber='" + socialSecurityNumber + '\'' +
                ", average monthly salary=" + df.format(getMonthlyRemuneration()) +
                '}';
    }
}

class ContractEmployee extends Employee implements Payment {
    DecimalFormat df = new DecimalFormat("0");
    private String federalTaxIDmember;
    private double hourlyRate;
    private double numOfHoursWorked;

    @Override
    public double calculatePay() {
        return hourlyRate * numOfHoursWorked;
    }

    public void setFederalTaxIDmember(String federalTaxIDmember) {
        this.federalTaxIDmember = federalTaxIDmember;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public void setNumOfHoursWorked(double numOfHoursWorked) {
        this.numOfHoursWorked = numOfHoursWorked;
    }

    @Override
    public String toString() {
        return "ContractEmployee{" +
                "employee Name='" + getName() + '\'' +
                ", employeeID= '" + getEmployeeId() + '\'' +
                ", federalTaxIDmember='" + federalTaxIDmember + '\'' +
                ", average monthly salary=" + df.format(getMonthlyRemuneration()) +
                '}';
    }
}
