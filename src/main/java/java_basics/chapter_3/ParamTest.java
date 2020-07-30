package java_basics.chapter_3;

public class ParamTest {

    public static void main(String[] args) {

        System.out.println("Testing triple value");
        double percent = 10;
        tripleValue(percent);
        System.out.println("After method " + percent);


        System.out.println("Testing triple salary with Object");
        var harry = new EmployeeSmall("Gregory", 50000);
        System.out.println("Salary before = " + harry.getSalary());
        tripleSalary(harry);
        System.out.println("Salary after = " + harry.getSalary());


        System.out.println("Testing Swap");
        var a = new EmployeeSmall("Leonora", 70000);
        var b = new EmployeeSmall("Philip", 60000);
        System.out.println("Before : a=" + a.getName());
        System.out.println("Before : b=" + b.getName());
        swap(a, b);
        System.out.println("After: a=" + a.getName());
        System.out.println("After: b=" + b.getName());
        }

        public static void tripleValue(double x)    // Does not work
        {
            x = 3 * x;
            System.out.println("End of method: x=" + x);
        }

        public static void tripleSalary(EmployeeSmall x)   // Work
        {
            x.raiseSalary(200);
            System.out.println("End of method: salary=" + x.getSalary());
        }

        public static void swap(EmployeeSmall x, EmployeeSmall y)
        {
            EmployeeSmall temp = x;
            x = y;
            y = temp;
            System.out.println("End of method: x=" + x.getName());
            System.out.println("End of method: y=" + y.getName());
        }
    }

    class EmployeeSmall
    {
        private String name;
        private double salary;

        public EmployeeSmall(String n, double s)
        {
            name = n;
            salary = s;
        }

        public String getName()
        {
            return name;
        }

        public double getSalary()
        {
            return salary;
        }

        public void raiseSalary(double byPercent)
        {
            double raise = salary * byPercent / 100;
            salary += raise;
        }
    }

