
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

        // 2. Adding elements to the ArrayList
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list + " -> " + list.size()); // output : [10, 20, 30] -> 3

        // 3. add or insert an element in between at some index
        list.add(1, 1000); // or
        System.out.println(list + " -> " + list.size()); // output : [10, 1000, 20, 30] -> 4

    }
}
