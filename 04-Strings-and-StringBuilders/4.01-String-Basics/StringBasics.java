/**
 * String Basics
 * - Declaring
 * - Initialising
 * - taking input from console
 * - length()
 * - charAt()
 * - substring
 */

// import java.util.Scanner;

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

        // 4. charAt() - gets character of string at a given index
        char ch = s.charAt(3);
        System.out.println(ch); // 4.1. printing 1 character

        // 4.2. printing all characters
        for (int i = 0; i < s.length(); i++) {
            System.out.println(s.charAt(i));
        }

        // 5. SubString
        // 5.1. only start index
        System.out.println(s.substring(1)); // output = bcdef; all chars from 1st index (included)
        // 5.2. start and end index both
        System.out.println(s.substring(1, 5)); // output = bcde - endindex is exclusive or not included
        System.out.println(s.substring(1, 1)); // output = "" - blank because of endindex
    }
}
