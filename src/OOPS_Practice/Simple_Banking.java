package OOPS_Practice;

public class Simple_Banking {
    int ph_no;
    String Name;

    void Display(){
        System.out.println(ph_no);
        System.out.println(Name);
    }

    class child extends Simple_Banking {
        String Child_Name;

    }
}
