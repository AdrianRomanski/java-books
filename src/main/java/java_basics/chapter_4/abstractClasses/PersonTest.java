package java_basics.chapter_4.abstractClasses;

public class PersonTest {

    public static void main(String[] args) {

        Person[] people = new Person[2];

        people[0] = new Employee("Walter White", 5000, 1989, 10, 1);
        people[1] = new Student("Jessie Pinkman", "Computer Science");

        for(Person p : people) {
            System.out.println(p.getName() + ", " + p.getDescription());
        }

    }
}
