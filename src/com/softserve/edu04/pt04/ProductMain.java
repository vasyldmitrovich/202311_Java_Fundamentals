package com.softserve.edu04.pt04;

public class ProductMain {
    public static void main(String[] args) {
        Product product1 = new Product("Table", 1, 1000.0);
        Product product2 = new Product("Lamp", 20, 25.0);
        Product product3 = new Product("Chair", 4, 550.5);
        Product product4 = new Product("Cup", 5, 12.5);

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
        System.out.println("The most expensive product is: " + mostExpensive.getName());

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
        System.out.println("The most quantity product is: " + mostQuantity.getName());
    }
}
