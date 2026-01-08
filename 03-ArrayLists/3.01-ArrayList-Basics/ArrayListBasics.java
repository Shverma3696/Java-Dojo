
/**
 * 1. Practicing basics of ArrayLists
 * - Declaring
 * - Initialising
 * - Printing
 * - get size()
 * 
 * Difference between Arrays and ArrayLists
 * -> Array = Immutable
 * -> ArrayList = Mutable / can change or modify
 * 
*/

import java.util.ArrayList;

public class ArrayListBasics {
    public static void main(String[] args) {

        // 1. Declaring and Initialising an ArrayList
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(list + " -> " + list.size()); // output : [] (meaning empty) -> 0 (size 0)
    }
}
