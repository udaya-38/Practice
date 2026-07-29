package Java_Practice;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the Number: ");
        int num = scanner.nextInt();

        System.out.println(isPrime(num));

        scanner.close();
    }

    public static boolean isPrime(int a) {
        if (a % 2 == 0 && a != 2) {
            return false;
        }

        if (a <= 1) {
            return false;
        }

        for (int i = 3 ; i * i <= a ; i += 2) {
            if (a % i == 0) {
                return false;   // Factor Found so it is not a Prime Number
            }
        }

        return true; // Factor Not found so it is indeed a Prime Number
    }
}
