/**
 * 
 * 1. You are required to display the prime factorization Of a number.
 * 2 Take as input a number 'n'.
 * 3 Print all its prime factors from smallest to largest.
 * 
 */

public class PrimeFactors {
    public static void main(String[] args) {

        // int n = 36; // 2, 2, 3, 3
        int n = 1440;

        // for (int div = 2; div < n; div++) { little slow
        for (int div = 2; div * div <= n; div++) { // faster approach but keep the edge case in mind for this as shown
                                                   // below
            while (n % div == 0) {
                n = n / div;
                System.out.print(div + " ");
            }
        }

        // edge case handling
        // below code mean if the 'n' is still not reduced to 1,
        // then that is the only remaining prime factor of the number
        if (n != 1) {
            System.out.print(n);
        }

    }
}
