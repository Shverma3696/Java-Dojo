/**
 * 
 * 1. You are given a base 'b'.
 * 2. You are given two numbers 'n1' and 'n2' of base b.
 * 3. You are required to multiply 'n1' and 'n2' and print the value.
 * 
 * Constraints:
 * [2 <= b <= 10]
 * [0 <= n1 <= 10000]
 * [0 <= n2 <= 10000]
 */

public class AnyBaseMultiplication {

    public static void main(String[] args) {

        // given
        int n1 = 236, n2 = 1212, b = 8;
        // expected output = 754

        System.out.println(getDifference(n1, n2, b));

    }

    // approach
    public static int getDifference(int n1, int n2, int b) {
        int rv = 0; // return value

        int pow = 1; // zeroth power of 10;
        int carry = 0; // initial value of carry is always 0
        while (n2 > 0) {

            // step 1: take out the units digits from both numbers
            int d1 = n1 % 10;
            int d2 = n2 % 10;

            // step 2: reduce both numbers for next iterations
            n1 = n1 / 10;
            n2 = n2 / 10;

            // step3: manage borrow /carry smartly and subtract both d1 from d2
            int ansDigit = 0;
            d2 = d2 + carry;

            if (d2 >= d1) {
                carry = 0;
                ansDigit = d2 - d1;
            } else {
                carry = -1;
                ansDigit = d2 + b - d1;
            }

            // step 4: now, create the final answer difference
            rv += ansDigit * pow;
            pow *= 10;
        }

        return rv;
    }
}