package com.softserve.edu08.pt.task1;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] x = new int[10];
        Random random = new Random();
        for (int i = 0; i < x.length; i++) {
            x[i] = random.nextInt(10);
        }
        System.out.println(Arrays.toString(x));
        Arrays.sort(x);
        System.out.println(Arrays.toString(x));
    }
}
