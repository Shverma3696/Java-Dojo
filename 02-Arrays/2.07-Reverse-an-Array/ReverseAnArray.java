/**
 * 1. You are given a number 'n', representing the size of array 'a'.
 * 2. You are given 'n' numbers, representing elements of array 'a'.
 * 3. You are required to reverse the content of array 'a'.
 * 
 */

public class ReverseAnArray {
    public static void main(String[] args) {

        // given
        int[] a = { 10, 20, 30, 40, 50 };

        // funtions
        reverse(a);
        display(a);
    }

    public static void reverse(int[] a) {
        // pointers
        int i = 0;
        int j = a.length - 1;

        while (i < j) {
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            i++;
            j--;
        }
    }

    public static void display(int[] a) {
        for (int val : a) {
            System.out.print(val + " ");
        }
    }
}