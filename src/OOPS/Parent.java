package OOPS;

import java.sql.SQLOutput;

public class Parent {
    public static void main(String[] args) {
        Son d1 = new Son();
        System.out.println("SON ACCESS PROPERTY");
        d1.p0(); // SON CAN ACCESS GRANDFATHER'S PROPERTY
        d1.p1(); // SON CAN ACCESS DAD'S PROPERTY
        d1.p2(); // SON CAN ACCESS HIS OWN PROPERTY
        System.out.println();

        Daughter d2 = new Daughter();
        System.out.println("DAUGHTER ACCESS PROPERTY");
        d2.p0(); // DAUGHTER CAN ACCESS GRANDFATHER'S PROPERTY
        d2.p1(); // DAUGHTER CAN ACCESS DAD'S PROPERTY
        d2.p3(); // DAUGHTER CAN ACCESS HER OWN PROPERTY
        System.out.println();

        Dad d3 = new Dad();
        System.out.println("DAD ACCESS PROPERTY ");
        d3.p0(); // DAD CAN ACCESS GRANDFATHER'S PROPERTY
        d3.p1(); // DAD CAN ACCESS HIS OWN PROPERTY
        System.out.println();

        Grandfather d4 = new Grandfather();
        System.out.println("GRANDFATHER ACCESS PROPERTY");
        d4.p0(); // GRANDFATHER CAN ONLY ACCESS TO HIS OWN PROPERTY
        System.out.println();
    }
}

class Grandfather{
    public void p0(){
        System.out.println("Grandfather bought Empty Land");
    }
}

// MULTI-LEVEL INHERITANCE : GRANDDAD -> DAD -> SON & DAUGHTER

class Dad extends Grandfather{
    public void p1(){
        System.out.println("Dad bought House and Land");
    }
}

//  HIERARCHICAL INHERITANCE : ONE PARENT AND MULTIPLE CHILD LIKE HERE ONE DAD AND TWO CHILD NAMELY SON & DAUGHTER

class Son extends Dad{
    public void p2(){
        System.out.println("Son bought 2 Houses");
    }
}

class Daughter extends Dad{
    public void p3(){
        System.out.println("Daughter bought 1 Land and built an Apartment");
    }
}