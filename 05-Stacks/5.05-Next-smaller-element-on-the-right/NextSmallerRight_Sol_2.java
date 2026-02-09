
/**
 * 1. You are given a number 'n'. representing the Size of array 'a'.
 * 2. You are given 'n' numbers. representing elements of array 'a'.
 * 3. You are required to find "next smaller element on the right" for all
 * elements of array
 * 4. Input and output IS handled for you.
 * 
 * Hint :-
 * "Next smaller element on the right" of an element 'x' is defined as the first
 * element to right of 'x' having value smaller than x.
 * 
 * Note -> If an element does not have any element on it's right side smaller
 * than it, consider '-1' as it's "next smaller element on right"
 * 
 * E.g., a = [2 5 9 3 1 12 6 8 7]
 * >> Next smaller for 2 is 1
 * >> Next smaller for 5 is 3
 * >> Next smaller for 9 is 3
 * >> Next smaller for 3 is 1
 * >> Next smaller for 1 is -1
 * >> Next smaller for 12 is 6
 * >> Next smaller for 6 is -1
 * >> Next smaller for 8 ts 7
 * >> Next smaller for 7 is -1
 * 
 * Solution :- iteration left to right
 * 
*/

import java.util.Stack;

public class NextSmallerRight_Sol_2 {
    public static void main(String[] args) {
        int[] a = { 2, 5, 9, 3, 1, 12, 6, 8, 7 };

        int[] nse = nextsmallerElement(a);
        display(nse);
    }

    public static int[] nextsmallerElement(int[] a) {
        int[] nse = new int[a.length]; // next smaller element array

        // create a new stack
        Stack<Integer> st = new Stack<>();

        // 1. push the position of the first element in the stack
        st.push(0);

        // normal for loop
        for (int i = 0; i < a.length; i++) {
            while (st.size() > 0 && a[i] > a[st.peek()]) {
                int pos = st.peek();
                nse[pos] = a[i];
                st.pop();
            }
            st.push(i);
        }

        while (st.size() > 0) {
            int pos = st.peek();
            nse[pos] = -1;
            st.pop();
        }
        return nse;
    }

    public static void display(int[] a) {
        StringBuilder sb = new StringBuilder();

        for (int val : a) {
            sb.append(val + " ");
        }

        System.out.println(sb);
    }
}

/**
 * to do and practice : 5.05, 5.06, 5.07
 * as home work practice
 */