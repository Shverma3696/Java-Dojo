/**
 * 1. given an odd number 'n'.
 * 
 * Print pattern (E.g., n = 5):
 * [----*]
 * [---**]
 * [--***]
 * [-****]
 * [*****]
 * 
 */

public class RightLowerTriangle {
    public static void main(String[] args) {

        int n = 5;

        // Sumeet Sir's Solution

        int sp = n - 1; // number of spaces
        int st = 1; // number of stars

        for (int i = 1; i <= n; i++) { // control rows

            for (int j = 1; j <= sp; j++) { // control columns for SPACES to be printed first
                System.out.print("\s\s"); // print (use \s : for space or \t : for tab)
                // using doble spaces to even out the spaces in the final output pattern
            }

            for (int j = 1; j <= st; j++) { // control columns for STARS
                System.out.print("*\s"); // print (use \s : for space or \t : for tab)
            }

            sp--; // spaces keeps decreasing by 1 as we move to next row
            st++; // stars keeps increasing by 1 as we move to next row

            System.out.println(); // end line or change line
        }
    }
}

/**
 * my solution:
 * for (int i = 1; i <= n; i++) { // control rows
 * 
 * for (int j = 1; j <= n; j++) { // control columns
 * 
 * if (i + j <= n) {
 * System.out.print("\s\s"); // print (use \s : for space or \t : for tab)
 * } else {
 * System.out.print("*\s"); // print (use \s : for space or \t : for tab)
 * }
 * }
 * System.out.println(); // end line or change line
 * }
 */
