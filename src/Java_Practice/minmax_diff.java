package Java_Practice;

import java.util.Arrays;

public class minmax_diff {
    public static void main(String[] args) {
        int [] arr = {1,5,8,10};
        int k = 2;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] - k > 0 ) {
                arr[i] = arr[i] - k;
            }

            else {
                arr[i] = arr[i] + k;
            }
        }

        Arrays.sort(arr);

        int max = arr[arr.length - 1];
        int min = arr[0];

        int diff = max - min;
        System.out.print("Difference: " + diff);
    }
}
