/**
 * 1. You are grven a number 'n'.
 * 2. You are given a base 'b' (2 >= b <= 10). 'n' is a number on base 'b'.
 * 3. You are required to convert the number 'n' into its corresponding value in
 * decimal system.
 * 
 */

public class AnyBaseToDecimal {

    // my approach
    public static int anyBaseToDecimal(int n, int b) {
        int rv = 0; // return value
        int pow = 1; // multiplication power of 8
        while (n > 0) {
            int dig = n % 10;
            n = n / 10;

            rv += dig * pow;
            pow *= 8;
        }

        return rv;
    }

    public static void main(String[] args) {

        // given
        int n = 1172, b = 8;

        System.out.println(anyBaseToDecimal(n, b));

    }

}