package com.softserve.edu04.pt;

public class Product {

    private final String name;
    private final double price;
    private final int quantity;

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

    public static void main(String[] args) {

        Product product1 = new Product("Airpods", 100.0, 10);
        Product product2 = new Product("Laptop", 1000.0, 1);
        Product product3 = new Product("Hat", 10.0, 4);
        Product product4 = new Product("Tomatoes", 3.5, 2);

        Product mostExpensive = product1;

        if (mostExpensive.getPrice() < product2.getPrice()){
            mostExpensive = product2;
        } else if (mostExpensive.getPrice() < product3.getPrice()){
            mostExpensive = product3;
        }else if (mostExpensive.getPrice() < product4.getPrice()){
            mostExpensive = product4;
        }

        System.out.println("Most expensive product : " + mostExpensive.name );

        Product biggestQtty = product1;

        if (biggestQtty.getQuantity() < product2.getQuantity()){
            biggestQtty = product2;
        } else if (biggestQtty.getQuantity() < product3.getQuantity()){
            biggestQtty = product3;
        }else if (biggestQtty.getQuantity() < product4.getQuantity()){
            biggestQtty = product4;
        }

        System.out.println("Biggest quantity product : " + biggestQtty.name );

    }
}
