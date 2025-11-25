/**
 * 1. You are required to print the Greatest Common Divisor (GCD) of two numbers
 * 2. You are also required to print the Lowest Common Multiple (LCM) of the
 * same numbers
 * 
 * 3. Take Input 'num1' and 'num2' as the two numbers.
 * 4 Print GCD and LCM
 * 
 */

public class GcdLcm {
    public static void main(String[] args) {

        int num1 = 36;
        int num2 = 24;

        int temp1 = num1;
        int temp2 = num2;
        // expected output : GCD = 12; LCM =72

        // GCD can be calculated using the division method

        while (temp1 % temp2 != 0) {
            int rem = temp1 % temp2;
            temp1 = temp2;
            temp2 = rem;
        }

        int gcd = temp2;

        // LCM can be calculated using a formula
        int lcm = (num1 * num2) / gcd;

        System.out.println("GCD : " + gcd + " | " + "LCM : " + lcm);

    }
}
