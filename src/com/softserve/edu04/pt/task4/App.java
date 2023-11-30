package com.softserve.edu04.pt.task4;

public class App {
    public static void main(String[] args) {
        Product product1 = new Product("Car", 5500, 2);
        Product product2 = new Product("Train", 55600, 1);
        Product MostExpensive = getMostExpensive(product1, product2);
        Product MostQuantity = getMostQuantity(product1, product2);
        Product product3 = new Product("Boat", 3000, 5);
        MostExpensive = getMostExpensive(MostExpensive, product3);
        MostQuantity = getMostQuantity(MostQuantity, product3);

        System.out.println("Most expensive: " + MostExpensive.name + ", it's quantity: " + MostExpensive.quantity);
        System.out.println("The biggest quantity: " + MostQuantity.name);

    }

    static Product getMostExpensive(Product pr1, Product pr2) {
        return (pr1.price > pr2.price) ? pr1 : pr2;
    }

    static Product getMostQuantity(Product pr1, Product pr2) {
        return (pr1.quantity > pr2.quantity) ? pr1 : pr2;
    }
}
