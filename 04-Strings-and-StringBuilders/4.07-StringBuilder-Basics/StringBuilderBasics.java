/**
 * StringBuilder Basics
 * - Declaring
 * - Initialising
 * - taking input from console
 * - length()
 * - charAt()
 * - setCharAt()
 * - substring
 * 
 * Importnant Note:-
 * StringBuilder class is mutable and provide built-in methods like insert() and
 * setCharAt()
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

        // 5. setCharAt() method : changes the instance/character at given index
        sb.setCharAt(0, 'C');
        System.out.println("Modified String = " + sb);

    }
}
