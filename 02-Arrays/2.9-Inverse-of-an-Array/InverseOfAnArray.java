/**
 * 1. You are given a number 'n', representing the size of array 'a'.
 * 2. You are given 'n' numbers, representing elements of array 'a'.
 * 3. You are required to calculate inverse of an array
 * 4. Constraints : element of array will range from 0 to n-1; and no duplicates
 * 
 */

public class InverseOfAnArray {
    public static void main(String[] args) {

        // given
        int[] a = { 4, 3, 0, 2, 1 };
        // {2, 4, 3, 1, 0 }

        // funtions
        int[] ia = inverse(a); // inversed array
        display(ia);
    }

    public static int[] inverse(int[] a) {
        int[] rv = new int[a.length];

        for (int i = 0; i < a.length; i++) {
            int val = a[i];
            rv[val] = i;
        }

        return rv;
    }

    public static void display(int[] a) {
        for (int val : a) {
            System.out.print(val + " ");
        }
    }
}