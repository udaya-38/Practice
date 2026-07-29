package Java_Practice;

import java.util.Scanner;

public class ReverseNo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num = scanner.nextInt();

        System.out.println(ReverseTheNo(num));

        scanner.close();
    }

    public static int ReverseTheNo(int a) {

        int rev = 0;

        while (a > 0) {
            int rem = a % 10;
            rev = (rev * 10) + rem;
            a = a / 10;
        }

        return rev;
    }
}
