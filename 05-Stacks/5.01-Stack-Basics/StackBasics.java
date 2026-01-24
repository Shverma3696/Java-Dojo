import java.util.Stack;

/**
 * Stack Basics
 * - Declaring
 * - Initialising
 * - taking input from console
 * 
 * 
 * Similar methods but different name:
 * add -> push()
 * get -> peek() ; lets the user check the top / latest element
 * remove -> pop()
 * size()
 */

public class StackBasics {
    public static void main(String[] args) {

        // 1. Declaring and initialising Stacks
        Stack<Integer> stk = new Stack<>();

        // 2. Basic methods and usage

        // 2.1. push() method
        stk.push(10);
        stk.push(20);
        stk.push(30);
        stk.push(40);
        System.out.println(stk);

        // 2.2. peek() and size()
        System.out.println("Top element => " + stk.peek() + " ; Size of Stack => " + stk.size());
    }
}
