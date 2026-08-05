package Java_Practice;

import java.util.Scanner;

public class Number_to_Words {

    static String[] ones = {
            "", "One", "Two", "Three", "Four", "Five",
            "Six", "Seven", "Eight", "Nine", "Ten",
            "Eleven", "Twelve", "Thirteen", "Fourteen",
            "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"
    };

    static String[] tens = {
            "", "", "Twenty", "Thirty", "Forty",
            "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"
    };

    public static String convert(int num) {

        if (num == 0)
            return "Zero";

        if (num < 20)
            return ones[num];

        if (num < 100)
            return tens[num / 10] + " " + ones[num % 10];

        if (num < 1000)
            return ones[num / 100] + " Hundred " + convert(num % 100);

        if (num < 10000)
            return ones[num / 1000] + " Thousand " + convert(num % 1000);

        return "Number out of range";
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.println("In Words: " + convert(num));

        sc.close();
    }
}