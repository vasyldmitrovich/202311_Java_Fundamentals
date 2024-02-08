/*Create a class called Student which includes the following fields: name, group, course, and
grades in different subjects. Create a collection that holds all objects. Write a methods that:
o removes students with a grade point average of less than 3. If a student's average score is
        3 or higher, then they will be automatically promoted to the next course level.
o printStudents(List<Student> students, int course) which takes a list of students and a
course number as inputs. This method should print out the names of the students who
are enrolled in the specified course number to the console.
        • In main() method create collection and output result.*/

package com.softserve.edu09.hw.hw2;

public class hw2 {
    public static void main(String[] args) {
        Student student = new Student("Natalia","MT",4);
        System.out.println(student);

    }
}
class Student{
    private String name;
    private String group;
    private int course;

    public Student(String name, String group, int course) {
        this.name = name;
        this.group = group;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", group='" + group + '\'' +
                ", course=" + course +
                '}';
    }
}
