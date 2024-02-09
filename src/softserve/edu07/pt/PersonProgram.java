package softserve.edu07.pt;

// Interface Animal
interface Animal {
    void voice();

    void feed();
}

// Classes Cat and Dog implementing Animal interface
class Cat implements Animal {
    @Override
    public void voice() {
        System.out.println("Meow!");
    }

    @Override
    public void feed() {
        System.out.println("Feeding the cat.");
    }
}

class Dog implements Animal {
    @Override
    public void voice() {
        System.out.println("Woof!");
    }

    @Override
    public void feed() {
        System.out.println("Feeding the dog.");
    }
}

// Abstract class Person
abstract class Person {
    protected String name;

    public Person(String name) {
        this.name = name;
    }

    public abstract void print();
}

// Abstract subclass Teacher
abstract class Teacher extends Person {
    public static final String TYPE_PERSON = "Teacher";

    public Teacher(String name) {
        super(name);
    }

    @Override
    public void print() {
        System.out.println("I am a " + TYPE_PERSON + ": " + name);
    }

    public abstract void salary();
}

// Concrete subclasses MathTeacher and EnglishTeacher
class MathTeacher extends Teacher {
    public MathTeacher(String name) {
        super(name);
    }

    @Override
    public void salary() {
        System.out.println("Calculating math teacher's salary.");
    }
}

class EnglishTeacher extends Teacher {
    public EnglishTeacher(String name) {
        super(name);
    }

    @Override
    public void salary() {
        System.out.println("Calculating English teacher's salary.");
    }
}

// Concrete subclass Cleaner
class Cleaner extends Person {
    public static final String TYPE_PERSON = "Cleaner";

    public Cleaner(String name) {
        super(name);
    }

    @Override
    public void print() {
        System.out.println("I am a " + TYPE_PERSON + ": " + name);
    }

    public void salary() {
        System.out.println("Calculating cleaner's salary.");
    }
}

// Concrete subclass Student
class Student extends Person {
    public static final String TYPE_PERSON = "Student";

    public Student(String name) {
        super(name);
    }

    @Override
    public void print() {
        System.out.println("I am a " + TYPE_PERSON + ": " + name);
    }
}

// Main class
public class PersonProgram {
    public static void main(String[] args) {
        // Part 1: Animal Interface
        Animal[] animals = new Animal[4];

        animals[0] = new Cat();
        animals[1] = new Dog();
        animals[2] = new Dog();
        animals[3] = new Cat();

        for (Animal animal : animals) {
            animal.voice();
            animal.feed();
            System.out.println();
        }

        // Part 2: Person Class Hierarchy
        Person[] people = new Person[6];

        people[0] = new MathTeacher("John");
        people[1] = new Cleaner("Alice");
        people[2] = new EnglishTeacher("Bob");
        people[3] = new Student("Eva");
        people[4] = new Student("Mike");
        people[5] = new Cleaner("Charlie");

        for (Person person : people) {
            person.print();

            if (person instanceof Teacher) {
                ((Teacher) person).salary();
            } else if (person instanceof Cleaner) {
                ((Cleaner) person).salary();
            }

            System.out.println();
        }
    }
}
