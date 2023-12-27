package com.softserve.edu09.hw.task2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class Student {
    private String name;
    private String group;
    private int course;
    private HashMap grades;

    public Student(String name, String group, int course) {
        this.name = name;
        this.group = group;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public HashMap getGrades() {
        return grades;
    }

    public void setGrades(HashMap grades) {
        this.grades = grades;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", group='" + group + '\'' +
                ", course='" + course + '\'' +
                ", grades=" + grades +
                '}';
    }

    public static List<Student> checking(List<Student> students) {
        Iterator<Student> iterator = students.listIterator();
        while (iterator.hasNext()) {
            Student curSt = iterator.next();
            HashMap<String, Integer> curGrades = curSt.getGrades();
            int sumGrades = 0;
            for (var n : curGrades.entrySet()) {
                sumGrades += n.getValue();
            }
            double average = curGrades.size() == 0 ? 0 : sumGrades / curGrades.size();
            if (average < 3) {
                iterator.remove();
            } else {
                curSt.setCourse(curSt.getCourse() + 1);
            }
        }

        return students;
    }

    public static void printStudents(List<Student> students, int course) {
        for (Student st : students) {
            if (st.course == course) {
                System.out.println(st.getName());
            }
        }
    }
}
