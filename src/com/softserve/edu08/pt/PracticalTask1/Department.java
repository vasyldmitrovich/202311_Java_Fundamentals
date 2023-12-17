package com.softserve.edu08.pt.PracticalTask1;

public class Department implements Cloneable {
    private String name;

    //Write toString after getters and setters
    //And move Constructors after fields and before getters
    @Override
    public String toString() {
        return "Department{" +
                "name='" + name + '\''
                ;
    }

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
            clone.address = (Address) address.clone();
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    public class Address implements Cloneable {
        public Address(String city, String street, int buildingNumber) {
            this.city = city;
            this.street = street;
            this.buildingNumber = buildingNumber;
        }

        @Override
        public String toString() {
            return Department.this.toString() + "Address{" +
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

        //Fields should be at the top of the class
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
