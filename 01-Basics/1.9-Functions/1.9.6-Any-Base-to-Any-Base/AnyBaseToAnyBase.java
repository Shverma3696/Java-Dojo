/**
 * 1. You are given a number 'n'.
 * 2. You are given a base 'b1' (2 >= b1 <= 10). 'n' is a on base 'b1'.
 * 3. You are given another base 'b2' (2 >= b2 <= 10).
 * 4. You are required to convert the number 'n' of base 'b1' to a number in
 * base b2.
 * 
 */

public class AnyBaseToAnyBase {

    // my approach
    public static int anyBaseToAnyBase(int n, int b) {
        // int rv = 0; // return value
        // int pow = 1; // multiplication power of 8 to the power 0
        // while (n > 0) {
        // int dig = n % 10;
        // n = n / 10;

        // rv += dig * pow;
        // pow *= b;
        // }

        // return rv;
    }

    public static void main(String[] args) {

        // given
        int n = 1172, b1 = 8, b2 = 10;

        System.out.println(anyBaseToAnyBase(n, b));

    }

}