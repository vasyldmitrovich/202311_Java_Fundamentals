package com.softserve.edu8.hw;

class Student extends Person {
    private int course;

    public Student(FullName fullName, int age, int course) {
        super(fullName, age);
        this.course = course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    @Override
    String info() {
        return super.info() + " course:" + this.course;
    }

    @Override
    public String activity() {
        return " .I study at university";
    }
}
