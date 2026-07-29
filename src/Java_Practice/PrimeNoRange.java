package Java_Practice;

import java.util.Scanner;

public class PrimeNoRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        System.out.print("Enter the Number: ");
//        int num = scanner.nextInt();

        System.out.print("Enter the Start: ");
        int start = scanner.nextInt();

        System.out.print("Enter the End: ");
        int end = scanner.nextInt();

        isPrimeRange(start,end);

        scanner.close();
    }

    public static void isPrimeRange(int start , int end) {

        for(int i = start ; i <= end ; i++) {

            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean isPrime(int a) {
        if (a <= 1) {
            return false;
        }

        if (a == 2) {
            return true;
        }

        if (a % 2 == 0) {
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
