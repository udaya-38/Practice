package Java_Practice;

import java.util.Scanner;

public class GreatestOfThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the First Number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the Second Number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter the Third Number: ");
        int num3 = scanner.nextInt();

        System.out.println("The Greatest Number Among Three is " + ThreeGreatest(num1 , num2 , num3));

        scanner.close();
    }

    public static int ThreeGreatest(int a , int b , int c) {
        if (a >= b && a >= c) {
            return a;
        }

        else if (b >= a && b >= c) {
            return b;
        }

        return c;
    }
}
