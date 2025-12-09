/**
 * 
 * 1. You are given a number 'n'.
 * 2. You've to write code to it's multiplication table up to 10 in format given
 * below
 * 
 * example output : 2 * 1 = 2
 */

public class MultiplicationTable {
    public static void main(String[] args) {

        int n = 5;

        // approach 1
        int tableCount = 10;

        for (int i = 1; i <= tableCount; i++) {
            System.out.println(n + " * " + i + " = " + (n * i));
        }

    }
}
