package Java_Practice;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num = scanner.nextInt();

        System.out.println(isPalindrome(num));

        scanner.close();
    }

    public static boolean isPalindrome(int a) {
        int rev = 0;
        int temp = a;

        while (a > 0) {
            int rem = a % 10;
            rev = (rev * 10) + rem;
            a = a / 10;
        }

        return temp == rev;
    }
}
