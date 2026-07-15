package OOPS;

public class Bank_Main {
    public static void main(String[] args) {
        Bank b1=new Bank(832541236,"Usain Boult",50000);
        b1.check_balance();
        b1.deposit(10000);
        b1.withdraw(8000);
        b1.withdraw(100000);
        b1.check_balance();
    }
}
