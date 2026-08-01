package OOPS;

import java.util.Scanner;

public class Calculator_Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calc = new Calculator();

        System.out.print("Enter the Number A: ");
        int a = scanner.nextInt();

        System.out.print("Enter the Number B: ");
        int b = scanner.nextInt();

        System.out.println("Addition = " + calc.add(a,b));
        System.out.println("Subtraction = " + calc.sub(a,b));
        System.out.println("Division = " + calc.div(a,b));
        System.out.println("Multiplication = " + calc.multiply(a,b));

        scanner.close();

    }
}
