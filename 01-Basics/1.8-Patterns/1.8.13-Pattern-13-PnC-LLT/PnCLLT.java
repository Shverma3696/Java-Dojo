/**
 * 1. given a number 'n'. (number of rows)
 * 
 * Print pattern (E.g., n = 6):
 * [1]
 * [1-1]
 * [1-2-1]
 * [1-3-3-1]
 * [1-4-6-4-1]
 * [1-5-10-10-5-1]
 * 
 * Hint : this pattern is based on combinations formular
 * => nCr = n! / r! * (n-r)!
 * 
 * Actual formula used for code:
 * => nC(k+1) = nCk * (n-k) / (k+1)
 * 
 * where, n = row number (i); k = column number (j)
 * 
 */

public class PnCLLT {
    public static void main(String[] args) {

        int n = 6;

        // approach 1
        for (int i = 0; i < n; i++) {
            int val = 1;

            for (int j = 0; j <= i; j++) {
                System.out.print(val + "\t");
                val = val * (i - j) / (j + 1); // val = nCk
            }
            System.out.println();
        }

    }
}
