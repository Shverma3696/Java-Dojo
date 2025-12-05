/**
 * Count digits of a number
 * 
 * E.g., number = 9875643
 * ans => no. of digits = 7
 * 
 */

public class CountDigits {
    public static void main(String[] args) {

        int n = 10000001;

        int count = 0; // no. of digits

        while (n != 0) {
            n = n / 10;
            count++;
        }

        System.out.println(count);

    }
}
