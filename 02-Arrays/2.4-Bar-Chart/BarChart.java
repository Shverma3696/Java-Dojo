/**
 * 1. You are given a number 'n', representing the size of array 'a'.
 * 2. You are given 'n' numbers representing the elements of array 'a'.
 * 3. You are required to print a vertical bar chart where '*' will represent
 * the single unit and total height of bar is the value of element of array 'a'
 * at that index.
 * 4. Bar should be in the same order at the elements
 * 
 */

public class BarChart {
    public static void main(String[] args) {

        // given
        int[] a = { 3, 1, 0, 7, 5 };

        int maxElement = findMaxElement(a);

        for (int i = 0; i < maxElement; i++) {
            for (int j = 0; j < a.length; j++) {

            }
        }

        // System.out.println(d + " Element is at the following index => " +
        // findIndexOfElementInAnArray(a, d));
    }

    public static int findMaxElement(int[] a) {
        int max = a[0];

        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }

        return max;
    }

}