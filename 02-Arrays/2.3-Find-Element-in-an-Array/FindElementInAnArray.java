/**
 * 1. You are given a number 'n', representing the size of array 'a'.
 * 2. You are given 'n' numbers representing the elements of array 'a'.
 * 3. You are given another number 'd'.
 * 4. You are required to check if 'd' exists in the array 'a' and at what index
 * (0 based). If found print the index; otherwise print -1.
 * 
 */

public class FindElementInAnArray {
    public static void main(String[] args) {

        // given
        int[] a = { 15, 30, 40, 4, 11, 9 };
        int d = 40; // element to find

        System.out.println(d + "Element is at the following index = " + findIndexOfElementInAnArray(a, d));
    }

    public static int findIndexOfElementInAnArray(int[] arr, int d) {
        int rv = -1;

        return rv;
    }
}