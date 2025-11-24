/**
 * Please note: this is made up question just for improve problem solving
 * there is no such thing as an Inverse number in Mathematical terms
 * 
 * 1. You are given two numbers 'n' and 'k'. You are required to rotate 'n', k
 * times to the right.
 * If k is positive, rotate to the right i.e., remove rightmost digit and make
 * it leftmost. DO the reverse for negatrve value Of k. Also 'k' can have an
 * absolute value larger than number of digits in 'n'.
 * 
 * 2. Take as input 'n' and 'k'.
 * 
 * 3. O/P : Print the rotated number
 * 
 * 4. Note - Assume that the number of rotations will not cause leading 0's in
 * the result e.g., such an input will not be given
 * n = 12340056
 * k = 3
 * expected o/p : r = 0562340 (which is not possible)
 * 
 * 5. 'n' and 'k' both are integers
 * 
 * 6. valid example : n = 27391 ; k = 2 ; o/p r = 91273
 * 
 * Sumeet sir's solutions at the last
 */

public class RotateNumber {
    public static void main(String[] args) {

        int n = 27391;
        int k = -6;

        int nod = 0;
        int temp = n;
        while (temp != 0) {
            temp = temp / 10;
            nod++;
        }

        k = k % nod; // handle big values

        if (k < 0) { // handle negative values
            k = k + nod;
        }

        int div = 1;
        int mult = 1;
        for (int i = 1; i <= nod; i++) {
            if (i <= k) {
                div = div * 10;
            } else {
                mult = mult * 10;
            }
        }

        int quo = n / div; // quotiant
        int rem = n % div; // remainder

        int rn = (rem * mult) + quo; // rotated number
        System.out.println(rn);

    }
}

/*
 * My Solution:
 * int n = 27391;
 * int k = 6;
 * 
 * int rotatedNumber = 0; // output number variable
 * 
 * int nod = 0; // number of digits
 * int temp = n;
 * while (temp != 0) {
 * temp = temp / 10;
 * nod++;
 * }
 * 
 * // handle 'k' for negative and big values
 * 
 * if (k >= nod || k <= (-nod)) {
 * k = k % nod;
 * }
 * 
 * if (k < 0) {
 * k = k + nod;
 * }
 * 
 * for (int i = 1; i <= k; i++) {
 * 
 * int rem = n % 10;
 * int quo = n / 10;
 * 
 * int mult = (int) Math.pow(10, nod - 1);
 * 
 * rotatedNumber = (rem * mult) + quo;
 * 
 * n = rotatedNumber;
 * }
 * 
 * System.out.println(rotatedNumber);
 */
