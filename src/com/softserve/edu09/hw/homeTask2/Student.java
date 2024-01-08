package com.softserve.edu09.hw.homeTask2;

import java.util.List;
import java.util.Map;

public class Student {
    private String name;
    private String group;
    private int course;
    private Map<String, Double> grades; //<Subject, Grade>

    public Student(String name, String group, int course, Map<String, Double> grades) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.grades = grades;
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

    public Map<String, Double> getGrades() {
        return grades;
    }

    public void setGrades(Map<String, Double> grades) {
        this.grades = grades;
    }

    public double getAverageGrade() {
        double sum = 0;
        for (var el : grades.values()) {
            sum += el;
        }
        return sum / grades.size();
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", group='" + group + '\'' +
                ", course=" + course +
                ", grades=" + grades +
                ", avg =" + getAverageGrade() +
                '}';
    }

    public static void removeFromUniversityOrPromoteOnNextCourse(List<Student> students) {
        var it = students.iterator();
        while (it.hasNext()) {
            var student = it.next();
            if (student.getAverageGrade() < 3) {
                it.remove();
            } else {
                student.course++;
            }
        }
    }

    public static void printStudents(List<Student> students, int course) {
        System.out.print("On course " + course + ": ");
        boolean listHaveStudentOnThisCourese = false;
        for (var student : students) {
            if (student.getCourse() == course) {
                System.out.print(student.getName() + " ");
                listHaveStudentOnThisCourese = true;
            }
        }
        if(!listHaveStudentOnThisCourese){
            System.out.println("no students");
        }

    }


}
