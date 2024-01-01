package com.softserve.edu7.hw.hw1;

class ContractEmployee extends Employee implements Payment{
    private String FederalTaxIdmember;
    private double fixedMonthlyPayment;

    public ContractEmployee(String employeeld,  String federalTaxIdmember, double fixedMonthlyPayment) {
        super(employeeld);
        FederalTaxIdmember = federalTaxIdmember;
        this.fixedMonthlyPayment = fixedMonthlyPayment;
    }



    @Override
    public String toString() {
        return "ContractEmployee{" +
                "FederalTaxIdmember='" + FederalTaxIdmember + '\'' +
                ", fixedMonthlyPayment=" + fixedMonthlyPayment +
                "} " + super.toString() +
                ".\nThe average monthly salary =" + this.getAverageMonthlySalary()
                +"\n _____________________";
    }

    @Override
    public void calculatePay() {
        this.setAverageMonthlySalary(fixedMonthlyPayment);
    }
}
