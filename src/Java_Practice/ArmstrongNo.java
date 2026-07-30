package Java_Practice;

import java.util.Scanner;

public class ArmstrongNo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num = scanner.nextInt();

        System.out.println(isArmstrong(num));

        scanner.close();
    }

    public static boolean isArmstrong(int n) {
        int orgNum = n;
        int sum = 0;

        int digits = 0;
        int temp = n;

        if (temp == 0) {
            digits = 1;
        }

        else {
            while (temp > 0) {
                digits++;
                temp /= 10;
            }
        }

        while (n > 0) {
            int rem = n % 10;
            sum += (int) Math.pow(rem , digits);
            n /= 10;
        }

        return sum == orgNum;
    }
}
