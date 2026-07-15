package OOPS;

public class Calculator {
    int num1;
    int num2;

    Calculator(int num1,int num2){
        this.num1=num1;
        this.num2=num2;
    }

    public int add(){
        return num1+num2;
    }

    public int div(){
        return num1/num2;
    }

    public int multiply(){
        return num1*num2;
    }

    public int sub(){
        return num1-num2;
    }

    public void show(){
        System.out.println("Addition of "+ num1 +" + "+ num2 +" = "+add());
        System.out.println("Subtraction of "+ num1 +" - "+ num2 +" = "+sub());
        System.out.println("Multiplication of "+ num1 +" * "+ num2 +" = "+multiply());
        System.out.println("Division of "+ num1 +" / "+ num2 +" = "+div());
    }
}
