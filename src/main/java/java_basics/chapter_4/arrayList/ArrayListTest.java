package java_basics.chapter_4.arrayList;

import java.util.ArrayList;

public class ArrayListTest {

    public static void main(String[] args) {

        var staff = new ArrayList<Employee>();

        staff.add(new Employee("Walter White", 2500, 1988, 11, 12));
        staff.add(new Employee("Harry Hacker", 5000, 1986, 11, 12));
        staff.add(new Employee("Edgar Allan Poe", 7500, 1944, 11, 12));

        for(Employee e : staff) {
            e.raiseSalary(5);
        }

        for(Employee e : staff) {
            System.out.println("name=" + e.getName() + ",salary=" + e.getSalary() + ",hireDay="
                    + e.getHireDay());
        }

    }
}
