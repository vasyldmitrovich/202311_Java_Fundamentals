package com.softserve.edu05.pt05;

import java.util.Arrays;

public class CheckArrays {
    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 12, 5, 4, 9};
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        int ix = Arrays.binarySearch(arr, 6);
        System.out.println("6 is found at " + ix);
        if (ix >= 0) {
            System.out.println(arr[ix] == 6);
        }
        System.out.println(Arrays.toString(arr));

    }

    static void bubbleSort(int[] data) {
        for (int i = 0; i < data.length - 1; i++) {
            for (int j = 0; j < data.length - i - 1; j++) {
                if (data[j] > data[j + 1]) {
                    swap(data, j, j + 1);
                }
            }
        }
    }

    static void swap(int[] data, int ix1, int ix2) {
        int tmp = data[ix1];
        data[ix1] = data[ix2];
        data[ix2] = tmp;
    }
}
