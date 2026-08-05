package Java_Practice;

import java.util.Scanner;

public class Sub_set {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the Array: ");
        int size = scanner.nextInt();

        int [] arr = new int[size];
        System.out.print("Enter the Array elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr [i] = scanner.nextInt();
        }

        System.out.print("Enter the target sum: ");
        int n = scanner.nextInt();
        subSet(arr,n);

    }

    public static void subSet(int [] arr, int n) {
        System.out.print("Pairs: ");
        System.out.print("{");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length ; j++) {
                if (arr[i] * arr[j] == n) {
                    System.out.print("(" + arr[i] + "," + arr[j] + ")");
                }
            }
        }
        System.out.print("}");
    }
}
