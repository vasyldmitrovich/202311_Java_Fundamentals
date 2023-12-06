package com.softserve.edu05.pt;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

// SORRY I do not get this

class Task4Test {
    @Test
    @DisplayName("works with an empty array")
    void test1() {
        Task4.sortingBySalary(new Employee[0]);
    }

    @Test
    @DisplayName("works with just one object in the array")
    void test2() {
        // arrange  given
        Employee[] arr = {new Employee("Bob", 1, 2000)};
        // act      when
        Task4.sortingBySalary(arr);
        // assert   then
        assertEquals(1,arr[0]);
    }

    @Test
    @DisplayName("sorts by salary")
    void test3() {
        Employee[] employees = {
                new Employee("Bob", 1, 50),
                new Employee("Sam", 2, 51),
                new Employee("Bill", 2, 52),
                new Employee("Pedro", 3, 49),
                new Employee("Juan", 3, 48),
        };
        Task4.sortingBySalary(employees);

    }
}