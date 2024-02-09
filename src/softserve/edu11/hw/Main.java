package softserve.edu11.hw;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Task 1
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(4, 5, 6, 7, 8));
        System.out.println("Union: " + union(set1, set2));
        System.out.println("Intersection: " + intersect(set1, set2));

        // Task 2
        Map<String, String> personMap = new HashMap<>();
        personMap.put("Doe", "John");
        personMap.put("Smith", "Jane");
        personMap.put("Johnson", "John");
        personMap.put("Williams", "Emma");
        personMap.put("Brown", "Orest");
        personMap.put("Taylor", "Michael");
        personMap.put("Anderson", "Eva");
        personMap.put("Thomas", "Orest");
        personMap.put("Wilson", "Sophia");
        personMap.put("Harris", "Liam");
        System.out.println("Initial personMap: " + personMap);

        boolean hasDuplicateFirstName = hasDuplicateFirstName(personMap);
        System.out.println("At least two persons with the same first name: " + hasDuplicateFirstName);

        removePersonWithFirstName(personMap, "Orest");
        System.out.println("After removing person with first name \"Orest\": " + personMap);

        // Task 3
        List<Student> students = new ArrayList<>();
        students.add(new Student("John Doe", 1));
        students.add(new Student("Jane Smith", 2));
        students.add(new Student("Michael Taylor", 1));
        students.add(new Student("Eva Anderson", 2));
        students.add(new Student("Sophia Wilson", 3));
        printStudents(students, 1);
        printStudents(students, 2);
    }

    // Task 1 methods
    public static Set<Integer> union(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> unionSet = new HashSet<>(set1);
        unionSet.addAll(set2);
        return unionSet;
    }

    public static Set<Integer> intersect(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> intersectSet = new HashSet<>(set1);
        intersectSet.retainAll(set2);
        return intersectSet;
    }

    // Task 2 methods
    public static boolean hasDuplicateFirstName(Map<String, String> personMap) {
        Set<String> firstNames = new HashSet<>(personMap.values());
        return firstNames.size() != personMap.size();
    }

    public static void removePersonWithFirstName(Map<String, String> personMap, String firstName) {
        Iterator<Map.Entry<String, String>> iterator = personMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> entry = iterator.next();
            if (entry.getValue().equals(firstName)) {
                iterator.remove();
            }
        }
    }

    // Task 3 methods
    public static void printStudents(List<Student> students, int course) {
        System.out.println("Students in course " + course + ":");
        for (Student student : students) {
            if (student.getCourse() == course) {
                System.out.println(student.getName());
            }
        }
    }
}

class Student {
    private String name;
    private int course;

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public int getCourse() {
        return course;
    }
}
