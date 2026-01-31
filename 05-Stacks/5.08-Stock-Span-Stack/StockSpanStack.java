
/**
 * 1. You are given a number 'n', representing the size of array 'a'.
 * 2. You are given 'n' numbers, representing the prices of a share on 'n' days.
 * 3. You are required to find the stock span for 'n' days.
 * 4. Stock span is defied as the of days passed the current day and the first
 * day before today when price was higher than today.
 * 
 * E.g., for array [2 5 9 3 1 12 6 8 7]
 * span for 2 is 1
 * span for S is 2
 * span tor 9 is 3
 * span for 3 is 1
 * span for 1 is 1
 * span for 12 is 6
 * span for 6 is 1
 * span for 8 is 2
 * span for 7 is 1
 * 
 */

// import java.util.Stack;

public class StockSpanStack {
    public static void main(String[] args) {

    }

    public static void dsplay(int[] a) {
        StringBuilder sb = new StringBuilder();

        for (int val : a) {
            sb.append(val + "\n");
        }
        System.out.println();
    }
}
