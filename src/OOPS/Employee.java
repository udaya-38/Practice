package OOPS;

public class Employee {
    private String ID;
    private int Salary;

    public String getID(){
        return ID;
    }

    public int getSalary(){
        return Salary;
    }

    public void setID(String ID){
        this.ID=ID;
    }

    public void setSalary(int Salary){
        if(Salary > 0){
            this.Salary=Salary;
        }

        else{
            System.out.println("Invalid Salary");
        }
    }
}

class Main{
    public static void main(String[] args) {
        Employee e1=new Employee();
        e1.setID("EMP002");
        e1.setID("EMP001");
        e1.setSalary(-23);
        e1.setSalary(50000);

        System.out.println(e1.getID());
        System.out.println(e1.getSalary());
    }
}