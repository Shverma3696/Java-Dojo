/**
 * 1. given a number 'n'.
 * 
 * Print pattern (E.g., n = 5):
 * [*]
 * [**]
 * [***]
 * [****]
 * [*****]
 * 
 */

public class LeftLowerTriangle {
    public static void main(String[] args) {

        int n = 5;

        for (int i = 1; i <= n; i++) { // control rows

            for (int j = 1; j <= i; j++) { // control columns

                System.out.print("*\s"); // print (use \s : for space or \t : for tab)
            }
            System.out.println(); // end line or change line
        }
    }
}
