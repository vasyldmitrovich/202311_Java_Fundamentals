package com.softserve.edu10.pt.Task1;

import com.softserve.edu05.pt.Task4.Employee;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Map<Integer,String> employeeMap = new HashMap<>();
        employeeMap.put(1,"Alex");
        employeeMap.put(2,"Marina");
        employeeMap.put(3,"Bob");
        employeeMap.put(4,"Serj");
        employeeMap.put(5,"Mark");
        employeeMap.put(6,"Boris");
        employeeMap.put(7,"Gregor");

        print(employeeMap);
        getEmployeeByKey(employeeMap);
        getEmployeeByName(employeeMap);
    }

    public static void print(Map <Integer,String> map){
        for(var entry : map.entrySet()){
            System.out.println(entry.getKey() +
                    ", " + entry.getValue());
        }
    }

    public static void getEmployeeByKey(Map <Integer,String> map){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter employee key to find: ");
        int key = scanner.nextInt();

        if(!map.containsKey(key)){
            System.out.println("No such matches with key " + key);
        } else {
            System.out.printf("Employee with key %d found : \n%s\n",key,map.get(key));
        }

    }
    public static void getEmployeeByName(Map <Integer,String> map){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter employee name to find: ");
        String name = scanner.nextLine();

        if(!map.containsValue(name)){
            System.out.println("No such matches with name " + name);
        } else {
        for (var entry : map.entrySet()){
            if(entry.getValue().equals(name)){
                System.out.printf("Employee with name %s found at %d position\n",name, entry.getKey());
                break;
            }
        }
        }

    }
}
