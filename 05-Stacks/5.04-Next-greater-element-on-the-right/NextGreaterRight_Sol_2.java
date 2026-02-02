
/**
 * 1. You are given a number 'n'. representing the Size of array 'a'.
 * 2. You are given 'n' numbers. representing elements of array 'a'.
 * 3. You are required to find "next greater element on the right" for all
 * elements of array
 * 4. Input and output IS handled for you.
 * 
 * Hint :-
 * "Next greater element on the right" of an element 'x' is defined as the first
 * element to right of 'x' having value greater than x.
 * 
 * Note -> If an element does not have any element on it's right side greater
 * than it, consider '-1' as it's "next greater element on right"
 * 
 * E.g., a = [2 5 9 3 1 12 6 8 7]
 * >> Next greater for 2 is 5
 * >> Next greater for 5 is 9
 * >> Next greater for 9 is 12
 * >> Next greater for 3 is 12
 * >> Next greater for 1 is 12
 * >> Next greater for 12 is -1
 * >> Next greater for 6 is 8
 * >> Next greater for 8 ts -1
 * >> Next greater for 7 is -1
 * 
 * Solution :- iteration left to right
 * 
*/

import java.util.Stack;

public class NextGreaterRight_Sol_2 {
    public static void main(String[] args) {
        int[] a = { 2, 5, 9, 3, 1, 12, 6, 8, 7 };

        int[] nge = nextGreaterElement(a);
        display(nge);
    }

    public static int[] nextGreaterElement(int[] a) {
        int[] nge = new int[a.length]; // next greater element array

        // create a new stack
        Stack<Integer> st = new Stack<>();

        // 1. push the position of the first element in the stack
        st.push(0);

        // normal for loop
        for (int i = 0; i < a.length; i++) {
            while (st.size() > 0 && a[i] > a[st.peek()]) {
                int pos = st.peek();
                nge[pos] = a[i];
                st.pop();
            }
            st.push(i);
        }

        while (st.size() > 0) {
            int pos = st.peek();
            nge[pos] = -1;
            st.pop();
        }
        return nge;
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