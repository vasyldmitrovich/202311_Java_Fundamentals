package com.softserve.edu08.pt.task1;

public class Department {
    private String name;
    private Address address;

    public Department(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Department{" +
                "name='" + name + '\'' +
                ", address=" + address +
                '}';
    }

    static class Address {
        private String city;
        private String street;
        private int houseNumber;

        public Address(String city, String street, int houseNumber) {
            this.city = city;
            this.street = street;
            this.houseNumber = houseNumber;
        }

        public String getCity() {
            return city;
        }

        public String getStreet() {
            return street;
        }

        public int getHouseNumber() {
            return houseNumber;
        }

        @Override
        public String toString() {
            return "Address{" +
                    "city='" + city + '\'' +
                    ", street='" + street + '\'' +
                    ", houseNumber=" + houseNumber +
                    '}';
        }
    }
}
