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

        int[] difference = new int[a2.length];

        // pointers
        int i = a1.length - 1;
        int j = a2.length - 1;
        int k = difference.length - 1;

        // subtraction
        int carry = 0; // or borrow
        while (k >= 0) {
            int ansDigit = 0;
            int a1val = i >= 0 ? a1[i] : 0; // managing leading zeros if a1 is a very small number or has less digits
                                            // than a2

            if (a2[j] + carry >= a1val) {
                ansDigit = a2[j] + carry - a1val;
                carry = 0;
            } else {
                ansDigit = a2[j] + carry + 10 - a1val; // +10 borrowed
                carry = -1; // carry becomes -1 for next iteration
            }

            difference[k] = ansDigit;

            i--;
            j--;
            k--;
        }

        // to print the number and also handle the leading zeros because we do not want
        // to print leading zeros
        int index = 0;
        while (index < difference.length) {
            if (difference[index] == 0) {
                index++;
            } else {
                break;
            }
        }

        while (index < difference.length) {
            System.out.print(difference[index]);
            index++;
        }

    }

    // public static int sumOfTwoArrays(int[] a1, int[] a2) {
    // int rv = 0;

    // for (int i = a1.length - 1; i >= 0; i--) {

    // }

    // return rv;
    // }

}