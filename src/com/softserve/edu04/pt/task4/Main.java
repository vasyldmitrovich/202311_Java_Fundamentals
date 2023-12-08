package com.softserve.edu04.pt.task4;


public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("Cigar", 224.5, 39);
        Product product2 = new Product("Laptop", 1430, 12);
        Product product3 = new Product("Socks", 10.7, 63);
        Product product4 = new Product("Adapter", 31, 7);

        Product mostExpensiveItem = product1;
        if (product2.getPrice() > mostExpensiveItem.getPrice()) {
            mostExpensiveItem = product2;
        }
        if (product3.getPrice() > mostExpensiveItem.getPrice()) {
            mostExpensiveItem = product3;
        }
        if (product4.getPrice() > mostExpensiveItem.getPrice()) {
            mostExpensiveItem = product4;
        }

        System.out.println("The most expensive item is " + mostExpensiveItem.getName());

        Product biggestQuantity = product1;
        if (product2.getQuantity() > biggestQuantity.getQuantity()) {
            biggestQuantity = product2;
        }
        if (product3.getQuantity() > biggestQuantity.getQuantity()) {
            biggestQuantity = product3;
        }
        if (product4.getQuantity() > biggestQuantity.getQuantity()) {
            biggestQuantity = product4;
        }

        System.out.println("The biggest quantity is " + biggestQuantity.getName());

    }

}

class Product {
    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }
}
