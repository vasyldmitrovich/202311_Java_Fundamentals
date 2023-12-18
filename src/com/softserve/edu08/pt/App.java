package com.softserve.edu08.pt;

import com.softserve.edu08.pt.Department.Adress;

public class App {
    public static void main(String[] args) {

        Department department1 = new Department("Sales");
        department1.setAdress(department1.new Adress("Krivij Rig", "Volodimira Velikogo", 20));

        System.out.println(department1);

        try {
            Department department2 = (Department) department1.clone();
            department2.adress.city = "Kijiv";
            System.out.println(department2);
        } catch (CloneNotSupportedException e){
                 e.printStackTrace();
        }

    }
}
