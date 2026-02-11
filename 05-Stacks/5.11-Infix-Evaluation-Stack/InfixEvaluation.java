
/**
 * 1. You are given an infix expression.
 * 2. You are required to evaluate and print its value
 * 
 * E.g.,
 * expression = 2 + 6 * 4 / 8 - 3
 * >> answer = 2
 * 
 * Constraints:
 * > expression is always balanaced
 * > the only operators used are: +, -, *, /
 * > opening and closing brackets "( )" are can also be used to impact precedence of operation
 * > (1) '+' and '-' ahve equal precedence
 * > (2) '*' and '/' ahve equal precedence
 * > (2) > (1); 2 has higher precedence than 1
 * > in two operators of equal precendence; give preference to the one on the left
 * > all operands are / must be single digit numbers
 * 
*/

import java.util.Stack;

public class InfixEvaluation {
    public static void main(String[] args) {
        String expression = "2+6*4/8-3";

        // code
    }

    public static int precedence(char operator) {
        if (operator == '+') {
            return 1;
        } else if (operator == '-') {
            return 1;
        } else if (operator == '*') {
            return 2;
        } else {
            return 2;
        }
    }

    public static int operation(int v1, int v2, char operator) {
        if (operator == '+') {
            return v1 + v2;
        } else if (operator == '-') {
            return v1 - v2;
        } else if (operator == '*') {
            return v1 * v2;
        } else {
            return v1 / v2;
        }
    }
}
