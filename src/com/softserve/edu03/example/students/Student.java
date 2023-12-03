package com.softserve.edu03.example.students;

public class Student {
    private String name;
    private double rating;
    static double totalRating;
    static int totalStudent;

    public Student() {
        this("N/A", 0);
    }

    public Student(String name, double rating) {
        this.name = name;
        this.rating = rating;
        totalStudent++;
        totalRating += rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRating() {
        return (int) rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    static public double avgRating() {
        return totalRating / totalStudent;
    }

    static public int getTotalRating() {
        return (int) totalRating;
    }
}
