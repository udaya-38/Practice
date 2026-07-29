package Java_Practice;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the Number: ");
        int num = scanner.nextInt();

        System.out.println(checkOddEven(num));
        scanner.close();
    }


    public static String checkOddEven(int n) {

        if (n % 2 == 0) {
            return "Even Number";
        }

        return "Odd Number";

    }
}