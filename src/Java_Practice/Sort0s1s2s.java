import java.util.Arrays;
import java.util.Scanner;

public class Sort0s1s2s {
    public static void main(String[] args) {

//        int[] arr = {0, 2, 1, 2, 0};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size: ");
        int size = sc.nextInt();

        int [] arr = new int[size];
        System.out.print("Enter the elements in Array: ");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }


        int low = 0;
        int mid = 0;
        int high = arr.length - 1;

        while (mid <= high) {

            if (arr[mid] == 0) {
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;

                low++;
                mid++;
            }
            else if (arr[mid] == 1) {
                mid++;
            }
            else {
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;

                high--;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}