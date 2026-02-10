
/**
 * 1. You are given a number 'n'. representing see of array 'a'.
 * 2. You are given 'n' numbers, representing the elements of array 'a'.
 * 3. You are given a number 'k'. representing the size of window.
 * 4. You are required to find and print the maximum element in every window of size 'k'
 * 
 * E.g.,
 * for the array [2 9 3 8 1 7 12 6 14 4 32 0 7 19 8 12 6] and k = 4, 
 * >> the answer [9 9 8 12 12 14 14 32 32 32 32 19 19 19]
 * 
*/

import java.util.Stack;

public class SlidingWindowMaximum {
    public static void main(String[] args) {
        int[] arr = { 2, 9, 3, 8, 1, 7, 12, 6, 14, 4, 32, 0, 7, 19, 8, 12, 6 };
        int k = 4;

        Stack<Integer> st = new Stack<>();
        int[] nge = new int[arr.length];

        st.push(arr.length - 1);
        nge[arr.length - 1] = arr.length;

        for (int i = arr.length - 2; i >= 0; i--) {
            // pops - answer - push

            while (st.size() > 0 && arr[i] >= arr[st.peek()]) {
                st.pop();
            }

            if (st.size() == 0) {
                nge[i] = arr.length;
            } else {
                nge[i] = st.peek();
            }

            st.push(i);
        }

        int j = 0;
        for (int i = 0; i <= arr.length - k; i++) {
            // enter the loop to find the maximum of window starting at i

            if (j < i) {
                j = i;
            }
            while (nge[j] < i + k) {
                j = nge[j];
            }
            System.out.print(arr[j] + " ");
        }
    }

}
