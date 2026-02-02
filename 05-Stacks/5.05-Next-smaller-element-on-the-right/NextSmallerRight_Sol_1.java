
/**
 * 1. You are given a number 'n'. representing the Size of array 'a'.
 * 2. You are given 'n' numbers. representing elements of array 'a'.
 * 3. You are required to find "next smaller element on the right" for all
 * elements of array
 * 4. Input and output is handled for you.
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
 * Solution :- iteration right to left (reverse)
 * 
*/

import java.util.Stack;

public class NextSmallerRight_Sol_1 {
    public static void main(String[] args) {
        int[] a = { 2, 5, 9, 3, 1, 12, 6, 8, 7 };

        int[] nse = nextsmallerElement(a);
        display(nse);
    }

    public static int[] nextsmallerElement(int[] a) {
        int[] nse = new int[a.length]; // next smaller element array

        // create a new stack
        Stack<Integer> st = new Stack<>();

        // 1. push the last element in the stack
        st.push(a[a.length - 1]);

        // set the last element in the nse array to -1 to handle the last element
        nse[a.length - 1] = -1;

        // 2. reverse for loop from 2nd last digit
        for (int i = a.length - 2; i >= 0; i--) {
            // rule : pop - answer - push

            // 2.1. pop
            while (st.size() > 0 && a[i] <= st.peek()) {
                st.pop();
            }

            // 2.2. answer
            if (st.size() == 0) {
                nse[i] = -1;
            } else {
                nse[i] = st.peek();
            }

            st.push(a[i]);
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