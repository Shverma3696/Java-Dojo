
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
        Stack<Integer> operands = new Stack<>();
        Stack<Character> operators = new Stack<>();

        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);

            if (ch == '(') {
                operators.push(ch);
            } else if (Character.isDigit(ch)) {
                operands.push(ch - '0'); // convert char to number
            } else if (ch == ')') {
                while (operators.peek() != '(') {
                    char operator = operators.pop();

                    // v2 comes out first because a-b != b-a, point to be extra careful
                    int v2 = operands.pop();
                    int v1 = operands.pop();

                    int opVal = operation(v1, v2, operator); // operation value
                    operands.push(opVal);
                }
                operators.pop();

            } else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {

                // ch is wanting higher priority operators to solve first
                while (operators.size() > 0 && operators.peek() != '('
                        && precedence(ch) <= precedence(operators.peek())) {
                    char operator = operators.pop();
                    int v2 = operands.pop();
                    int v1 = operands.pop();

                    int opVal = operation(v1, v2, operator); // operation value
                    operands.push(opVal);
                }
                // ch is pushing itself now
                operators.push(ch);
            }
        }

        while (operators.size() != 0) {
            char operator = operators.pop();
            int v2 = operands.pop();
            int v1 = operands.pop();

            int opVal = operation(v1, v2, operator); // operation value
            operands.push(opVal);
        }

        System.out.println("answer = " + operands.peek());

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
