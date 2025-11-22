/**
 * Print first 'n' Fibonacci numbers
 * 
 */

public class Fibonacci {
    public static void main(String[] args) {

        int n = 10;

        int a = 0; // first fibonacci number
        int b = 1; // second fibonacci number

        int next; // next fibonacci number

        for (int i = 1; i <= n; i++) {

            System.out.print(a + " , ");
            next = a + b;
            a = b;
            b = next;

        }

    }
}
