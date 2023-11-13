package com.softserve.edu;

import com.softserve.edu03.Student;

import java.io.IOException;

public class Main extends Student{
    public static void main(String[] args) throws IOException {
        //
        /*BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //
        System.out.print("Hello. What is your name? ");
        String name = br.readLine();
        //
        System.out.print("How old are you? ");
        int age = Integer.parseInt(br.readLine());
        //age =Integer.parseInt("345");
        //
        System.out.println("Hello " + name);
        System.out.println("You are " + age);
        //
        br.close();*/
        Student student = new Student();
        Student student2 = new Student();
        Student student3 = new Student();

        System.out.println("How many students = " + Student.count);
        Student student4 = new Student();
        Student.count = 100;
        System.out.println("How many students = " + Student.count);
        Student student5 = new Student("Vova","Belbo",33);
        Student student6 = new Student("Vova","Belbo",33);
        System.out.println("How many students = " + Student.count);

        String str = student.getProtectVariable();
        Main mmm = new Main();
        String sss = mmm.protectVariable;
        //System.out.println(sss);
    }
}
