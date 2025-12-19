/**
 * 1. are given a number 'n'.
 * 2. You are given a digit 'd'.
 * 3. You are required to calculate the frequency of digit 'd' in number 'n'.
 * 
 */

public class DigitFrequency {

    // approach using function
    public static int computeDigitFrequency(int n, int d) {
        int frequency = 0;

        while (n != 0) {
            int rem = n % 10;
            if (rem == d) {
                frequency++;
            }
            n = n / 10;
        }
        return frequency;
    }

    public static void main(String[] args) {

        // given
        int n = 994543234, d = 4;

        System.out.println(computeDigitFrequency(n, d));

    }

}
