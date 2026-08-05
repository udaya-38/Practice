package Java_Practice;

import java.util.Scanner;

public class Excel_Column{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

//        System.out.print("Enter Number: ");
//        int num = sc.nextInt();

        int num = 28;

        String result = "";

        while (num > 0) {

            num--;

            char ch = (char) ('A' + (num % 26));

            result = ch + result;

            num = num / 26;
        }

        System.out.println(result);
    }
}