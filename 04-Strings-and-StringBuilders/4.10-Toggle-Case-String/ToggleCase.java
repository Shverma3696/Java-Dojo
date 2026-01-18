/**
 * 1. Given a string containg lower case and uper case alphabets
 * 2. You have to toggle the case of every character of the given String.
 * i.e., lower -> upper ; upper -> lower
 * E.g., ABcdE -> abCDe
 * 
 */

public class ToggleCase {
    public static void main(String[] args) {

        String str = "ABcdEFgh";
        System.out.println(toggleCase(str));
    }

    public static String toggleCase(String str) {
        StringBuilder sb = new StringBuilder(str);

        for (int i = 0; i < sb.length(); i++) {
            char ch = sb.charAt(i);

            if (ch >= 'a' && ch <= 'z') { // if char is lower case

                char upperCh = (char) ('A' + ch - 'a'); // converted to upper case character
                sb.setCharAt(i, upperCh); // added or set back the converted char at same position

            } else if (ch >= 'A' && ch <= 'Z') { // if char is uppercase

                char lowerCh = (char) ('a' + ch - 'A'); // converted to lower case
                sb.setCharAt(i, lowerCh); // added or set back the converted char at same position
            }
        }

        return sb.toString();
    }
}
