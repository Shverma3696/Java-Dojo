/**
 * 1. Given a string containg either only lower case or only uper case alphabets
 * 2. You have to form a string that contains the differenceof ASCII valuesof
 * every two consecutive characters between those characters.
 * 
 * E.g., given string "abecd" -> output : "a1b3e-2c1d"
 * Explaination :
 * >> 'b'-'a' = 1
 * >> 'e'-'b' = 3
 * >> 'c'-'e' = -2
 * >> 'd'-'c' = 1
 * 
 */

public class ASCII_Difference {
    public static void main(String[] args) {

        String str = "abecd";
        System.out.println(asciiDifferenceString(str));
    }

    private static String asciiDifferenceString(String str) {
        StringBuilder sb = new StringBuilder();

        // char firstChar = str.charAt(0);
        // sb.append(firstChar);

        sb.append(str.charAt(0)); // append first character of string

        for (int i = 1; i < str.length(); i++) {
            int asciiDifference = str.charAt(i) - str.charAt(i - 1);
            sb.append(asciiDifference);
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }

}

// comment 123
