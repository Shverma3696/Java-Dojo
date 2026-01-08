
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

        // 4. Extract / Get element from ArrayList
        int val = list.get(1);
        System.out.println(val); // output : 1000

        // 5. Set / change element at some index
        list.set(1, 2000);
        System.out.println(list + " -> " + list.size()); // output : [10, 2000, 20, 30] -> 4

        // 6. Removing an element from ArrayList
        list.remove(1);
        System.out.println(list + " -> " + list.size()); // output : [10, 20, 30] -> 3

        // 7. Similarly we can create ALs of different types like String, Long, Double,
        // etc
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Hello");
        list2.add("Tello");
        list2.add("Cello");
        System.out.println(list2 + " -> " + list2.size()); // output : [Hello, Tello, Cello] -> 3

        // 8. Looping through elements of AL
        // 8.1. Standard way
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        // 8.2. Better way
        for (int data : list) {
            System.out.println(data);
        }

    }
}
