package com.softserve.edu11.pt.Task1;

public class App {
    public static void main(String[] args) {//Good
        String str1 = "SoftServe Academy";
        String str2 = "SoftServe";
        String str3 = "Academy";//for additional checking

        System.out.println(str1.contains(str2));//Task 1 (main check). Ok
        System.out.println(str2.contains(str3));
        System.out.println(str1.contains(str3));
    }
}
