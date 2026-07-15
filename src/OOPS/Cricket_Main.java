package OOPS;

public class Cricket_Main {
    public static void main(String[] args) {
        Cricket p1=new Cricket("Rahul",33,"Delhi Capitals","Batsman");
        Cricket p2=new Cricket("Dhoni",45,"Chennai Super Kings","Batsman");

        p1.playMatch(58);
        p1.playMatch(124);
        p1.playMatch(25);
        p1.playMatch(58);
        p1.displayInfo();

        System.out.println();

        p2.playMatch(22);
        p2.playMatch(32);
        p2.playMatch(11);
        p2.playMatch(0);
        p2.displayInfo();
    }
}
