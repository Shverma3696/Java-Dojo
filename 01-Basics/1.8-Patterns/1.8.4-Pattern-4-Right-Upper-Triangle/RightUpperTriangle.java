/**
 * 1. given a number 'n'.
 * 
 * Print pattern (E.g., n = 5):
 * [*****]
 * [-****]
 * [--***]
 * [---**]
 * [----*]
 * 
 */

public class RightUpperTriangle {
    public static void main(String[] args) {

        int n = 5;

        int st = n; // number of stars
        int sp = 0; // number of spaces

        for (int i = 1; i <= n; i++) { // control rows

            for (int j = 1; j <= sp; j++) { // control columns for SPACES to be printed first
                System.out.print("\s\s"); // print (use \s : for space or \t : for tab)
                // using doble spaces to even out the spaces in the final output pattern
            }

            for (int j = 1; j <= st; j++) { // control columns for STARS
                System.out.print("*\s"); // print (use \s : for space or \t : for tab)
            }

            sp++; // spaces keeps increasing by 1 as we move to next row
            st--; // stars keeps decreasing by 1 as we move to next row

            System.out.println(); // end line or change line
        }
    }
}