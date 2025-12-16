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

                // row 1
                if (i == 1) {
                    if (j <= mid || j == n) {
                        System.out.print("*\t");
                    } else {
                        System.out.print("\t");
                    }
                }

                // row 2 or rows between first and mid
                if (i > 1 && i < mid) {
                    if (j == mid || j == n) {
                        System.out.print("*\t");
                    } else {
                        System.out.print("\t");
                    }
                }

                // mid row
                if (i == mid) {
                    System.out.print("*\t");
                }

                // row 4 or rows between mid and last
                if (i > mid && i < n) {
                    if (j == 1 || j == mid) {
                        System.out.print("*\t");
                    } else {
                        System.out.print("\t");
                    }
                }

                // last row
                if (i == n) {
                    if (j == 1 || j >= mid) {
                        System.out.print("*\t");
                    } else {
                        System.out.print("\t");
                    }
                }
            }
            System.out.println();
        }

    }
}