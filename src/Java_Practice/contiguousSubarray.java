package Java_Practice;

public class contiguousSubarray {
    public static void main(String[] args) {
        int [] arr = {-2,-3,4,-1,-2,1,5,-3};
        int current = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            current += arr[i];

            if (current > max) {
                max = current;
            }

            if (current < 0) {
                current = 0;
            }
        }

        System.out.println(max);
    }
}
