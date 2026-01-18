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

            if (ch >= 'a' && ch <= 'z') {
                char upperCh = (char) ('A' + ch - 'a'); // upper case character
                sb.setCharAt(i, upperCh);
            } else if (ch >= 'A' && ch <= 'Z') {
                char lowerCh = (char) ('a' + ch - 'A');
                sb.setCharAt(i, lowerCh);
            }
        }

        return sb.toString();
    }
}
