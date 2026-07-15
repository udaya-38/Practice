package OOPS;

public class Polymorphism {
    public static void main(String[] args) {
        Calci c1 = new Calci();
        System.out.println("----METHOD OVERLOADING----");
        System.out.println(c1.add(1,2));
        System.out.println(c1.add(1.2,2.8));
        System.out.println();

        Animals a1 = new Kitty();
        Animals a2 = new Animals();
        System.out.println("----METHOD OVERRIDING----");
        a1.sound();
        a2.sound();
    }
}

class Calci{
    int add(int a, int b){
        return a+b;
    }

    //METHOD OVERLOADING : SAME METHOD NAME BUT DIFFERENT PARAMETERS WITHIN THE SAME CLASS

    double add(double a, double b){
        return a+b;
    }
}

class Animals{
    void sound(){
        System.out.println("Grh!!!!!!!!!!");
    }
}

     //METHOD OVERRIDING : SAME METHOD NAME, SAME PARAMETERS BUT DIFFERENT IMPLEMENTATION IN CHILD CLASS

class Kitty extends Animals{
    void sound(){
        System.out.println("Meow ........");
    }
}
