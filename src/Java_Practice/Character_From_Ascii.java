package Java_Practice;

import java.util.Scanner;

public class Character_From_Ascii {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter ASCII value: ");

        int ascii = sc.nextInt();

        char ch = (char) ascii;

        System.out.println("Character = " + ch);

    }
}
