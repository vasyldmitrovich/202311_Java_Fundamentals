package softserve.edu07.hw;

// Payment Interface
interface Payment {
    double calculatePay();
}

// Base abstract class Employee
abstract class Employee implements Payment {
    private String employeeId;

    public Employee(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeId() {
        return employeeId;
    }
}

// SalariedEmployee class implementing Payment interface
class SalariedEmployee extends Employee {
    private String socialSecurityNumber;

    public SalariedEmployee(String employeeId, String socialSecurityNumber) {
        super(employeeId);
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    @Override
    public double calculatePay() {
        // Implement calculation for fixed-paid workers
        return 5000.00; // Example fixed payment amount
    }
}

// ContractEmployee class implementing Payment interface
class ContractEmployee extends Employee {
    private String federalTaxId;

    public ContractEmployee(String employeeId, String federalTaxId) {
        super(employeeId);
        this.federalTaxId = federalTaxId;
    }

    public String getFederalTaxId() {
        return federalTaxId;
    }

    @Override
    public double calculatePay() {
        // Implement calculation for hourly-paid workers
        return 20.00 * 40.00; // Example hourly rate and hours worked
    }
}

// Main class
public class EmployeePaymentProgram {
    public static void main(String[] args) {
        SalariedEmployee salariedEmployee = new SalariedEmployee("S123", "SSN123456789");
        ContractEmployee contractEmployee = new ContractEmployee("C456", "FTI987654321");

        // Display information and calculate pay for SalariedEmployee
        System.out.println("Salaried Employee ID: " + salariedEmployee.getEmployeeId());
        System.out.println("Social Security Number: " + salariedEmployee.getSocialSecurityNumber());
        System.out.println("Calculated Pay: $" + salariedEmployee.calculatePay());
        System.out.println();

        // Display information and calculate pay for ContractEmployee
        System.out.println("Contract Employee ID: " + contractEmployee.getEmployeeId());
        System.out.println("Federal Tax ID: " + contractEmployee.getFederalTaxId());
        System.out.println("Calculated Pay: $" + contractEmployee.calculatePay());
    }
}
