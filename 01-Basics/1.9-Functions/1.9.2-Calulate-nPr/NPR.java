/**
 * 1. Compute nPr for giver integers 'n' and 'r' using function
 * 2. Hint : Permutation formula
 * nPr = n! / (n-r)!
 * 
 */

public class NPR {

    // function to calculate factorial of a number
    public static int factorial(int x) {
        int rv = 1; // return value or value that will be return to main after computation

        for (int i = 1; i <= x; i++) {
            rv *= i;
        }

        return rv;
    }

    public static void main(String[] args) {

        int n = 5, r = 2;

        int nPr = factorial(n) / factorial(n - r);

        System.out.println("nPr = " + nPr);
    }
}
