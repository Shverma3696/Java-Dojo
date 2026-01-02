/**
 * 1. You are given a number 'n', representing the size of array 'a'.
 * 2. You are given 'n' numbers, representing elements of array 'a'.
 * 3. You are given a number 'k'.
 * 4. Rotate the array 'a', 'k' times to the right (for positive values of k),
 * and to the left for negative values of 'k'.
 * 
 */

public class RotateAnArray {
    public static void main(String[] args) {

        // given
        int[] a = { 10, 20, 30, 40, 50 };

        // funtions
        reverse(a);
        display(a);
    }

    public static void rotate(int[] a) {

    }

    public static void display(int[] a) {
        for (int val : a) {
            System.out.print(val + " ");
        }
    }
}