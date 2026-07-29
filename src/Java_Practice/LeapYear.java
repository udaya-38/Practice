package Java_Practice;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Year: ");
        int year = scanner.nextInt();

        System.out.println(isLeap(year));

         scanner.close();
    }

    public static boolean isLeap(int a) {
        return (a % 4 == 0 && a % 100 != 0) || (a % 400 == 0);
    }
}
