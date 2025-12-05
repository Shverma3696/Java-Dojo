/**
 * print all prime numbers between a range
 * low and high (both included)
 * 
 * Take as input 'low'; the lower limit ot range
 * Take as input 'high' the higher limit Of range
 * 
 */

public class PrimeNumbersInRange {
    public static void main(String[] args) {
        int low = 1;
        int high = 50;

        for (int i = low; i <= high; i++) {

            int count = 0;

            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    count++;
                    break;
                }
            }

            if (count == 0) {
                // prime
                System.out.println(i);
            }
        }
    }
}
