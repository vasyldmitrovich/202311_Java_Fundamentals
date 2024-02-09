package softserve.edu08.hw;

class FullName {
    private String firstName;
    private String lastName;

    public FullName(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // Getter methods
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}

abstract class Person {
    private FullName fullName;
    private int age;

    public Person(FullName fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    // Getter methods
    public FullName getFullName() {
        return fullName;
    }

    public int getAge() {
        return age;
    }

    public String info() {
        return "First name: " + fullName.getFirstName() + ", Last name: " + fullName.getLastName() + ", Age: " + age;
    }

    public abstract String activity();
}

class Student extends Person {
    private int course;

    public Student(FullName fullName, int age, int course) {
        super(fullName, age);
        this.course = course;
    }

    // Getter method
    public int getCourse() {
        return course;
    }

    @Override
    public String info() {
        return super.info() + ", Course: " + course;
    }

    @Override
    public String activity() {
        return "I study at university";
    }

    public Student cloneStudent() {
        return new Student(getFullName(), getAge(), getCourse());
    }
}

public class Main {
    public static void main(String[] args) {
        FullName fullName1 = new FullName("John", "Doe");
        Student student1 = new Student(fullName1, 20, 1);
        FullName fullName2 = new FullName("Jane", "Smith");
        Student student2 = new Student(fullName2, 22, 2);

        System.out.println(student1.info());
        System.out.println(student1.activity());

        System.out.println(student2.info());
        System.out.println(student2.activity());

        Student student3 = student1.cloneStudent();
        student3 = new Student(student3.getFullName(), student3.getAge(), 3);

        System.out.println(student1.info());
        System.out.println(student1.activity());

        System.out.println(student3.info());
        System.out.println(student3.activity());
    }
}
