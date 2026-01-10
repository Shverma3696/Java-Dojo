import java.util.Scanner;

/**
 * String Basics
 * - Declaring
 * - Initialising
 * - taking input from console
 * - length()
 * 
 */
public class StringBasics {
    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);

        // 1. Declaring and initialising Strings
        // String s1 = "Hello";
        // System.out.println(s1);

        // 2. taking input from console
        // System.out.println("enter string to input :");
        // String s2 = scanner.next(); // next() reads elements till first space, if
        // more than 2 elements then create a new String variable and again use next()
        // space
        // String s2 = scanner.nextLine(); // nextLine() reads entire line
        // System.out.println(s2);

        // 3. Length90 function - gets the size of string
        String s = "abcdef";
        System.out.println("String size = " + s.length());
    }
}
