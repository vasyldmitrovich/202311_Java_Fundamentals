package com.softserve.edu10.pt.Task2;

import java.util.*;


public class App {
    public static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {


        Map<Integer,Employee> employeeMap = new HashMap<>();

        fillMapManually(employeeMap);//Task 2 1st point
        print(employeeMap);
        getEmployeeByKey(employeeMap);//Ok for practical task 2
        getEmployeeByName(employeeMap);//Refactored from Task 1 for working with class Employee
        editInfoById(employeeMap);//Third point from task 2
        sortMapByEnteredCriteria(employeeMap);//Fourth point of task 2(sorting by entered criteria)

    }

    public static void fillMapManually(Map<Integer,Employee> map){

        //Task 2 1st point method
        int key;
        int counter = 1;
        Employee value;

        do {
            System.out.printf("Enter %d employee key:\n",counter);
            key = Integer.parseInt(SCANNER.nextLine());
            System.out.printf("Enter %d employee info:\n",counter);
            value = Employee.getEmployee();

            if(!map.containsKey(key) && !map.containsValue(value)){
                map.put(key,value);
                counter++;
            } else{
                System.out.printf("Map already contains key %d and value %s\n",
                        key,value);
            }

        } while(map.size() != 7);//You can change 7 to 2 for easy testing

    }


    public static void print(Map <Integer,Employee> map){
        for(var entry : map.entrySet()){
            System.out.println(entry.getKey() +
                    ", " + entry.getValue());
        }
    }

    public static void getEmployeeByKey(Map <Integer,Employee> map) {

        System.out.println("Enter employee key to find: ");
        int key = SCANNER.nextInt();

        if (!map.containsKey(key)) {
            System.out.println("No such matches with key " + key);
        } else {
            System.out.printf("Employee with key %d found : \n%s\n", key, map.get(key));
        }

    }
    public static void getEmployeeByName(Map<Integer,Employee> map){

        System.out.println("Enter employee name to find: ");
        String name = SCANNER.nextLine();
        boolean found = false;

        for (var entry : map.entrySet()){
                Employee employee = entry.getValue();

                if(employee.getName().equals(name)){
                    System.out.printf("Employee with name %s found at %d position\n",name, entry.getKey());
                    System.out.println(employee.toString());
                    found = true;
                    break;
                }
            }
        if(!found){
            System.out.printf("No such matches with name %s",name);
        }

    }
    public static void editInfoById(Map<Integer,Employee> map){

        System.out.println("Enter employee id to edit info: ");
        int inputId = Integer.parseInt(SCANNER.nextLine());


        if (!map.containsKey(inputId)) {
            System.out.println("No such matches with key " + inputId);
        } else {
            Employee employee = map.get(inputId);

            System.out.print("Enter Name: ");
            String newName = SCANNER.nextLine();
            employee.setName(newName);

            System.out.print("Enter Position: ");
            String newPosition = SCANNER.nextLine();
            employee.setPosition(newPosition);

            System.out.print("Enter Salary: ");
            double newSalary = Double.parseDouble(SCANNER.nextLine());
            employee.setSalary(newSalary);

            System.out.print("Enter Date of Birth: ");
            String newDOB = SCANNER.nextLine();
            employee.setDob(newDOB);

            System.out.println("Info edited successfully!");
            System.out.println("New map: ");
            print(map);
        }

    }
    public static void sortMapByEnteredCriteria(Map<Integer,Employee> map){

        List<Map.Entry<Integer,Employee> > newList = new ArrayList<>(map.entrySet());

        System.out.println("Enter criteria for employee sorting(id/name/position) ");
        String input = SCANNER.nextLine();

        switch (input.toLowerCase(Locale.ROOT)){
            case "id" -> newList.sort(Comparator.comparingInt(Map.Entry::getKey));
            case "name"-> newList.sort(Comparator.comparing(entry -> entry.getValue().getName()));
            case "position"-> newList.sort(Comparator.comparing( entry-> entry.getValue().getPosition() ));
            default -> System.out.println("Invalid sorting criterion.");
        }
        System.out.println("Sorted Employee Map Contents:");
        for (Map.Entry<Integer, Employee> entry : newList) {
            System.out.println(entry.getValue());
        }

    }


}




