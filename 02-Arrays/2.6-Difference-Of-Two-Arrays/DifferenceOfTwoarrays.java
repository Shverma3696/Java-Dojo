/**
 * 1. You are given a number n1, representing the size of array a1.
 * 2. You are given n1 numbers, representing elements of array a1.
 * 3. You are given a number n2, representing the size of array a2.
 * 4. You are given n2 numbers, representing elements of array a2.
 * 5. The two arrays represent digits of two numbers.
 * 6. You are required to find the difference of two numbers represented by two
 * arrays and print the array; a2-a1
 * 
 * Note:- Assume a2 is greater than a1
 * 
 */

public class DifferenceOfTwoarrays {
    public static void main(String[] args) {

        // given
        int[] a1 = { 3, 1, 0, 7, 5 };
        int[] a2 = { 1, 1, 1, 1, 1, 1 };

        int[] sum = new int[a1.length > a2.length ? a1.length : a2.length];

        // pointers
        int i = a1.length - 1;
        int j = a2.length - 1;
        int k = sum.length - 1;

        // sum
        int carry = 0;
        while (k >= 0) {
            int ansDigit = carry;

            if (i >= 0) {
                ansDigit += a1[i];
            }

            if (j >= 0) {
                ansDigit += a2[j];
            }

            carry = ansDigit / 10;
            ansDigit = ansDigit % 10;

            sum[k] = ansDigit;

            i--;
            j--;
            k--;
        }

        if (carry != 0) {
            System.out.print(carry);
        }

        for (int val : sum) {
            System.out.print(val);
        }
    }

    // public static int sumOfTwoArrays(int[] a1, int[] a2) {
    // int rv = 0;

    // for (int i = a1.length - 1; i >= 0; i--) {

    // }

    // return rv;
    // }

}