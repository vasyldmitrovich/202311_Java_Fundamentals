package Sorokotiaha.com.softserve.edu01.hw;

import com.softserve.edu01.hw.Task;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        var task = new Scanner(System.in);
        System.out.print("task:");
        int numberTask = task.nextInt();
        System.out.println("_____");
        switch (numberTask){
            case (1):
                Task.task1();
                break;
            case (2):
                Task.task2();
                break;
            case (3):
                Task.task3();
                break;
            default:
                System.out.print("incorrect value");
        }


    }
}

