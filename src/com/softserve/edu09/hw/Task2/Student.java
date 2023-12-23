package com.softserve.edu09.hw.Task2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Student {

    private String name;
    private String group;
    private int course;
    private List<Double> grades;

    public Student(String name, String group, int course, List<Double> grades) {
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

    public List<Double> getGrades() {
        return grades;
    }

    public void setGrades(List<Double> grades) {
        this.grades = grades;
    }

    public double calculateAverageGrade(){
     double sum = 0;

     for (var grade : grades){
         sum += grade;
     }
     return sum / grades.size();
    }

    public static void removeStudentIfGradeIsLowerThan3(List<Student> students){

        List<Student> studentsList = new ArrayList<>();
        delimiter();
        for (var student : students){
            studentsList.add(student);
        }

        Iterator<Student> iterator = studentsList.iterator();
        System.out.println("Students with poor grade removed from list (less than 3).\nRest is moved to next course!");
        while (iterator.hasNext()){
            Student student = iterator.next();
            if(student.calculateAverageGrade() < 3.0){
                iterator.remove();
            } else {
                student.course++;
            }
        }
        delimiter();
    }
    private String formatGrades() {//From GPT((( just for beautiful string formatting (btw, it's interesting enough)
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < grades.size(); i++) {
            sb.append(String.format("%.2f", grades.get(i).doubleValue()));
            if (i < grades.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Override
    public String toString() {
            return String.format("Name: %s, Group : %s , Course: %s , Grades : %s, Average grade : %.2f "
            ,name,group,course,formatGrades(),calculateAverageGrade());
            //Formatted output toString();
    }

    public static void print(List<Student> students){
        for (var student: students){
            System.out.println(student.toString());
        }
    }

    public static void printStudentsByCourse (List<Student> students, int course){

        List<Student> fromCurrentCourse = new ArrayList<>();
        delimiter();
        for (var student : students ){
            if (student.course == course){
                fromCurrentCourse.add(student);
            }
        }

        if (!fromCurrentCourse.isEmpty()){
            System.out.println("Students of " + course + " course : ");
            for (var student : fromCurrentCourse ){
                if (student.course == course){
                    System.out.println(student.getName());
                }
            }
        }else{
            System.out.printf("There is no students from %d course\n",course);
        }
        delimiter();

    }

    public static void delimiter(){
        System.out.println("=============");
    }
}
