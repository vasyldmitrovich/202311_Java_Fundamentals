package com.softserve.edu08.hw.HomeTask2;

import com.softserve.edu08.hw.HomeTask1.FullName;
import com.softserve.edu08.hw.HomeTask1.Person;

public class Student extends Person implements Cloneable {
    private int course;

    public Student(FullName fullName, int age, int course) {
        super(fullName, age);
        this.course = course;
    }

    @Override
    public String info() {
        return super.info() + ", Course: " + course;
    }

    @Override
    public String activity() {
        return "I study at university";
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    @Override
    public Student clone() {
        try {
            Student res = (Student) super.clone();
            return res;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
