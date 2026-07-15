package OOPS;

public class Abstraction {
    public static void main(String[] args) {
        Shape s1 = new Circle();
        Shape s2 = new Rectangle();

        s1.draw();
        s2.draw();
    }
}

abstract class Shape{
    abstract void draw();

}

class Circle extends Shape{
    void draw(){
        System.out.println("Drawing a Circle");
    }
}

class Rectangle extends Circle{
    void draw(){
        System.out.println("Drawing a Rectangle");
    }
}

