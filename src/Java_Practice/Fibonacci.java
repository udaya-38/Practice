package Java_Practice;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num = scanner.nextInt();

        if (num < 0) {
            System.out.println("Please enter a non-negative number");
            return;
        }

        System.out.println("The " + num + "th Fibonacci Number is: " + fibonacciNumber(num));

        fibonacciSeries(num);


        scanner.close();
    }

    public static int fibonacciNumber(int n) {
        if (n == 0) {
            return 0;
        }

        else if (n == 1) {
            return 1;
        }

        int first = 0;
        int second = 1;

        for (int i = 2 ; i <= n ; i++) {
            int next = first + second;
            first = second;
            second = next;
        }

        return second;
    }

    public static void fibonacciSeries(int n) {
        if (n == 0) {
            System.out.println(0);
            return;
        }

        System.out.print("0 1 ");

        int first = 0;
        int second = 1;

        for (int i = 2 ; i <= n ; i++) {

            int next = first + second;
            System.out.print(next + " ");

            first = second;
            second = next;

        }

        System.out.println();

    }
}
