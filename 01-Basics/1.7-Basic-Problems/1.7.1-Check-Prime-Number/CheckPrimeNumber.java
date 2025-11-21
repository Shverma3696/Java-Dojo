/**
 * Problem : check if the given number is prime or not-prime *
 */

public class CheckPrimeNumber {
    public static void main(String[] args) {

        int n = 97; // given number

        int count = 0;

        // basic or slower version : for (int j = 2; j <= n - 1; j++)
        // it may get slow for very large numbers

        // faster more version
        for (int i = 2; i * i <= n; i++) {

            if (n % i == 0) {
                count++;
                break;
            }

        }

        if (count == 0) {
            System.out.println("prime");
        } else {
            System.out.println("not prime");
        }
    }
}
