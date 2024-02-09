package softserve.edu03.hw;

public class Employee {
    private String name;
    private double rate;
    private double hours;

    private static double totalSum = 0;


    public Employee() {
    }

    public Employee(String name, double rate, double hours) {
        this.name = name;
        this.rate = rate;
        this.hours = hours;
        calculateTotalSum();
    }

    public String getName() {
        return name;
    }

    public double getRate() {
        return rate;
    }

    public double getHours() {
        return hours;
    }

    public static double getTotalSum() {
        return totalSum;
    }

    public double getSalary() {
        return rate * hours;
    }

    public double getBonuses() {
        return 0.1 * getSalary();
    }


    private void calculateTotalSum() {
        totalSum += getSalary();
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", rate=" + rate +
                ", hours=" + hours +
                ", salary=" + getSalary() +
                ", bonuses=" + getBonuses() +
                '}';
    }

    public static void main(String[] args) {

        Employee employee1 = new Employee("Max", 20.0, 40.0);
        Employee employee2 = new Employee("Ann", 25.0, 35.0);
        Employee employee3 = new Employee("Danylo", 18.0, 45.0);

        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);

        System.out.println("Total Salary of All Employees: " + Employee.getTotalSum());
    }
}

