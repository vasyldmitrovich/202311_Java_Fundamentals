package com.softserve.edu7.hw.hw1;

class SalariedEmployee extends Employee implements Payment{
    private String socialSecurityNumber;
    private double hourlyRate;
    private int numberOfHoursWorked;

    @Override
    public void calculatePay() {
         this.setAverageMonthlySalary(hourlyRate * numberOfHoursWorked);
    }

    public SalariedEmployee(String employeeld, String socialSecurityNumber, double hourlyRate, int numberOfHoursWorked) {
        super(employeeld);
        this.socialSecurityNumber = socialSecurityNumber;
        this.hourlyRate = hourlyRate;
        this.numberOfHoursWorked = numberOfHoursWorked;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public int getNumberOfHoursWorked() {
        return numberOfHoursWorked;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        socialSecurityNumber = socialSecurityNumber;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public void setNumberOfHoursWorked(int numberOfHoursWorked) {
        this.numberOfHoursWorked = numberOfHoursWorked;
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" +
                "socialSecurityNumber='" + socialSecurityNumber + '\'' +
                ", hourlyRate=" + hourlyRate +
                ", numberOfHoursWorked=" + numberOfHoursWorked +

                "} " + super.toString() +
                ".\nThe average monthly salary =" + this.getAverageMonthlySalary()
                +"\n _____________________";
    }
}
