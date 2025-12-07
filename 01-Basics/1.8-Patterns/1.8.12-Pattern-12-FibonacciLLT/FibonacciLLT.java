/**
 * 1. given a number 'n'. (number of rows)
 * 
 * Print pattern (E.g., n = 4):
 * [0]
 * [1-1]
 * [2-3-5]
 * [8-13-21-34]
 * 
 */

public class FibonacciLLT {
    public static void main(String[] args) {

        int n = 5;

        // approach 1

        int a = 0;
        int b = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(a + "\t");
                int c = a + b;
                a = b;
                b = c;
            }
            System.out.println();
        }

    }
}
