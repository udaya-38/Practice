package Java_Practice;

import java.util.Scanner;

public class SumDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num = scanner.nextInt();

        System.out.println(SumOfDigits(num));

        scanner.close();
    }

    public static int SumOfDigits(int a) {

        int sum = 0;

        while (a > 0) {

            int rem = a % 10;  // TAKES THE LAST NUMBER EX: 1234 -> 4
            sum = sum + rem;
            a = a / 10; // REMOVES THE LAST NUMBER EX: 1234 -> 123
        }

        return sum;
    }
}
