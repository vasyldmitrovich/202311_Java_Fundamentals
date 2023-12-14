package Sorokotiaha.com.softserve.edu03.pt;

public class pt2 {
    public static void main(String[] args) {
        var employee1 = new Employee("Duke", 10, 168);
        var employee2 = new Employee("Lee", 8, 163);
        var employee3 = new Employee("Jon", 7, 162);

        System.out.println(employee1.toString());
        System.out.println(employee2.toString());
        System.out.println(employee3.toString());

        System.out.println("Total sum:" + String.format("%.2f", Employee.totalSum));
    }
}

