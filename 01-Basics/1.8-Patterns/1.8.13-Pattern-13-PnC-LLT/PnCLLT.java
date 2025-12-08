/**
 * 1. given a number 'n'. (number of rows)
 * 
 * Print pattern (E.g., n = 4):
 * [1]
 * [1-1]
 * [1-2-1]
 * [1-3-3-1]
 * [1-4-6-4-1]
 * [1-5-10-10-5-1]
 * 
 */

public class PnCLLT {
    public static void main(String[] args) {

        int n = 5;

        // approach 1
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*\t");
            }
            System.out.println();
        }

    }
}
