/**
 * 1. Given a String 's'.
 * 2. You are required to print all substrings of the given string
 * 
 */

public class PrintAllSubstrings {
    public static void main(String[] args) {

        String s = "abcd";

        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                System.out.println(s.substring(i, j));
            }
        }
    }
}
