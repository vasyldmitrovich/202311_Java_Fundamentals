package com.softserve.edu01.additionalTasks;

import java.util.Scanner;


public class CuboidVolume {

    public static Scanner scanner = new Scanner(System.in);

    public static int volume (int length, int width, int height ){

    return length * width * height;
    }


    public static void main(String[] args) {

        //Task: Bob needs a fast way to calculate the volume of a cuboid with three values:
        // the length, width and height of the cuboid.
        // Write a function to help Bob with this calculation.

        System.out.println("Enter cuboid parameters to calculate it's volume");

        System.out.println("Enter length:");
        int length = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter width:");
        int width = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter height:");
        int height = Integer.parseInt(scanner.nextLine());

        System.out.printf("Volume = %d",volume(length,width,height));

    }
}
