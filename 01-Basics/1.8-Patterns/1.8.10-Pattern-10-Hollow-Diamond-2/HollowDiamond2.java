/**
 * 1. given a number 'n'.
 * 
 * Print pattern (E.g., n = 5):
 * [--*--]
 * [-*-*-]
 * [*---*]
 * [-*-*-]
 * [--*--]
 * 
 */

public class HollowDiamond2 {
    public static void main(String[] args) {

        int n = 5;

        // approach 1
        int osp = n / 2; // outer spaces
        int isp = -1; // inner spaces

        int st1 = 1; // star for first and last rows, always 1
        int st2 = 2; // stars for middle rows, always 2

        for (int i = 1; i <= n; i++) {

            // print outer spaces
            for (int j = 1; j <= osp; j++) {
                System.out.print("\s\s");
            }

            if (i == 1 || i == n) {
                System.out.print("*\s"); // print (use \s : for space or \t : for tab)
            } else {
                System.out.print("*\s");

                // print iner spaces
                for (int j = 1; j <= isp; j++) {
                    System.out.print("\s\s");
                }

                System.out.print("*\s");
            }

            if (i <= n / 2) {
                osp--;
                isp += 2;
            } else {
                osp++;
                isp -= 2;
            }

            System.out.println(); // end line
        }

    }
}