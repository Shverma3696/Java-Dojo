/**
 * 1. given a number 'n'. (always odd)
 * 
 * Print pattern (E.g., n = 5):
 * [***-*]
 * [--*-*]
 * [*****]
 * [*-*--]
 * [*-***]
 * 
 */

public class SwastikaShape {
    public static void main(String[] args) {

        int n = 5;

        // approach 1
        int mid = n / 2 + 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == mid || j == mid) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }

    }
}