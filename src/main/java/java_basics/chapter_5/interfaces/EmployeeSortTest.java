package java_basics.chapter_5.interfaces;

import java.util.Arrays;

public class EmployeeSortTest {

    public static void main(String[] args) {

        Employee[] employees = new Employee[3];

        employees[0] = new Employee("Walter White", 20000);
        employees[1] = new Employee("Adrian Romanski", 40000);
        employees[2] = new Employee("Jessie Pinkman", 10000);

        Arrays.sort(employees);

        for(Employee e: employees) {
            System.out.println("name=" + e.getName() + ",salary=" + e.getSalary());
        }

    }
}
