package com.softserve.edu8.pt;

public class pt1 {
    public static void main(String[] args) {
        Department carGo = new Department("cargo", new Department.Address("Kharkov", "Heroiv praci", 4));

        System.out.println("original:" + carGo);

        Department copyOfDepartment = carGo.clone();
        copyOfDepartment.address.city = "Kiev";
        System.out.println("original:" + carGo);
        System.out.println("clone:" + copyOfDepartment);

    }
}

