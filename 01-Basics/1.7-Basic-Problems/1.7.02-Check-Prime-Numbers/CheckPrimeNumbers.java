
/**
 * Problem : check if the number is prime or not-prime
 * 
 * Given :
 * multiple inputs, t, 1 - 10000 inputs
 * number, n, 2 - 10^9
 * 
*/

import java.util.Scanner;

public class CheckPrimeNumbers {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n, t = 10;
        for (int i = 1; i <= t; i++) {
            n = scan.nextInt();

            int count = 0;
            for (int j = 2; j * j <= n; j++) {

                if (n % j == 0) {
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

        scan.close();
    }
}
