package java_basics.chapter_4.abstractClasses;

public class Student extends Person {

    private String major;

    public Student(String name, String major) {
        super(name);
        this.major = major;
    }

    @Override
    public String getDescription() {
        return "Student of specialization " + major;
    }
}
