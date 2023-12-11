package com.softserve.edu07.hw;

import java.text.DecimalFormat;
import java.util.Random;


public class Homework1 {
    public static final Random R = new Random();
    public static final DecimalFormat DF = new DecimalFormat("0,000");

    public static void main(String[] args) {

        // create an array of employees
        Employee[] employees = createArrayOfEmployees();

        // assign values and paramenters to each employee
        assignParametersToEmployees( employees );

        // output the result of assignments and remuneration calculations
        outputResults( employees );

    }

    // create array of employees
    static Employee[] createArrayOfEmployees() {
        Employee[] employees = new Employee[10];  // array for 10 employees

        // create the array of employees. The random generator is set to either 1 or 2.  1 is Salaried Employee, 2 is Contract employee
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
        }
        return employees;
    }

    // assign values and parameters to employees
    static void assignParametersToEmployees(Employee[] employees ) {
        for (int i = 0; i < employees.length; i++) {

            if( employees[i] instanceof SalariedEmployee se) {
                String ssn = "" + R.nextLong(100_000_000, 999_999_999); // soc sec number
                se.setSocialSecurityNumber(ssn);
                double ms = R.nextDouble(10000, 20000);  // monthly salary
                se.setMonthlySalary(ms);
            }

            if( employees[i] instanceof ContractEmployee ce ) {
                String ft = "" + R.nextLong(100_000_000, 999_999_999);  // federal tax id
                ce.setFederalTaxIDmember(ft);
                double hr = R.nextDouble(150, 1000); // hourly rate
                ce.setHourlyRate(hr);
                double hw = R.nextDouble(10, 160); // hours worked
                ce.setNumOfHoursWorked(hw);
            }
        }
    }

    // output the results
    static void outputResults( Employee[] employees ) {
        for( Employee e : employees ) {
            System.out.println(e);
            if( e instanceof SalariedEmployee se ) {
                System.out.println("Monthly remuneration of this employee with id " + e.getEmployeeId() + " is " +
                        DF.format(se.calculatePay()) + ".");
            }
            if( e instanceof ContractEmployee ce ) {
                System.out.println("Monthly remuneration of this employee with id " + e.getEmployeeId() + " is " +
                        DF.format(ce.calculatePay()) + ".");
            }
            System.out.println();
        }
    }
}

interface Payment {
    double calculatePay();
}
abstract class Employee {
    private String employeeId;

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeId() {
        return employeeId;
    }
}

class SalariedEmployee extends Employee implements Payment {
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
                "employeeID= '" + getEmployeeId() + '\'' +
                ", socialSecurityNumber='" + socialSecurityNumber + '\'' +
                ", monthlySalary=" + df.format(monthlySalary) +
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
                "employeeID= '" + getEmployeeId() + '\'' +
                ", federalTaxIDmember='" + federalTaxIDmember + '\'' +
                ", hourlyRate=" + df.format(hourlyRate) +
                ", numOfHoursWorked=" + df.format(numOfHoursWorked) +
                '}';
    }
}
