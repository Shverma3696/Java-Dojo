/**
 * Problem 1 : Check number is prime or not
 * Problem 2 : Which is a greater number
 */

public class ConditionalStatements {
    public static void main(String[] args) {

        // problem 1
        int x = 10;
        if (x % 2 == 0) {
            System.out.println(x + " is even");
        } else {
            System.out.println(x + " is odd");
        }

        // problem 2
        int n1 = 10;
        int n2 = 10;

        if (n1 == n2) {
            System.out.println("n1 is equal to n2");
        } else if (n1 > n2) {
            System.out.println("n1 is greater than n2");
        } else {
            System.out.println("n1 is smaller than n2");
        }
    }
}