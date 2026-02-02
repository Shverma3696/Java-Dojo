
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
 * Solution :- iteration right to left (reverse)
*/

import java.util.Stack;

public class NextGreaterRight_Sol_1 {
    public static void main(String[] args) {
        int[] a = { 2, 5, 9, 3, 1, 12, 6, 8, 7 };

        int[] nge = nextGreaterElement(a);
        display(nge);
    }

    public static int[] nextGreaterElement(int[] a) {
        int[] nge = new int[a.length]; // next greater element array

        // create a new stack
        Stack<Integer> st = new Stack<>();

        // 1. push the last element in the stack
        st.push(a[a.length - 1]);

        // set the last element in the nge array to -1 to handle the last element
        nge[a.length - 1] = -1;

        // 2. reverse for loop from 2nd last digit
        for (int i = a.length - 2; i >= 0; i--) {
            // rule : pop - answer - push

            // 2.1. pop
            while (st.size() > 0 && a[i] >= st.peek()) {
                st.pop();
            }

            // 2.2. answer
            if (st.size() == 0) {
                nge[i] = -1;
            } else {
                nge[i] = st.peek();
            }

            st.push(a[i]);
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
