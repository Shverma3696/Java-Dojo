/**
 * 1. practicing the use of Split method in strings
 */

public class UsingSplitMethod {
    public static void main(String[] args) {

        // 1.
        // String s = "abc def ghi kjl mno";
        // String[] sParts = s.split(" "); // split method

        // 2.
        String s = "abc,def,ghi,kjl,mno";
        String[] sParts = s.split(","); // split method can be used with any type of regex

        for (int i = 0; i < sParts.length; i++) {
            System.out.println(sParts[i]);
        }
    }
}
