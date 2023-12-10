package com.softserve.edu07.pt.Task2;

import org.w3c.dom.css.CSSStyleRule;

public class Teacher extends Staff{

    private final String TYPE_PERSON = "Teacher";

    public Teacher(String name) {
        super(name);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    void print() {
        super.print();
        System.out.println(TYPE_PERSON);
    }

    @Override
    public int salary() {
        return 3000;
    }
}
