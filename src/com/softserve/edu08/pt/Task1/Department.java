package com.softserve.edu08.pt.Task1;

public class Department implements Cloneable{
    private String name;
    private Address address;

    public Department(String name, String city, String street, int building) {
        this.name = name;
        this.address = new Address(city,street,building);
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }


    public class Address{
        String city;
        String street;
         int building;

        public Address(String city, String street, int building) {
            this.city = city;
            this.street = street;
            this.building = building;
        }

        public String getCity() {
            return city;
        }

        public String getStreet() {
            return street;
        }

        public int getBuilding() {
            return building;
        }

        @Override
        public String toString() {
            return "Address: " +
                    "city = " + city +
                    ", street = " + street +
                    ", building=" + building;
        }
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Department clone = (Department) super.clone();

        clone.address = new Address(this.address.getCity(), this.address.getStreet(), this.address.getBuilding());
        return clone;
    }
}
