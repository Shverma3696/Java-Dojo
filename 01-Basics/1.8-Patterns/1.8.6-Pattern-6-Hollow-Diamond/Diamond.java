/**
 * 1. given a number 'n'.
 * 
 * Print pattern (E.g., n = 5):
 * [--*--]
 * [-***-]
 * [*****]
 * [-***-]
 * [--*--]
 * 
 * Print pattern (E.g., n = 7):
 * [---*---]
 * [--***--]
 * [-*****-]
 * [*******]
 * [-*****-]
 * [--***--]
 * [---*---]
 */

public class Diamond {
    public static void main(String[] args) {

        int n = 7;

        int sp = n / 2; // number of spaces
        int st = 1; // number of stars

        for (int i = 1; i <= n; i++) { // control rows

            for (int j = 1; j <= sp; j++) { // control columns for SPACES to be printed first
                System.out.print("\s\s"); // print (use \s : for space or \t : for tab)
                // using doble spaces to even out the spaces in the final output pattern
            }

            for (int j = 1; j <= st; j++) { // control columns for STARS
                System.out.print("*\s"); // print (use \s : for space or \t : for tab)
            }

            // since, main items of line 1 is already printed
            // below is the prep for next line
            // controlling the values of stars and spaces for next line to be printed

            if (i <= n / 2) {
                sp--; // spaces keeps decreasing by 1 as we move to next row, till mid row
                st += 2; // stars keeps increasing by 2 as we move to next row, till mid row
            } else {
                sp++; // spaces keeps increasing by 1 as we move past mid row
                st -= 2; // stars keeps decreasing by 2 as we move past mid row
            }

            System.out.println(); // end line or change line
        }
    }
}