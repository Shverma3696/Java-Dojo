/**
 * 1. Compute square of a number using function
 * 2. given integer 'n'.
 * 
 */

public class Nsquare {

    public static int nSquare(int x) {
        return x * x;
    }

    public static void main(String[] args) {

        int n = 11;

        // normal way without function
        // int nSquare = n * n;

        // using funtion
        // int nSquare = nSquare(n);
        // System.out.println("N square = " + nSquare);

        // or use directly in print statement
        System.out.println("N square = " + nSquare(n));

    }
}
