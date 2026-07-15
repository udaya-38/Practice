package Java00;

 public class Reverse_Integer {
    public static void main (String [] args){
        int rev = 0;
        int x = 5421;

        while (x != 0) {

            int digit = x % 10;
            if (rev > Integer.MAX_VALUE / 10 || rev < Integer.MIN_VALUE / 10)
                System.out.println(0);

            rev = rev * 10 + digit;
            x = x / 10;
        }

        System.out.println(rev);
    }
}