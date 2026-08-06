package Java_Practice;

import java.util.Scanner;

public class MoveNegativePositive {
    public static void main(String[] args) {
        int [] arr = {-1,-1,3,-2,4};
        int [] res = new int[arr.length];
        int index = 0;

        for (int j : arr) {
            if (j <= 0) {
                res[index] = j;
                index++;
            }
        }

        for (int j : arr) {
            if (j > 1) {
                res[index] = j;
                index++;
            }
        }

        for (int num : res) {
            System.out.print(num + " ");
        }
    }
}
