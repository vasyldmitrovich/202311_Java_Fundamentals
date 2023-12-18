package com.softserve.edu08.hw.task1_2;

import com.softserve.edu08.pt.Department;

public class Student extends Person implements Cloneable {
    private int course;

    public Student(int age, FullName fullName, int course) {
        super(age, fullName);
        this.course = course;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    @Override
    public String info() {
        return super.info() + ", course: " + this.course;
    }

    @Override
    public String activity() {
        return " I study at university.";
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Student copyOfStudent = (Student) super.clone();
        copyOfStudent.fullName = (Person.FullName) copyOfStudent.fullName.clone();
        return super.clone();
    }
}
