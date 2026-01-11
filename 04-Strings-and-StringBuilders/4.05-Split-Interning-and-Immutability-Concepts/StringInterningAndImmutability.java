/**
 * 1. practicing concepts:
 * - String memory
 * - String Interning
 * - String with 'new' keyword
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

    }
}
