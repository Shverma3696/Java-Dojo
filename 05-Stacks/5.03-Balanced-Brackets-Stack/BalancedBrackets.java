
/**
 * 1. You are given a string representing an expression.
 * 2. You are required to check if the expression is balanced i.e., closing brackets and opening brackets match up well.
 * 
 * E.g.,
 * [(a + b) + {(c + d) * (e/f)}] -> true
 * [(a + b) + {(c + d) * (e/f)]} -> false
 * [(a + b) + {(c + d) * (e/f)} -> false
 * ([(a + b) + {(c + d) * (e/f)}] -> false
 * 
*/

import java.util.Stack;

public class BalancedBrackets {
    public static void main(String[] args) {

        String str = "[(a + b) + {(c + d) * (e/f)}]"; // true
        // String str = "[(a + b) + {(c + d) * (e/f)]}"; // false
        // String str = "[(a + b) + {(c + d) * (e/f)}"; // false
        // String str = "([(a + b) + {(c + d) * (e/f)}]"; // true
        // String str = "[{[(a + b) * (e/f)}]"; //false
        // String str = "[(a + b))}]"; //false

        Stack<Character> stk = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == '(' || ch == '{' || ch == '[') {

            } else if (ch == ')') {

            } else if (ch == '}') {

            } else if (ch == ']') {

            }
            // else do nothing
        }

    }
}
