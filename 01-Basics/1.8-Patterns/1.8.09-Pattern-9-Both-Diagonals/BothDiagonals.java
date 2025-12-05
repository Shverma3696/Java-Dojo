/**
 * 1. given a number 'n'.
 * 
 * Print pattern (E.g., n = 5):
 * [*---*]
 * [-*-*-]
 * [--*--]
 * [-*-*-]
 * [*---*]
 * 
 */

public class BothDiagonals {
    public static void main(String[] args) {

        int n = 5;

        // approach 1
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == j || i + j == n + 1) {
                    System.out.print("*\s"); // print (use \s : for space or \t : for tab)
                } else {
                    System.out.print("\s\s");
                }
            }
            System.out.println(); // end line
        }

    }
}