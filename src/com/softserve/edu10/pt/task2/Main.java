package com.softserve.edu10.pt.task2;

import java.util.*;

class Employee {
    private int id;
    private String name;
    private String position;
    private double salary;
    private String dateOfBirth;

    public Employee(int id, String name, String position, double salary, String dateOfBirth) {
        this.id = id;
        this.name = name;
        this.position = position;
        this.salary = salary;
        this.dateOfBirth = dateOfBirth;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                '}';
    }
}

public class Main {
    public static void main(String[] args) {
        Map<Integer, Employee> idEmployeeMap = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add Employee");
            System.out.println("2. Display Employee by ID");
            System.out.println("3. Display ID by Name");
            System.out.println("4. Edit Employee Information");
            System.out.println("5. Display Sorted Employees");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addEmployee(idEmployeeMap, scanner);
                    break;
                case 2:
                    displayEmployeeById(idEmployeeMap, scanner);
                    break;
                case 3:
                    displayIdByName(idEmployeeMap, scanner);
                    break;
                case 4:
                    editEmployeeInformation(idEmployeeMap, scanner);
                    break;
                case 5:
                    displaySortedEmployees(idEmployeeMap, scanner);
                    break;
                case 6:
                    System.out.println("Exiting program. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }

    private static void addEmployee(Map<Integer, Employee> idEmployeeMap, Scanner scanner) {
        System.out.print("Enter ID: ");
        int inputId = scanner.nextInt();

        if (idEmployeeMap.containsKey(inputId)) {
            System.out.println("Employee with this ID already exists. Adding canceled.");
            return;
        }

        System.out.print("Enter the name: ");
        String inputName = scanner.next();
        System.out.print("Enter the position: ");
        String inputPosition = scanner.next();
        System.out.print("Enter the salary: ");
        double inputSalary = scanner.nextDouble();
        System.out.print("Enter the date of birth (YYYY-MM-DD): ");
        String inputDateOfBirth = scanner.next();

        Employee newEmployee = new Employee(inputId, inputName, inputPosition, inputSalary, inputDateOfBirth);
        idEmployeeMap.put(inputId, newEmployee);

        System.out.println("Employee added successfully.");
    }

    private static void displayEmployeeById(Map<Integer, Employee> idEmployeeMap, Scanner scanner) {
        System.out.print("Enter ID: ");
        int inputId = scanner.nextInt();
        Employee employee = idEmployeeMap.getOrDefault(inputId, null);

        if (employee != null) {
            System.out.println(employee);
        } else {
            System.out.println("Employee not found");
        }
    }

    private static void displayIdByName(Map<Integer, Employee> idEmployeeMap, Scanner scanner) {
        System.out.print("Enter the name: ");
        String inputName = scanner.next();

        for (var entry : idEmployeeMap.entrySet()) {
            if (entry.getValue().getName().equals(inputName)) {
                System.out.println(inputName + ", id = " + entry.getKey());
                return;
            }
        }

        System.out.println("Name not found");
    }

    private static void editEmployeeInformation(Map<Integer, Employee> idEmployeeMap, Scanner scanner) {
        System.out.print("Enter ID: ");
        int inputId = scanner.nextInt();

        if (!idEmployeeMap.containsKey(inputId)) {
            System.out.println("Employee with this ID does not exist. Editing canceled.");
            return;
        }

        Employee employee = idEmployeeMap.get(inputId);

        System.out.println("Current Information:");
        System.out.println(employee);

        System.out.print("Enter the new name (leave blank to keep the current name): ");
        String newName = scanner.next();
        if (!newName.isBlank()) {
            employee.setName(newName);
        }

        System.out.print("Enter the new position (leave blank to keep the current position): ");
        String newPosition = scanner.next();
        if (!newPosition.isBlank()) {
            employee.setPosition(newPosition);
        }

        System.out.print("Enter the new salary (enter 0 to keep the current salary): ");
        double newSalary = scanner.nextDouble();
        if (newSalary != 0) {
            employee.setSalary(newSalary);
        }

        System.out.print("Enter the new date of birth (YYYY-MM-DD, leave blank to keep the current date of birth): ");
        String newDateOfBirth = scanner.next();
        if (!newDateOfBirth.isBlank()) {
            employee.setDateOfBirth(newDateOfBirth);
        }

        System.out.println("Employee information updated successfully.");
    }

    private static void displaySortedEmployees(Map<Integer, Employee> idEmployeeMap, Scanner scanner) {
        System.out.println("1. Sort by ID");
        System.out.println("2. Sort by Name");
        System.out.println("3. Sort by Salary");
        System.out.print("Enter your choice: ");

        int sortChoice = scanner.nextInt();

        List<Employee> employees = new ArrayList<>(idEmployeeMap.values());

        switch (sortChoice) {
            case 1:
                employees.sort(Comparator.comparing(Employee::getId));
                break;
            case 2:
                employees.sort(Comparator.comparing(Employee::getName));
                break;
            case 3:
                employees.sort(Comparator.comparing(Employee::getSalary));
                break;
            default:
                System.out.println("Invalid choice. Displaying unsorted employees.");
        }

        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
