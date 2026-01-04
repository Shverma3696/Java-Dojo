/**
 * 1. You are given a number 'n', representing the size of array 'a'.
 * 2. You are given 'n' numbers, representing elements of array 'a'.
 * 3. You are required to print all subarrays of the given array 'a'.
 * 4. Constraints : 1 >= n <= 10
 * 
 */

public class SubarraysOfAnArray {
    public static void main(String[] args) {

        // given
        int[] a = { 10, 20, 30 };

        printAllSubarrays(a);
    }

    public static void printAllSubarrays(int[] a) {

        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < a.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(a[k] + "\s");
                }
                System.out.println();
            }
        }
    }
}