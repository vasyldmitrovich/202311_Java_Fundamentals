package com.softserve.edu10.pt.task1_2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

import static com.softserve.edu01.hw.App.scanner;

public class App {
    public static void main(String[] args) {

        LinkedHashMap<Integer, Employee> employeeMap = new LinkedHashMap<>();

        employeeMap.put(1, new Employee(1, "Petro"));
        employeeMap.put(2, new Employee(2, "Vasil"));
        employeeMap.put(4, new Employee(4, "Nataliia"));
        employeeMap.put(3, new Employee(3, "Volodimir"));
        employeeMap.put(7, new Employee(7, "Marina"));
        employeeMap.put(5, new Employee(5, "Olena"));
        employeeMap.put(6, new Employee(6, "Roman"));

        Scanner scanner = new Scanner(System.in);
        //adding the new employee task2
        addingEmployees(employeeMap);
        //adding the additional information task2
        addingAdditionalInformation(employeeMap);


        System.out.println("===========================================");
        System.out.println("");
        //sort by ID
        sortById(employeeMap);

        System.out.println("===========================================");
        System.out.println("");
        //sort by position
        sortByPosition(employeeMap);

        System.out.println("===========================================");
        System.out.println("");
        //sort by salary
        sortBySalary(employeeMap);

        //looking for Id
        System.out.println("Enter employee's id:");
        int id = Integer.parseInt(scanner.nextLine());
        if (employeeMap.containsKey(id)) {
            System.out.println(employeeMap.get(id));
        } else System.out.println("Such id is not founded");

        //looking for the name
        System.out.println("Enter the employee's name");
        String name = scanner.nextLine();
        boolean nameIsFounded = false;
        for (Map.Entry<Integer, Employee> em : employeeMap.entrySet()) {
            if (em.getValue().equals(name)) {
                System.out.println("id = " + em.getKey());
                nameIsFounded = true;
            }
        }
        if (!nameIsFounded) {
            System.out.println("Employee with name " + name + " is not founded");
        }
    }

    public static void addingEmployees(HashMap<Integer, Employee> employeeMap) {
        String desire = "y";
        while (desire.toLowerCase().equals("y")) {
            System.out.println("Do you want to add new employee (y/n)?");
            desire = scanner.nextLine();
            if (desire.toLowerCase().equals("y")) {
                System.out.println("Enter employee's name:");
                String newName = scanner.nextLine();
                if (employeeMap.containsValue(newName)) {
                    System.out.println("Such name already exists.");
                } else {
                    List<Integer> keyList = new ArrayList<>(employeeMap.keySet());
                    Collections.sort(keyList);
                    int maxId = keyList.get(keyList.size() - 1);
                    Employee duringEmp = new Employee(maxId + 1, newName);
                    employeeMap.put(maxId + 1, duringEmp);
                    System.out.println("Enter employee's position: ");
                    String position = scanner.nextLine();
                    duringEmp.setPosition(position);
                    System.out.println("Enter employee's salary: ");
                    int salary = Integer.parseInt(scanner.nextLine());
                    duringEmp.setSalary(salary);
                    System.out.println("Enter employee's date of birth(\"yyyy-MM-dd\"): ");
                    String birthday = scanner.nextLine();
                    try {
                        Date employeeBirthday = new SimpleDateFormat("yyyy-MM-dd").parse(birthday);
                        duringEmp.setDateOfBirth(employeeBirthday);
                    } catch (ParseException e) {
                        System.out.println("Date of birth is not readable");
                    }
                }
            }
        }
    }

    public static void addingAdditionalInformation(HashMap<Integer, Employee> employeeMap) {
        String desire = "y";
        while (desire.toLowerCase().equals("y")) {
            System.out.println("Do you want to add additional information for existed employee (y/n)?");
            desire = scanner.nextLine();
            if (desire.toLowerCase().equals("y")) {
                System.out.println("Enter employee's Id:");
                int lookedId = Integer.parseInt(scanner.nextLine());
                if (!employeeMap.containsKey(lookedId)) {
                    System.out.println("Such Id is not found.");
                } else {
                    Employee duringEmp = employeeMap.get(lookedId);
                    System.out.println("Enter employee's position: ");
                    String position = scanner.nextLine();
                    duringEmp.setPosition(position);
                    System.out.println("Enter employee's salary: ");
                    int salary = Integer.parseInt(scanner.nextLine());
                    duringEmp.setSalary(salary);
                    System.out.println("Enter employee's date of birth(\"yyyy-MM-dd\"): ");
                    String birthday = scanner.nextLine();
                    try {
                        Date employeeBirthday = new SimpleDateFormat("yyyy-MM-dd").parse(birthday);
                        duringEmp.setDateOfBirth(employeeBirthday);
                    } catch (ParseException e) {
                        System.out.println("Date of birth is not readable");
                    }
                }
            }
        }
    }

    public static void sortById(HashMap<Integer, Employee> employeeMap) {
        List<Integer> keyList = new ArrayList<>(employeeMap.keySet());
        Collections.sort(keyList);
        for (var l : keyList) {
            System.out.println(employeeMap.get(l));
        }
    }

    public static void sortByPosition(HashMap<Integer, Employee> employeeMap) {
        List<Map.Entry<Integer, Employee>> sortedList = new ArrayList<>();
        for (var entry : employeeMap.entrySet()) {
            sortedList.add(entry);
        }
        sortedList.sort(Map.Entry.comparingByValue(Employee::compareTo));
        for (var l : sortedList) {
            System.out.println(l);
        }
    }

    public static void sortBySalary(HashMap<Integer, Employee> employeeMap) {
        List<Map.Entry<Integer, Employee>> sortedList = new ArrayList<>();
        for (var entry : employeeMap.entrySet()) {
            sortedList.add(entry);
        }
        Comparator<Employee> salaryComparator = new EmployeeSalaryComparator();
        sortedList.sort(Map.Entry.comparingByValue(salaryComparator));
        for (var l : sortedList) {
            System.out.println(l);
        }
    }
}
