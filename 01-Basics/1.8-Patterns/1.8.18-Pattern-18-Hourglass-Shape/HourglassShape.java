/**
 * 1. given a number 'n' = 7. (always odd)
 * 
 * Print pattern (E.g., n = 7):
 * [*******]
 * [-*---*-]
 * [--*-*--]
 * [---*---]
 * [--***--]
 * [-*****-]
 * [*******]
 * 
 */

public class HourglassShape {
    public static void main(String[] args) {

        int n = 7;

        // approach 1
        int st = n;
        int sp = 0;

        for (int i = 1; i <= n; i++) {

            // spaces before
            for (int j = 1; j <= sp; j++) {
                System.out.print("\t");
            }

            // stars
            for (int j = 1; j <= st; j++) {

                if (i > 1 && i <= n / 2 && j > 1 && j < st) {
                    System.out.print("\t");
                } else {
                    System.out.print("*\t");
                }
            }

            if (i <= n / 2) {
                sp++;
                st -= 2;
            } else {
                sp--;
                st += 2;
            }
            System.out.println();
        }

    }
}