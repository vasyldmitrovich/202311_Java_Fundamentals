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

        } while(map.size() != 7);

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
}




