package com.softserve.edu10.pt.pt2;

import java.text.ParseException;
import java.util.*;

public class pt2 {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) throws ParseException {
        Map<Integer, Employee> employeeMap = new HashMap<>();
        loop:
        while (true) {
            System.out.println("Select an action:\n" +
                    "1. introduction of a new employee;\n" +
                    "2. Editing an employee by ID;\n" +
                    "3. Withdrawal of employees;\n" +
                    "4. Sort;\n" +
                    "5. exit.");
            int i = SCANNER.nextInt();
            switch (i) {
                case (1):
                    enterNewEmployee(employeeMap);
                    break;
                case (2):
                    editEmployee(employeeMap);
                    break;
                case (3):
                    System.out.println(employeeMap);
                    break;
                case (4):
                    sortEmployee(employeeMap);
                    break;
                case (6):
                    employeeMap.put(22,new Employee(22,"Bob","rrrr",10000.01,"29.08.1989"));
                    employeeMap.put(1,new Employee(1,"Alice","stu",9999.99,"10.05.1989"));
                    employeeMap.put(13,new Employee(13,"Vasya","hgf",10000.00,"11.08.1989"));
                    employeeMap.put(56,new Employee(56,"Lee","gfdgfd",19000.00,"11.08.1989"));
                    employeeMap.put(2,new Employee(2,"Jack","ewqewq",9000.00,"11.03.1989"));
                    break;
                case (5):
                    break loop;
                default:
                    break;
            }
        }


    }

    static void sortEmployee(Map<Integer, Employee> employeeMap) {
        System.out.println("sort by:\n" +
                "1. ID\n" +
                "2. Name\n" +
                "3. position\n" +
                "4. salary");
        int i = SCANNER.nextInt();
        SCANNER.nextLine();
        switch (i) {
            case 1:
                employeeMap.entrySet().stream()
                        .sorted(Comparator.comparing(employee -> employee.getValue().getId()))
                        .forEach(System.out::println);

                break;
            case 2:
                employeeMap.entrySet().stream()
                        .sorted(Comparator.comparing(employee -> employee.getValue().getName()))
                        .forEach(System.out::println);
                break;
            case 3:
                employeeMap.entrySet().stream()
                        .sorted(Comparator.comparing(employee -> employee.getValue().getPosition()))
                        .forEach(System.out::println);
                break;
            case 4:
                employeeMap.entrySet().stream()
                        .sorted(Comparator.comparing(employee -> employee.getValue().getSalary()))
                        .forEach(System.out::println);
                break;
            default:
                break;
        }

    }

    static void editEmployee(Map<Integer, Employee> employeeMap) {

        System.out.println("Enter id:");
        int id = SCANNER.nextInt();

        if (employeeMap.containsKey(id)) {
            Employee employee = employeeMap.get(id);
            System.out.println("enter what we are editing:\n" +
                    "1. name;\n" +
                    "2. position;\n" +
                    "3. salary");
            int i = SCANNER.nextInt();
            SCANNER.nextLine();
            switch (i) {
                case 1:
                    System.out.println("old name:" + employee.name + ", enter new one:");
                    String newName = SCANNER.nextLine();
                    employee.setName(newName);
                    break;
                case 2:
                    System.out.println("old position:" + employee.position + ", enter new one:");
                    String newPosition = SCANNER.nextLine();
                    employee.setPosition(newPosition);
                    break;
                case 3:
                    System.out.println("old salary:" + employee.salary + ", enter new one:");
                    Double newSalary = SCANNER.nextDouble();
                    employee.setSalary(newSalary);
                    SCANNER.nextLine();
                    break;
                default:
                    break;

            }
        } else {
            System.out.println("there is no employee with this ID:" + id);
        }
    }

    static void ValueUnique(int id, Employee employee, Map<Integer, Employee> map) {
        if (!(map.containsKey(id) || map.containsValue(employee))) {
            map.put(id, employee);
        } else {
            System.out.println("pair {key,name} is not unique");
        }

    }

    static void enterNewEmployee(Map<Integer, Employee> employeeMap) throws ParseException {
        while (true) {

            System.out.println("Enter ID:");
            int idEmployee = SCANNER.nextInt();
            SCANNER.nextLine();

            System.out.println("Enter name:");
            String nameEmployee = SCANNER.nextLine();

            System.out.println("Enter position:");
            String positionEmployee = SCANNER.nextLine();

            System.out.println("Enter salary:");
            Double salaryEmployee = SCANNER.nextDouble();
            SCANNER.nextLine();

            System.out.println("Enter date of birth(d.M.yyyy):");
            String dateOfBirthEmployee = SCANNER.nextLine();

            Employee employee = new Employee(idEmployee, nameEmployee, positionEmployee, salaryEmployee, dateOfBirthEmployee);
            ValueUnique(idEmployee, employee, employeeMap);

            System.out.println("Add another employee(y/n)");
            String response = SCANNER.nextLine();
            if (!response.equalsIgnoreCase("y")) break;
        }
        ;
    }
}
