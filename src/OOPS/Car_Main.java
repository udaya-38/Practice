package OOPS;

public class Car_Main {
    public static void main(String[] args) {
        Car o1=new Car("Red","Seden","Audi");
        Car o2=new Car("Black","SUV","BMW");

        o1.DisplayDetails();
        o1.IncreaseSpeed(100);
        o1.Drive();
        o1.ApplyBrake(50);

        System.out.println();

        o2.DisplayDetails();
        o2.IncreaseSpeed(200);
        o2.Drive();
        o2.ApplyBrake(50);
    }
}
