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
        int n1 = 234, n2 = 76, b = 8;
        // expected output = 22710

        System.out.println(getProduct(n1, n2, b));

    }

    // approach
    public static int getProduct(int n1, int n2, int b) {
        int rv = 0; // return value

        int pow = 1; // zeroth power of 10;
        while (n2 > 0) {

            // step 1: take out units/single digit from N2
            int d2 = n2 % 10;

            // step 2: reduce N2 for next iteration
            n2 = n2 / 10;

            // step 3: product with single digit of N2
            int singleDigitProduct = getProductWithSingleDigit(n1, d2, b);

            // step 4: now, create the final answer product
            rv = getSum(rv, singleDigitProduct * pow, b);
            pow = pow * 10;
        }

        return rv;
    }

    public static int getProductWithSingleDigit(int n1, int digitN2, int b) {
        int rv = 0;

        int pow = 1;
        int carry = 0;
        while (n1 > 0 || carry > 0) {

            // step 1: take out the units digits from N1 to multiply with single digit of N2
            int d1 = n1 % 10;

            // step 2: reduce N1 for next iteration
            n1 = n1 / 10;

            // step 3: multiply both the units digits d1 and digit of N2
            int ansDigit = d1 * digitN2 + carry;

            // step 4: adjust carry and set answer digit
            carry = ansDigit / b;
            ansDigit = ansDigit % b;

            // step 5: now, create the final answer
            rv = rv + ansDigit * pow;
            pow = pow * 10;
        }

        return rv;
    }

    public static int getSum(int n1, int n2, int b) {
        int rv = 0; // return value

        int pow = 1; // zeroth power of 10;
        int carry = 0; // initial value of carry is always 0
        while (n1 > 0 || n2 > 0 || carry > 0) {

            // step 1: take out the units digits from both numbers
            int d1 = n1 % 10;
            int d2 = n2 % 10;

            // step 2: reduce both numbers for next iterations
            n1 = n1 / 10;
            n2 = n2 / 10;

            // step3: add both the units digits d1 and d2
            int ansDigit = d1 + d2 + carry;
            carry = ansDigit / b;
            ansDigit = ansDigit % b;

            // step 4: now, create the final answer sum
            rv += ansDigit * pow;
            pow *= 10;
        }

        return rv;
    }

}