/**
 * 1. given a number 'n'.
 * 
 * Print pattern (E.g., n = 5):
 * [----*]
 * [---*-]
 * [--*--]
 * [-*---]
 * [*----]
 * 
 */

public class Diagonal2 {
    public static void main(String[] args) {

        int n = 5;

        // approach 2
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i + j == n + 1) {
                    System.out.print("*\s"); // print (use \s : for space or \t : for tab)
                } else {
                    System.out.print("\s\s");
                }
            }
            System.out.println(); // end line
        }

    }
}

/**
 * 
 * 
 * // approach 1
 * int sp = n - 1; // number of spaces
 * int st = 1; // number of stars is always 1
 * for (int i = 1; i <= n; i++) { // control rows
 * 
 * for (int j = 1; j <= sp; j++) { // control columns for SPACES to be printed
 * first
 * System.out.print("\s\s"); // print (use \s : for space or \t : for tab)
 * // using doble spaces to even out the spaces in the final output pattern
 * }
 * 
 * for (int j = 1; j <= st; j++) { // control columns for STARS
 * System.out.print("*\s"); // print (use \s : for space or \t : for tab)
 * }
 * 
 * // since, main items of line 1 is already printed
 * // below is the prep for next line
 * 
 * sp--;
 * System.out.println(); // end line or change line
 * }
 * 
 */