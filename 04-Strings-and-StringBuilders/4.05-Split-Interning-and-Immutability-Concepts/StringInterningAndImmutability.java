/**
 * 1. practicing concepts:
 * - String memory
 * - String Interning
 * - String with 'new' keyword
 * 
 * 
 * Please Note:- Always use equals() method for string comparisons as it check
 * both the first the address, if same return true, else checks the string char
 * by char and only then return true or false
 * 
 */

public class StringInterningAndImmutability {
    public static void main(String[] args) {

        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = new String("Hello");

        // 1. Comparison using '==';
        // -> checks and compares only the address to which the variable is pointing
        // -> Does not check and compare the string character by character
        System.out.println(s1 == s2); // true, since both pointing to same address in memory or intern pool
        System.out.println(s1 == s3); // false, since s3 is created using 'new' keyword it point to different address

        // 2. Comparison using 'equals()';
        // -> checks and compares, first the address to which the variable is pointing,
        // if same returns true else,
        // -> checks and compares the string character by character
        System.out.println(s1.equals(s2)); // true, since both pointing to same address in memory or intern pool
        System.out.println(s1.equals(s3)); // true, address maybe different but equals() method also check the string
                                           // char by char

    }
}
