/**
 * 1. Given a String 's'.
 * 2. You are required to print all palindromic substrings of the given string
 * 
 */

public class PrintAllPalindromicSubstrings {
    public static void main(String[] args) {

        String s = "abccbc";

        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                String ss = s.substring(i, j);
                if (isSubstringPalindromic(ss)) {
                    System.out.println(ss);
                }
            }
        }
    }

    public static boolean isSubstringPalindromic(String str) {
        int i = 0;
        int j = str.length() - 1;

        while (i <= j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            } else {
                i++;
                j--;
            }
        }
        return true;
    }
}
