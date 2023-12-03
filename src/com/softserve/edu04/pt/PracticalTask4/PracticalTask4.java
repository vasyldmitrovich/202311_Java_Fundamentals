package com.softserve.edu04.pt.PracticalTask4;

public class PracticalTask4 {
    public static void run() {
        Product product1 = new Product("Table", 1, 2000.0);
        Product product2 = new Product("Lamp", 2, 10.0);
        Product product3 = new Product("Chair", 4, 40.0);
        Product product4 = new Product("Cup", 10, 1000.0);

        Product mostExpensive = product1;
        if (product2.getPrice() > mostExpensive.getPrice()) {
            mostExpensive = product2;
        }
        if (product3.getPrice() > mostExpensive.getPrice()) {
            mostExpensive = product3;
        }
        if (product4.getPrice() > mostExpensive.getPrice()) {
            mostExpensive = product4;
        }

        Product mostQuantity = product1;
        if (product2.getQuantity() > mostQuantity.getQuantity()) {
            mostQuantity = product2;
        }
        if (product3.getQuantity() > mostQuantity.getQuantity()) {
            mostQuantity = product3;
        }
        if (product4.getQuantity() > mostQuantity.getQuantity()) {
            mostQuantity = product4;
        }


        System.out.println("The most expensive product: " + mostExpensive.getName());
        System.out.println("The most quantity product: " + mostQuantity.getName());


    }
}
