package Java_Practice;

import java.util.Scanner;

public class MoveNegativePositive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = {-1,-1,3,-2,4};
        int [] res = new int[arr.length];
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= 0) {
                res [index] = arr [i];
                index++;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr [i] > 1) {
                res [index] = arr [i];
                index++;
            }
        }

        for (int num : res) {
            System.out.print(num + " ");
        }
    }
}
