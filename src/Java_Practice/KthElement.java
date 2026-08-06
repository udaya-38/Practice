package Java_Practice;
import java.util.Arrays;
import java.util.Scanner;

public class KthElement {

    public static void main(String[] args) {

//        int[] arr = {7, 10, 4, 3, 20, 15};
//        int k = 3;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of Array: ");
        int size = sc.nextInt();

        int [] arr = new int [size];
        System.out.print("Enter the Elements of Array: ");

        for (int i = 0; i < arr.length; i++) {
            arr [i] = sc.nextInt();
        }


        System.out.print("Enter the k: ");
        int k = sc.nextInt();

        Arrays.sort(arr);

        int kthMin = arr[k - 1];
        int kthMax = arr[arr.length - k];

        System.out.println("Kth Minimum = " + kthMin);
        System.out.println("Kth Maximum = " + kthMax);
    }
}