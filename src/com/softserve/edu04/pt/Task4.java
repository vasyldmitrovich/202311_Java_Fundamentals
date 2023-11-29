package com.softserve.edu04.pt;

import java.util.Scanner;

public class Task4 {
    public static final Scanner SCANNER = new Scanner( System.in );

    public static void main(String[] args) {

        Product pd1 = new Product("one");
        Product pd2 = new Product("two");
        Product pd3 = new Product("three");
        Product pd4 = new Product("four");

        Product pd = findMostExpensiveProduct(pd1, pd2, pd3, pd4);
        System.out.println("Product " + pd.getName() + " is the most expensive product.");
        System.out.println("There are " + pd.getQuantity() + " items of this product " + pd.getName() + " in inventory.");

        pd = findProductWithLargestQuantity(pd1, pd2, pd3, pd4);
        System.out.println("There are " + pd.getQuantity() + " items of product " + pd.getName() +
                " in inventory, more than there are items of any other product.");

    }

    // method determines the product with the highest price
    public static Product findMostExpensiveProduct(Product pd1, Product pd2, Product pd3, Product pd4 ) {
        if (( pd1.getPrice() > pd2.getPrice() ) &&
            ( pd1.getPrice() > pd3.getPrice() ) &&
            ( pd1.getPrice() > pd4.getPrice() ) ) {
            return pd1;
        } else if (
            ( pd2.getPrice() > pd3.getPrice() ) &&
            ( pd2.getPrice() > pd4.getPrice() ) ) {
            return pd2;
        } else if (
            ( pd3.getPrice() > pd4.getPrice() ) ) {
            return pd3;
        } else { return pd4; }
    }

    // method determines the product with the largest quantity
    public static Product findProductWithLargestQuantity(Product pd1, Product pd2, Product pd3, Product pd4 ) {
        if (( pd1.getQuantity() > pd2.getQuantity() ) &&
            ( pd1.getQuantity() > pd3.getQuantity() ) &&
            ( pd1.getQuantity() > pd4.getQuantity() ) ) {
            return pd1;
        } else if (
            ( pd2.getQuantity() > pd3.getQuantity() ) &&
            ( pd2.getQuantity() > pd4.getQuantity() ) ) {
            return pd2;
        } else if (
            ( pd3.getQuantity() > pd4.getQuantity() ) ) {
            return pd3;
        } else { return pd4; }
    }

    public static class Product {
        private String name;
        private double price;
        private int quantity;

        public Product(String number) {
            System.out.print("Enter the name of product " + number + ": ");
            name = SCANNER.nextLine();

            System.out.print("Enter the price of this product: ");
            price = SCANNER.nextInt();
            SCANNER.nextLine();

            System.out.print("Enter quantity for this product: ");
            quantity = SCANNER.nextInt();
            SCANNER.nextLine();

            System.out.println();
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
}

