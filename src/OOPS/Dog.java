package OOPS;

public class Dog {
    String Name;
    String Breed;
    int Age;
    String Color;

    public Dog(String Name,String Breed,int Age,String Color){
        this.Name=Name;
        this.Breed=Breed;
        this.Age=Age;
        this.Color=Color;
    }
    public String getName(){
        return Name;
    }
    public String getBreed(){
        return Breed;
    }
    public int getAge(){
        return Age;
    }
    public String getColor(){
        return Color;
    }
    public String toString(){
        return "The Name of the Dog is: "+Name +"\nBreed of the Dog is: "+ Breed+"\nAge of the Dog is: "+Age+"\nColor of the Dog is: "+Color;
    }
}
