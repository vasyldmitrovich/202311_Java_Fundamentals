package com.softserve.edu08.pt;

public class Task1 {
    public static void main(String[] args) throws CloneNotSupportedException {

        Department department = new Department( "Obolonsky", new Department.Address("Kyiv", "Luk`janenka", 21));
        Department oneMoreDepartment = department.clone();

        System.out.println(department);
        System.out.println(oneMoreDepartment);
        System.out.println(">>>>>");

        oneMoreDepartment.address.setCity("Vinnytsya");
        System.out.println(department);
        System.out.println(oneMoreDepartment);
    }
}

class Department implements Cloneable {
    private String name;
    Address address;

    public Department(String field, Address address) {
        this.name = field;
        this.address = address;
    }

    static class Address implements Cloneable {
        private String city;
        private String street;
        private int building;

        public Address(String city, String street, int building) {
            this.city = city;
            this.street = street;
            this.building = building;
        }

        @Override
        public String toString() {
            return "Address{" +
                    "city='" + city + '\'' +
                    ", street='" + street + '\'' +
                    ", building=" + building +
                    '}';
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        @Override
        protected Object clone() throws CloneNotSupportedException {
            return super.clone();
        }
    }

    @Override
    public String toString() {
        return "Department{" +
                "name='" + name + '\'' +
                ", address=" + address +
                '}';
    }

    @Override
    public Department clone() {
        try {
            Department oneMoreDepartment = (Department) super.clone();
            oneMoreDepartment.address = (Address) oneMoreDepartment.address.clone();
            return oneMoreDepartment;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
