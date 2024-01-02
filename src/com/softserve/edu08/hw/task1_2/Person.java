package com.softserve.edu08.hw.task1_2;

public abstract class Person implements Cloneable {
    private int age;
    FullName fullName;//Do this field private

    public Person(int age, FullName fullName) {
        this.age = age;
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static class FullName implements Cloneable{
        String FirstName;
        String LastName;

        public FullName(String firstName, String lastName) {
            FirstName = firstName;
            LastName = lastName;
        }

        public String getFirstName() {
            return FirstName;
        }

        public void setFirstName(String firstName) {
            FirstName = firstName;
        }

        public String getLastName() {
            return LastName;
        }

        public void setLastName(String lastName) {
            LastName = lastName;
        }

        @Override
        protected Object clone() throws CloneNotSupportedException {
            return super.clone();
        }
    }

    public String info(){
           return ("First name: " + this.fullName.FirstName + ", Last name: " + this.fullName.LastName + ", age: " + this.age);
    }

    public abstract String activity();

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Person copyOfPerson = (Person) super.clone();
//        copyOfPerson.fullName = (Person.FullName) copyOfPerson.fullName.;
        return super.clone();
    }
}
