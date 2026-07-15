package OOPS;

public class Encapsulation {
    public static void main(String[] args) {
        Student p1 = new Student();
        p1.setName("Patrick");
        p1.setMarks(96);

        System.out.println(p1.getName());
        System.out.println(p1.getMarks());
    }
}

class Student{
    private String name;
    private int marks;

    public String getName(){
        return name;
    }

    public int getMarks(){
        return marks;
    }

    public void setName(String name){
        this.name=name;
    }

    public void setMarks(int marks){
        this.marks=marks;
    }

}
