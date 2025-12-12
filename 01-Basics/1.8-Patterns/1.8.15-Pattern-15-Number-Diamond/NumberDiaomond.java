/**
 * 1. given a number 'n'. (number of rows)
 * 
 * Print pattern (E.g., n = 5):
 * [--1--]
 * [-232-]
 * [34543]
 * [-232-]
 * [--1--]
 * 
 */

public class NumberDiaomond {
    public static void main(String[] args) {

        int n = 5;

        // approach 1
        int sp = n / 2; // number of spaces
        int st = 1; // number of stars

        int val = 1; // to print
        for (int i = 1; i <= n; i++) {

            // print spaces first
            for (int j = 1; j <= sp; j++) {
                System.out.print("\t");
            }

            // print stars
            int cval = val; // computed value to be printed
            for (int j = 1; j <= st; j++) {
                System.out.print(cval + "\t");

                if (j <= st / 2) {
                    cval++;
                } else {
                    cval--;
                }
            }

            if (i <= n / 2) {
                sp--;
                st += 2;
                val++;
            } else {
                sp++;
                st -= 2;
                val--;
            }
            System.out.println();
        }

    }
}

// try again for better understanding
// try again for better understanding
// try again for better understanding
