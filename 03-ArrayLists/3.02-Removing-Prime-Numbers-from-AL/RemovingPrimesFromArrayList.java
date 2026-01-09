
/**
 * 1. You are given an ArrayList of positive integers.
 * 2. You have to remove prime numbers from the given ArrayList and return the updated ArrayList.
 * 
 * Note:- The order of the elements should remain same.
 * 
 * Hint:- Always use reverse looping when removing elements from ArrayLists 
 * because when any element is removed, 
 * the index's of remaining elements also gets updated or modified
 * 
*/

import java.util.ArrayList;

public class RemovingPrimesFromArrayList {
    public static void main(String[] args) {

        // given
        // new way of Declaring and Initialising an ArrayList
        ArrayList<Integer> al = new ArrayList<>() {
            {
                add(1);
                add(2);
                add(3);
                add(4);
                add(5);
                add(6);
                add(7);
                add(8);
                add(9);
                add(10);
            }
        };

        // method to remove prime number elements
        removePrimes(al);

        // print updated arraylist as output
        System.out.println(al);
    }

    public static void removePrimes(ArrayList<Integer> al) {
        for (int i = al.size() - 1; i >= 0; i--) {
            int val = al.get(i);
            if (isPrime(val) == true) {
                al.remove(i);
            }
        }
    }

    public static boolean isPrime(int val) {
        for (int i = 2; i * i <= val; i++) {
            if (val % i == 0) {
                return false;
            }
        }
        return true;
    }
}
