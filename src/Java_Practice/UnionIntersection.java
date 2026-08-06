package Java_Practice;

import java.util.Arrays;
import java.util.Scanner;

public class UnionIntersection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of the Array: ");
        int size = sc.nextInt();

        int [] arr = new int [size];
        System.out.print("Enter the Elements of the Array 1: ");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int [] arr2 = new int[size];
        System.out.print("Enter the Elements of the Array 2: ");

        for (int i = 0; i < arr2.length; i++) {
            arr2 [i] = sc.nextInt();
        }

        Arrays.sort(arr);
        Arrays.sort(arr2);

        System.out.println("\nIntersection");
        Intersection(arr,arr2);

        System.out.println();

        System.out.println("\n\nUnion");
        Union(arr,arr2);

        System.out.println();
        sc.close();
    }

    public static void Intersection(int [] arr , int [] arr2) {
        int i = 0 , j = 0;
        while (i < arr.length && j < arr2.length) {
            if (arr[i] < arr2[j]) {
                i++;
            }

            else if (arr[i] > arr2[j]) {
                j++;
            }

            else {
                System.out.print(arr[i] + " ");
                i++;
                j++;
            }
        }
    }

    public static void Union(int [] arr , int [] arr2) {
        int i = 0 , j = 0;
        while (i < arr.length && j < arr2.length) {
            if (arr[i] < arr2[j]) {
                System.out.print(arr[i] + " ");
                i++;
            }

            else if (arr[i] > arr2[j]) {
                System.out.print(arr2[j] + " ");
                j++;
            }

            else {
                System.out.print(arr[i] + " ");
                i++;
                j++;
            }
        }

        while (i < arr.length) {
            System.out.print(arr[i] + " ");
            i++;
        }

        while (j < arr2.length) {
            System.out.print(arr2[j] + " ");
            j++;
        }
    }

}
