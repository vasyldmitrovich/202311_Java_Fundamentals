package Sorokotiaha.com.softserve.edu03.hw;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class hw3 {

    public static void main(String[] args) {

        var person1 = new Person();
        person1.input("Duke", "Nukem");
        person1.output();
        person1.getAge(1972);

        var person2 = new Person();
        person2.input("Jo", "Lee");
        person2.output();
        person2.getAge(1955);

        var person3 = new Person();
        person3.input("Bruce", "Lee");
        person3.output();
        person3.getAge(1903);

        var person4 = new Person();
        person4.input("Van", "Dam");
        person4.output();
        person4.getAge(1954);

        var person5 = new Person();
        person5.input("Voldemar", "Shtrich");
        person5.output();
        person5.getAge(2024);


    }

    public static class Person {
        private String firstName;
        private String lastName;
        private int birthYear;

        public Person() {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public void output() {
            System.out.println(firstName + " " + lastName);
        }

        public void input(String firstName, String lastName) {

            this.firstName = firstName;
            this.lastName = lastName;
        }

        public void getAge(int birthYear) {

            Calendar calendar = new GregorianCalendar();

            this.birthYear = birthYear;
            int year = (calendar.get(Calendar.YEAR) - this.birthYear);
            if (year > 0) {
                System.out.println("year " + year);
            }
            else {
                System.out.println("not born yet for the current year");
            }
        }

    }
}
