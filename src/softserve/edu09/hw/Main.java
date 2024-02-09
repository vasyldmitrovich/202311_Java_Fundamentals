package softserve.edu09.hw;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> myCollection = new ArrayList<>(Arrays.asList(3, -6, 10, -5, 8, 9, -4, 12, -7, 2));

        int maxIndex = myCollection.indexOf(Collections.max(myCollection));
        int minIndex = myCollection.indexOf(Collections.min(myCollection));
        Collections.swap(myCollection, maxIndex, minIndex);

        Random rand = new Random();
        int randomThreeDigitNumber = rand.nextInt(900) + 100;
        int negativeIndex = myCollection.indexOf(myCollection.stream().filter(n -> n < 0).findFirst().orElse(null));
        myCollection.add(negativeIndex, randomThreeDigitNumber);

        for (int i = 0; i < myCollection.size() - 1; i++) {
            if ((myCollection.get(i) >= 0 && myCollection.get(i + 1) < 0) ||
                    (myCollection.get(i) < 0 && myCollection.get(i + 1) >= 0)) {
                myCollection.add(i + 1, 0);
                i++;
            }
        }

        List<Integer> list1 = new ArrayList<>(myCollection.subList(0, 5));
        List<Integer> list2 = new LinkedList<>(myCollection.subList(5, 10));
        Collections.reverse(list2);

        int lastEvenIndex = -1;
        for (int i = myCollection.size() - 1; i >= 0; i--) {
            if (myCollection.get(i) % 2 == 0) {
                lastEvenIndex = i;
                break;
            }
        }
        if (lastEvenIndex != -1) {
            myCollection.remove(lastEvenIndex);
        } else {
            System.out.println("No even elements to remove.");
        }

        int minIndex2 = myCollection.indexOf(Collections.min(myCollection));
        if (minIndex2 != myCollection.size() - 1) {
            myCollection.remove(minIndex2 + 1);
        } else {
            System.out.println("The minimum element is the last one, nothing to remove.");
        }

        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", "Group A", 1, Arrays.asList(4, 3, 2)));
        students.add(new Student("Bob", "Group B", 2, Arrays.asList(5, 4, 3)));
        students.add(new Student("Charlie", "Group C", 3, Arrays.asList(4, 4, 4)));

        removeAndPromoteStudents(students);
        printStudents(students, 2);
    }

    public static void removeAndPromoteStudents(List<Student> students) {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            double averageGrade = student.getGrades().stream().mapToInt(Integer::intValue).average().orElse(0);
            if (averageGrade < 3) {
                iterator.remove();
            } else {
                student.setCourse(student.getCourse() + 1);
            }
        }
    }

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
    private String group;
    private int course;
    private List<Integer> grades;

    public Student(String name, String group, int course, List<Integer> grades) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.grades = grades;
    }

    public String getName() {
        return name;
    }

    public String getGroup() {
        return group;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public List<Integer> getGrades() {
        return grades;
    }
}
