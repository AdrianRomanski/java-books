package java_basics.chapter_3;

import java.util.Random;

public class ConstructorTest {

    public static void main(String[] args) {

        var staff = new Employee[3];

        staff[0] = new Employee("Harry", 40000);
        staff[1] = new Employee(60000);
        staff[2] = new Employee();

        for(Employee e: staff)
            System.out.println(e.toString());
    }
}

    class Employee {

        private static int nextId;

        private int id;
        private String name = "";
        private double salary;

        // Static initializing block
        static {

            var generator = new Random();

            nextId = generator.nextInt(10000);
        }

        // Object initializing block
        {
            id = nextId;
            nextId++;
        }

        // Constructors

        public Employee(String n, double s) {

            this.name = n;
            this.salary = s;
        }

        public Employee(double s) {
            this("Employee #" + nextId, s);
        }

        public Employee() {

            // name  = " ";
            // salary = 0;
            // id initialized in static block
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", salary=" + salary +
                    '}';
        }
    }
