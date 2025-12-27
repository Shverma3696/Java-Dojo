/**
 * 1. You are given a number 'n', representing the count of elements.
 * 2. You are given 'n' numbers.
 * 3. You are required to find the SPAN of input. Span is defined as difference
 * of maximum value and minimum value.
 * 
 * 
 */

public class SpanOfArray {
    public static void main(String[] args) {
        // given
        int[] arr = { 15, 30, 40, 4, 11, 9 };

        // expected output 36

        // System.out.println(arr.length);

        int minVal = findMin(arr); // min value in array
        int maxVal = findMax(arr); // max value in array

        int spanOfArray = maxVal - minVal;

        System.out.println("Span of this Array = " + spanOfArray);
    }

    public static int findMin(int[] arr) {
        // approach 1
        // int rv = Integer.MAX_VALUE;
        // for (int i = 0; i < arr.length; i++) {
        // if (arr[i] < rv) {
        // rv = arr[i];
        // }
        // }
        // return rv;

        // approach 2
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static int findMax(int[] arr) {
        // approach 1
        // int rv = Integer.MIN_VALUE;
        // for (int i = 0; i < arr.length; i++) {
        // if (arr[i] > rv) {
        // rv = arr[i];
        // }
        // }
        // return rv;

        // approach 2
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}

/**
 * other approach to find min max in ONE go:
 * 
 * Directly use in main method
 * int min = arr[0];
 * int max = arr[0];
 * 
 * for (int i = 1; i < arr.length; i++) {
 * 
 * // to find min
 * if (arr[i] < min) {
 * min = arr[i];
 * }
 * 
 * // to find max
 * if (arr[i] > max) {
 * max = arr[i];
 * }
 * }
 *
 */