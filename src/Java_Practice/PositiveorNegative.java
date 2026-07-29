package Java_Practice;

import java.util.Scanner;

public class PositiveorNegative {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.print("Enter the Number: ");
        int num = scanner.nextInt();

        System.out.println(isPositiveOrNegative(num));

        scanner.close();
    }

    public static String isPositiveOrNegative(int n) {
        if (n > 0) {
            return "Positive Number";
        }

        else if (n < 0) {
            return "Negative Number";
        }

        return "Zero";
    }
}
