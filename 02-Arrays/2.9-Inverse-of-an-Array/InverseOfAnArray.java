/**
 * 1. You are given a number 'n', representing the size of array 'a'.
 * 2. You are given 'n' numbers, representing elements of array 'a'.
 * 3. You are required to calculate inverse of an array
 * 
 */

public class InverseOfAnArray {
    public static void main(String[] args) {

        // given
        int[] a = { 10, 20, 30, 40, 50 };
        int k = 2;

        // funtions
        // rotate(a, k);
        display(a);
    }

    // public static void rotate(int[] a, int k) {
    // // to roate an array; the approach is as follows
    // // divide the array in 2 parts
    // // part1 = {0 - a.length-k-1} reverse these elements
    // // part2 = {a.length-k to a.length-1} reverse these elements
    // // once above is done, part3 is to reverse the full array as a result we will
    // // get the expected output

    // // handle k
    // k = k % a.length;
    // if (k < 0) {
    // k = k + a.length;
    // }

    // // part 1
    // reverse(a, 0, a.length - k - 1);

    // // part 2
    // reverse(a, a.length - k, a.length - 1);

    // // part 3
    // reverse(a, 0, a.length - 1);
    // }

    // public static void reverse(int[] a, int i, int j) {
    // int li = i; // left index
    // int ri = j; // right index

    // while (li < ri) {
    // int temp = a[li];
    // a[li] = a[ri];
    // a[ri] = temp;

    // li++;
    // ri--;
    // }

    // }

    public static void display(int[] a) {
        for (int val : a) {
            System.out.print(val + " ");
        }
    }
}