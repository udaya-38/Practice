package OOPS;

public class Bank {
    int acc_no;
    String acc_name;
    int acc_balance;
    int amount;

    public Bank(int acc_no,String acc_name,int acc_balance){
        this.acc_no=acc_no;
        this.acc_name=acc_name;
        this.acc_balance=acc_balance;

        if (acc_balance>0){
            this.acc_balance=acc_balance;
        }
        else{
            this.acc_balance=0;
            System.out.println("Account cannot be negative");
        }
    }

    public void deposit(double amount){
        if(amount>0){
            acc_balance+=amount;
            System.out.println("Rs "+amount+" Deposited Successfully");
        }
        else{
            System.out.println("Invalid Deposit amount");
        }
    }

    public void withdraw(double amount){
        if(amount<=0){
            System.out.println("Invalid Withdraw Amount");
        }
        else if(amount>acc_balance){
            System.out.println("Insufficient Balance");
        }
        else{
            acc_balance-=amount;
            System.out.println("Rs "+amount+" Withdrawn Successfully");
        }
    }

    public void check_balance(){
        System.out.println("Current Balance is Rs "+acc_balance);
    }
}
