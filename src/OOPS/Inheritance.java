package OOPS;

class Inheritance {
    public static void main(String[] args) {
        Doggy d1 = new Doggy();
        System.out.println("DOG ACCESS");
        d1.bark();
        d1.eat();
        System.out.println();

        Animal a1 = new Animal();
        System.out.println("ANIMAL ACCESS");
        a1.eat();
    }
}

// SINGLE INHERITANCE : ONE PARENT CLASS HAS ONLY ONE CHILD CLASS ( ANIMAL -> DOGGY )

class Animal {
    void eat() {
        System.out.println("The Animal is Eating...");
    }
}

class Doggy extends Animal {
    void bark() {
        System.out.println("Dog Barks !!!!!");
    }
}