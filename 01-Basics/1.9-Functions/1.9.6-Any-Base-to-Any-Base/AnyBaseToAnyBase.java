/**
 * 1. You are given a number 'n' (0 >= n <= 512).
 * 2. You are given a base 'b1' (2 >= b1 <= 10). 'n' is a on base 'b1'.
 * 3. You are given another base 'b2' (2 >= b2 <= 10).
 * 4. You are required to convert the number 'n' of base 'b1' to a number in
 * base b2.
 * 
 */

public class AnyBaseToAnyBase {

    public static void main(String[] args) {

        // given
        int n = 172, b1 = 8, b2 = 2;

        System.out.println(anyBaseToAnyBase(n, b1, b2));

    }

    // my approach
    public static int anyBaseToAnyBase(int n, int b1, int b2) {

        int decimalNumber = anyBaseToDecimal(n, b1);
        int finalNumberInBaseB2 = decimalToAnyBase(decimalNumber, b2);
        return finalNumberInBaseB2;
    }

    public static int anyBaseToDecimal(int n, int b) {
        int rv = 0; // return value
        int pow = 1; // multiplication power starting from 0
        while (n > 0) {
            int dig = n % 10;
            n = n / 10;

            rv += dig * pow;
            pow *= b;
        }

        return rv;
    }

    public static int decimalToAnyBase(int n, int b) {

        int rv = 0; // return value
        int pow = 1; // multiplication power of 10
        while (n > 0) {
            int dig = n % b;
            n = n / b;

            rv += dig * pow;
            pow *= 10;
        }

        return rv;
    }

}