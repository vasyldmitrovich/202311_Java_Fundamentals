package com.softserve.edu02.hw;


import java.time.LocalDateTime;
import java.util.Scanner;

public class Person {


    private static int nextId = 1;

    private  int id;
    private String firstName;
    private String lastName;
    private int birthYear;

    public Person() {
        //default constructor
        this.id = 0;
        this.firstName = null;
        this.lastName = null;
        this.birthYear = 0;
    }

    public Person(String firstName,String lastName){
        //constructor
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Person(String firstName, String lastName, int birthYear) {

        this.id = nextId++;//authomatical id for readable printing person's info
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
    }

    public int getId(){
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getBirthYear() {
        return birthYear;
    }


    public int age(){
        //Calculating age (this year - birth year)
        return LocalDateTime.now().getYear() - getBirthYear();
    }

    public static Person input(){

        //Method that reads person's info from keyboard
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input first name : ");
        String firstName = scanner.nextLine();
        System.out.println("Input last name : ");
        String lastName = scanner.nextLine();
        System.out.println("Input birth year : ");
        int birthYear = scanner.nextInt();

        return new Person(firstName, lastName, birthYear);
    }

    public void changeName (String fn, String ln){

        //Method, that changes person's first and last names
        System.out.printf("You changed %d person's name and surname from %s %s to %s %s\n",getId(),
                getFirstName(),getLastName(),fn,ln);
        this.firstName = fn;
        this.lastName = ln;

    }

    public static void output(Person person){

        //Printing person's info
        System.out.printf("%d person info: \n",person.getId());
        System.out.printf("First name: %s \n", person.getFirstName());
        System.out.printf("Last name: %s \n", person.getLastName());
        System.out.printf("Birth year: %d \n", person.getBirthYear());
        System.out.printf("Age: %d\n",person.age());



    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthYear=" + birthYear +
                ", age=" + age() +
                '}';
    }


    public static void main(String[] args) {

        //Add info
        Person person1 = new Person("Maria","Brin",1978);
        Person person2 = new Person("Alex","Popov",1992);
        Person person3 = new Person("Riana","Kozimova",2004);
        Person person4 = new Person("Sofiia","Sova",2010);
        Person person5 = new Person("Maxim","Cazanli",2001);

        //Using output method
        Person.output(person1);
        Person.output(person2);
        Person.output(person3);
        Person.output(person4);
        Person.output(person5);
        person5.changeName("Max","Baxter");//Using changeName method
        Person.output(person5);



    }

}
