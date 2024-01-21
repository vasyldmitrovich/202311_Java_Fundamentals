package com.softserve.edu14.hw.task1;

import java.time.LocalDate;

public class Product {

    private String manufactureCategory;
    private String name;
    private LocalDate dateOfManufacture;
    private double price;
    private int nextId;
    private static int id = 1;


    public Product(String manufactureCategory,String name, LocalDate dateOfManufacture, double price) {
        this.nextId = id++;
        this.manufactureCategory = manufactureCategory;
        this.name = name;
        this.dateOfManufacture = dateOfManufacture;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufactureCategory() {
        return manufactureCategory;
    }

    public void setManufactureCategory(String manufactureCategory) {
        this.manufactureCategory = manufactureCategory;
    }

    public LocalDate getDateOfManufacture() {
        return dateOfManufacture;
    }

    public void setDateOfManufacture(LocalDate dateOfManufacture) {
        this.dateOfManufacture = dateOfManufacture;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product: " + "Id : " + nextId +
                ", manufacture category = " + manufactureCategory +
                ", name = " + name +
                ", date of manufacture : " + dateOfManufacture +
                ", price = " + price;
    }
}
