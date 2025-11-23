/**
 * print digits of a number in reverse order ; right -> left
 * 
 * E.g., number = 3456
 * ans => 6, 5, 4, 3
 * 
 */

public class PrintReverseDigits {
    public static void main(String[] args) {

        int n = 10001;

        while (n != 0) {
            System.out.println(n % 10);
            n = n / 10;
        }
    }
}
