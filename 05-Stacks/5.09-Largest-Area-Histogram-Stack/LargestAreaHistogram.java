
/**
 * 1. You are given a number 'n', representing the size of array 'a'.
 * 2. You are given 'n' numbers, representing the heights of bars in a bar chart
 * prices of a share on 'n' days.
 * 3. You are required to find and print the area of largest rectangle in the
 * histogram.
 * 
 * E.g., for array [6 2 5 4 5 1 6] 
 * => largest area =12
 * 
*/

import java.util.Stack;

public class LargestAreaHistogram {
    public static void main(String[] args) {
        int[] arr = { 6, 2, 5, 4, 5, 1, 6 };

        // 1. create 2 same length arrays to store the indexes of each element's next
        // smaller element's to the left and right

        // 1.1. Next smaller element's index on the right; right boundary; (using
        // reverse approach)
        int[] rightBound = new int[arr.length];
        Stack<Integer> stRb = new Stack<>();
        stRb.push(arr.length - 1);
        rightBound[rightBound.length - 1] = rightBound.length;
        for (int i = rightBound.length - 2; i >= 0; i--) {
            while (stRb.size() > 0 && arr[i] < arr[stRb.peek()]) {
                stRb.pop();
            }

            if (stRb.size() == 0) {
                rightBound[i] = rightBound.length;
            } else {
                rightBound[i] = stRb.peek();
            }
            stRb.push(i);
        }

        // 1.2. Next smaller element's index on the left; left boundary
        int[] leftBound = new int[arr.length];
        Stack<Integer> stLb = new Stack<>();
        stLb.push(0);
        leftBound[0] = -1;
        for (int i = 1; i < leftBound.length; i++) {
            while (stLb.size() > 0 && arr[i] < arr[stLb.peek()]) {
                stLb.pop();
            }

            if (stLb.size() == 0) {
                leftBound[i] = -1;
            } else {
                leftBound[i] = stLb.peek();
            }
            stLb.push(i);
        }

        // final area calculation
        int maxArea = 0;
        for (int i = 0; i < arr.length; i++) {
            int width = rightBound[i] - leftBound[i] - 1;
            int area = arr[i] * width;
            if (area > maxArea) {
                maxArea = area;
            }
        }

        // print
        System.out.println(maxArea);

    }

}
