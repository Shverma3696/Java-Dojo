/**
 * 1. given a number 'n'. (always odd)
 * 
 * Print pattern (E.g., n = 5):
 * [--*--]
 * [--**-]
 * [*****]
 * [--**-]
 * [--*--]
 * 
 */

public class ArrowShape {
    public static void main(String[] args) {

        int n = 5;

        // approach 1
        int sp = n / 2;
        int st = 1;
        int mid = n / 2 + 1;

        for (int i = 1; i <= n; i++) {

            // spaces
            for (int j = 1; j <= sp; j++) {
                if (i == mid) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }

            // stars
            for (int j = 1; j <= st; j++) {
                System.out.print("*\t");
            }

            if (i <= n / 2) {
                st++;
            } else {
                st--;
            }

            System.out.println();
        }

    }
}