class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void display() {
        System.out.println("Name of the Student is: " + name);
        System.out.println("Age of the Student is: " + age);
    }
}

class Student extends Person {

    private int marks;

    public Student(String name, int age) {
        super(name, age);
    }

    // Overloading
    public void setMarks(int mark) {
        marks = mark;
    }

    public void setMarks(int m1, int m2) {
        marks = (m1 + m2) / 2;
    }

    // Overriding
    @Override
    public void display() {
        System.out.println("Student Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Marks: " + marks);
    }
}

public class SchoolManagement {

    public static void main(String[] args) {

        Student s = new Student("John", 20);

        s.setMarks(80);

        s.display();

        s.setMarks(90, 70);

        s.display();
    }
}