package OOPS;

public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double div(double a, double b) {
        if (b == 0) {
            return 0;
        }

        return (double) a / b;
    }

}
