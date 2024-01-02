package com.softserve.edu03.pt;


public class TemperatureConverter {
    public static double fahrenheitToCelsius(double temperatures) {

        return temperatures * 9 / 5 + 32;
    }

    public static void main(String[] args) {
        double c = fahrenheitToCelsius(256);
        System.out.println(c);
    }
}
