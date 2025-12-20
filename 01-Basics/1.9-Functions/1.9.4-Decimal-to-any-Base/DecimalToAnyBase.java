/**
 * 1. You are given a decimal number 'n'.
 * 2. You are given a base 'b'.
 * 3. You are required to convert the number 'n' into its corresponding value in
 * base 'b'.
 * 
 */

public class DecimalToAnyBase {

    public static int decimalToAnyBase(int n, int b) {

        int cnum = 0; // converted number
        int count = 0;
        while (n != 0) {
            int rem = n % b;
            int mult = (int) Math.pow(10, count);
            cnum = cnum + rem * mult;

            n = n / b;
            count++;
        }

        return cnum;
    }

    public static void main(String[] args) {

        // given
        int n = 634, b = 8;

        System.out.println(decimalToAnyBase(n, b));

    }

}
