/**
 * 1. Given a string
 * 2. You have to print all permutationsof the given string iteratively
 * 
 * E.g., given string = abc
 * output = abc, acb, bac, bca, cab, cba
 * 
 * total number of permutations = 3! = 6
 * hint : length of string factorial
 * 
 */

public class StringPermutations {
    public static void main(String[] args) {

        String str = "abc";
        permutationsOfString(str);
    }

    public static void permutationsOfString(String str) {
        int n = str.length();
        int fact = factorial(n);

        for (int i = 0; i < fact; i++) {
            int temp = i;
            StringBuilder sb = new StringBuilder(str);

            for (int div = n; div >= 1; div--) { // divisor
                int quo = temp / div; // quotiant
                int rem = temp % div; // remainder

                System.out.print(sb.charAt(rem));
                sb.deleteCharAt(rem);

                temp = quo;
            }
            System.out.println();
        }
    }

    public static int factorial(int n) {
        int val = 1;
        for (int i = 2; i <= n; i++) {
            val *= i;
        }
        return val;
    }
}