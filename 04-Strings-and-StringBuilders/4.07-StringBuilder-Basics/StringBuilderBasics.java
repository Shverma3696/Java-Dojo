/**
 * StringBuilder Basics
 * - Declaring
 * - Initialising
 * - taking input from console
 * - length()
 * - charAt()
 * - substring
 * 
 * Importnant Note:-
 * 
 */

public class StringBuilderBasics {
    public static void main(String[] args) {

        // 1. Declaring and initialising
        StringBuilder sb = new StringBuilder("Hello-World");
        System.out.println(sb);

        // 2. Taking input from console is similar to Strings

        // 3. Length() of sb
        int lengthOfStringBuilder = sb.length();
        System.out.println("Length of SB = " + lengthOfStringBuilder);

        // 4. charAt() method
        char ch = sb.charAt(0);
        System.out.println("Char at given index = " + ch);
    }
}
