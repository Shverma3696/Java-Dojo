/**
 * 1. given a number 'n'. (number of rows)
 * 
 * Print pattern (E.g., n = 4):
 * [1-----1]
 * [12---21]
 * [123-321]
 * [1234321]
 * 
 */

public class ShapeM {
    public static void main(String[] args) {

        int n = 4;

        // approach 1
        int col = (2 * n) - 1;

        int st = 1;
        int sp = (2 * n) - 3;

        for (int i = 1; i <= n; i++) {

            if (i == n) {
                for (int j = 1; j <= col; j++) {
                    System.out.print("*\t");
                }
                break;
            }

            for (int j = 1; j <= st; j++) {
                System.out.print("*\t");
            }

            for (int j = 1; j <= sp; j++) {
                System.out.print("\t");
            }

            for (int j = 1; j <= st; j++) {
                System.out.print("*\t");
            }

            st++;
            sp -= 2;
            System.out.println();
        }

    }
}

// try again for better understanding