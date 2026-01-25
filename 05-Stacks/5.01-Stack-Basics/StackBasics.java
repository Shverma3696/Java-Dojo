
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
 * remove -> pop() ; lets the user remove the top / latest element
 * size()
 * 
*/

import java.util.Stack;

public class StackBasics {
    public static void main(String[] args) {

        // 1. Declaring and initialising Stacks
        Stack<Integer> stk = new Stack<>();

        // 2. Basic methods and usage

        // 2.1. push() method
        stk.push(10);
        System.out.println(stk);

        stk.push(20);
        System.out.println(stk);

        stk.push(30);
        System.out.println(stk);

        stk.push(40);
        System.out.println(stk);

        // 2.2. peek() and size()
        System.out.println(stk + " -> Top element : " + stk.peek() + " ; Size of Stack => " + stk.size());

        // 2.3. pop()
        stk.pop(); // pop 1st time
        System.out.println(stk + " -> Top element : " + stk.peek() + " ; Size of Stack => " + stk.size());

        stk.pop(); // pop 2nd time
        System.out.println(stk + " -> Top element : " + stk.peek() + " ; Size of Stack => " + stk.size());

        stk.pop(); // pop again
        System.out.println(stk + " -> Top element : " + stk.peek() + " ; Size of Stack => " + stk.size());

        // last pop will give error on using peek() because of empty stack
        stk.pop(); // pop again
        // stk.peek();
        System.out.println(stk + " ; Size of Stack => " + stk.size());

    }
}
