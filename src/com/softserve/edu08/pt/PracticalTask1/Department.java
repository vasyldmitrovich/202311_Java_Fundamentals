package com.softserve.edu08.pt.PracticalTask1;

public class Department implements Cloneable {
    private String name;
    private Address address;

    public Department(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

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
    public Department clone() {
        try {
            Department clone = (Department) super.clone();
            clone.address = (Address) clone.address.clone();
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    @Override
    public String toString() {
        return "Department{" +
                "name='" + name + '\'' +
                ", address=" + address +
                '}';
    }

    public class Address implements Cloneable {
        public Address(String city, String street, int buildingNumber) {
            this.city = city;
            this.street = street;
            this.buildingNumber = buildingNumber;
        }

        @Override
        public String toString() {
            return "Address{" +
                    "city='" + city + '\'' +
                    ", street='" + street + '\'' +
                    ", buildingNumber=" + buildingNumber +
                    '}';
        }

        public void setCity(String city) {
            this.city = city;
        }

        public void setStreet(String street) {
            this.street = street;
        }

        public void setBuildingNumber(int buildingNumber) {
            this.buildingNumber = buildingNumber;
        }

        public String getCity() {
            return city;
        }

        public String getStreet() {
            return street;
        }

        public int getBuildingNumber() {
            return buildingNumber;
        }

        private String city;
        private String street;
        private int buildingNumber;

        @Override
        public Address clone() {
            try {
                Address clone = (Address) super.clone();
                return clone;
            } catch (CloneNotSupportedException e) {
                throw new AssertionError();
            }
        }
    }
}
