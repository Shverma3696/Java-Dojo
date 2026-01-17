/**
 * 1. Given a String 'str'.
 * 2. You are required to print compression1 and compression2 of given string
 * 
 * E.g., str = "aaabbcccddaeef"
 * >> compression1 = abcdaef
 * >> compression2 = a3b2c3d2ae2f (number of times the same char occurs except 1
 * time)
 * 
 */

public class StringCompression {
    public static void main(String[] args) {

        String str = "aaabbcccddaeef";

        compression1(str);
        compression2(str);

    }

    public static void compression1(String s) {
        String newStr = "" + s.charAt(0);
        for (int i = 1; i < s.length(); i++) {
            char currChar = s.charAt(i);
            char prevChar = s.charAt(i - 1);

            if (currChar != prevChar) {
                newStr += currChar;
            }
        }

        System.out.println(newStr);
    }

    public static void compression2(String s) {
        String newStr = "" + s.charAt(0);
        int count = 1;
        for (int i = 1; i < s.length(); i++) {
            char currChar = s.charAt(i);
            char prevChar = s.charAt(i - 1);

            if (currChar == prevChar) {
                count++;
            } else {
                if (count > 1) {
                    newStr += count;
                    count = 1;
                }
                newStr += currChar;
            }
        }

        if (count > 1) {
            newStr += count;
        }

        System.out.println(newStr);
    }

}
