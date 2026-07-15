package OOPS;

public class Car {
    String Color;
    String Type;
    String Brand;
    int Speed=0;

    public Car(String Color,String Type,String Brand){
        this.Color=Color;
        this.Type=Type;
        this.Brand=Brand;
        this.Speed=0;
    }

    public void IncreaseSpeed(int Increment){
        Speed+=Increment;
        System.out.println("The Speed of the "+Brand+" is Increased by "+Increment+" Km/hr");
    }

    public void ApplyBrake(int Decrement){
        Speed-=Decrement;
        System.out.println("The Speed of the "+Brand+" is Decreased by "+Decrement+" Km/hr");
    }

    public void Drive(){
        System.out.println(Brand+" is Driving now at the Speed of "+Speed+" Km/hr");
    }

    public void DisplayDetails(){
        System.out.println("Brand: "+Brand);
        System.out.println("Type: "+Type);
        System.out.println("Color: "+Color);
    }
}
