/**
 * 1. You are given a number 'n', representing the size of array 'a'.
 * 2. You are given 'n' numbers, representing elements of array 'a'.
 * 3. You are given another number 'd'.
 * 4. You are required to find the ceil and floor of 'd' in the array 'a'.
 * 5. Asssumption - Array is sorted
 * 
 * Exp:
 * ->> Ceil is defined as value in array which is just greater than 'd'. If an
 * element equal to 'd' exists, then that will be considered as ceil.
 * 
 * ->> Floor is defined as value in array which is just lesser than d. If an
 * element equal to 'd' extsts, then that will be considered as floor.
 * 
 */

public class CeilAndFloor {
    public static void main(String[] args) {

        // given
        int[] a = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };

        // to find
        int data = 52;

        // Using Binary Search Algorithm
        int low = 0;
        int high = a.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (data > a[mid]) {
                low = mid + 1;
            } else if (data < a[mid]) {
                high = mid - 1;
            } else {
                System.out.println("The data is present at the following index -> " + mid);
                return;
            }
        }

        System.out.println(low + " " + high);
        System.out.println("Data not found.");
    }
}