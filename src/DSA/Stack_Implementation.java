package DSA;

public class Stack_Implementation {
        int [] data;
        private static final int DEFAULT_SIZE = 5;
        int ptr = -1;
        int size;

        public Stack_Implementation() {
            this (DEFAULT_SIZE);
        }

        public Stack_Implementation(int size) {
            this.size = size;
            this.data = new int [size];
        }

        public Boolean push(int val) {
            if (isFull()) {
                System.out.println("Stack is Full");
                return false;
            }

            ptr++;
            data [ptr] = val;
            return true;
        }

        public Boolean isFull() {
            return ptr == data.length - 1;
        }

        public Boolean isEmpty() {
            return ptr == -1;
        }

    public static void main(String[] args) {
        Stack_Implementation stack = new Stack_Implementation(3);

        System.out.println("Pushing 10: " + stack.push(10));
        System.out.println("Pushing 20: " + stack.push(20));
        System.out.println("Pushing 30: " + stack.push(30));

        System.out.println("Pushing 40: " + stack.push(40));
    }
}


