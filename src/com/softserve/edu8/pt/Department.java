package com.softserve.edu8.pt;

class Department implements Cloneable{
    String name;
    Address address;

    @Override
    public String toString() {
        return "Department{" +
                "name='" + name + '\'' +
                ", address=" + address +
                '}';
    }

    public Department(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    @Override
    public Department clone() {
        try {
            Department clone = (Department) super.clone();
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    static class Address {
        String city;
        String street;
        int houseNumber;

        @Override
        public String toString() {
            return "Address{" +
                    "city='" + city + '\'' +
                    ", street='" + street + '\'' +
                    ", houseNumber=" + houseNumber +
                    '}';
        }

        public Address(String city, String street, int houseNumber) {
            this.city = city;
            this.street = street;
            this.houseNumber = houseNumber;
        }
    }
}
