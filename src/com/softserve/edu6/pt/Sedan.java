package com.softserve.edu6.pt;

class Sedan extends Car {
    private String classification;

    public Sedan(int maxSpeed, int yearOfProduction, String classification) {
        super(maxSpeed, yearOfProduction);
        this.classification = classification;
    }

    public void run() {
        System.out.println("sedan run");
    }

    public void stop() {
        System.out.println("sedan stop");
    }

    ;

    @Override
    public String toString() {
        return "Sedan{" +
                "classification='" + classification + '\'' +
                super.toString();
    }
}
