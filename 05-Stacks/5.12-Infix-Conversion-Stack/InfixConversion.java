
/**
 * 1. You are given an infix expression.
 * 2. You are required to convert it to POSTFIX and print it.
 * 3. You are reuired to convert it to PREFIX and print it.
 * 
 * E.g.,
 * expression = 2 + 6 * 4 / 8 - 3
 * >> Postfix = 264*8/+3-
 * >> Prefix = -+2/*6483
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

public class InfixConversion {
    public static void main(String[] args) {
        String expression = "2+6*4/8-3";

        // code
    }
}
