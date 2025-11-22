/**
 * print digits of a number; left -> right
 * 
 * E.g., number = 3456
 * ans => 3, 4, 5, 6
 * 
 */

public class PrintDigits {
    public static void main(String[] args) {

        int n = 1000;

        int temp = n;

        int count = 0; // no. of digits

        while (temp != 0) {
            temp = temp / 10;
            count++;
        }

        int divisor = (int) Math.pow(10, count - 1);
        int digit;

        while (divisor != 0) {

            digit = n / divisor;
            System.out.println(digit);

            n = n % divisor;
            divisor = divisor / 10;
        }

    }
}
