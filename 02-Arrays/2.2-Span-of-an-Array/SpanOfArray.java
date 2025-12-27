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
        int rv = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < rv) {
                rv = arr[i];
            }
        }
        return rv;
    }

    public static int findMax(int[] arr) {
        int rv = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > rv) {
                rv = arr[i];
            }
        }
        return rv;
    }
}
