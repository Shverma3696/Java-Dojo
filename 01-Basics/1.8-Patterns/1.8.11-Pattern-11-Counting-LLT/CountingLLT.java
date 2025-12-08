/**
 * 1. given a number 'n'.
 * 
 * Print pattern (E.g., n = 5):
 * [1]
 * [2-3]
 * [4-5-6]
 * [7-8-9-10]
 * [11-12-13-14-15]
 * 
 */

public class CountingLLT {
    public static void main(String[] args) {

        int n = 5;

        // approach 1

        int count = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(count + "\t");
                count++;
            }
            System.out.println();
        }

    }
}
