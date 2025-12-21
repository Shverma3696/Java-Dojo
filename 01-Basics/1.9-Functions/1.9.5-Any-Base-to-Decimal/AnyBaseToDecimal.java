/**
 * 1. You are grven a number 'n'.
 * 2. You are given a base 'b'. 'n' is a number on base 'b'.
 * 3. You are required to convert the number 'n' into its corresponding value in
 * decimal system.
 * 
 */

public class AnyBaseToDecimal {

    // my approach
    public static int anyBaseToDecimal(int n, int b) {
    }

    public static void main(String[] args) {

        // given
        int n = 634, b = 8;

        System.out.println(anyBaseToDecimal(n, b));

    }

}

/**
 * // my approach
 * public static int decimalToAnyBase(int n, int b) {
 * 
 * int cnum = 0; // converted number
 * int count = 0;
 * while (n != 0) {
 * int rem = n % b;
 * int mult = (int) Math.pow(10, count);
 * cnum = cnum + rem * mult;
 * 
 * n = n / b;
 * count++;
 * }
 * 
 * return cnum;
 * }
 * 
 * // int rv = 0; // return value
 * // int pow = 1; // multiplication power of 10
 * // while (n > 0) {
 * // int dig = n % b;
 * // n = n / b;
 * 
 * // rv += dig * pow;
 * // pow *= 10;
 * // }
 * 
 * // return rv;
 */