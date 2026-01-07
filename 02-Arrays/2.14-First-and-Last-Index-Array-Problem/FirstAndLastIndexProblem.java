/**
 * 1. You are given a number 'n', representing the size of array 'a'.
 * 2. You are given 'n' numbers, representing elements of array 'a'.
 * 3. You are given another number 'd'/data/element.
 * 4. You are required to find the first and last index of 'd' in the array 'a'.
 * 5. Asssumption - Array is sorted, and may contain duplicaies
 * 
 * Exp:
 * >> a = {10, 20, 20, 20, 40, 50}
 * >> data = 20
 * 
 * expected output: First index = 1, Last index = 3
 * 
 */

public class FirstAndLastIndexProblem {
    public static void main(String[] args) {

        // // given
        // int[] a = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };

        // // to find
        // int data = 72;

        // testing
        int[] a = { 10, 20, 20, 20, 40, 50 };
        int data = 20;

        // Using Binary Search Algorithm
        int low = 0; // this will become ceil when the loop ends
        int high = a.length - 1; // this will become floor when the loop ends

        // declare first index; set it in the loop
        int firstIndex = -1;

        // first index first
        while (low <= high) {
            int mid = (low + high) / 2;
            if (data > a[mid]) {
                low = mid + 1;
            } else if (data < a[mid]) {
                high = mid - 1;
            } else {
                firstIndex = mid;
                high = mid - 1;
            }
        }
        System.out.print("First Index = " + firstIndex + ", ");

        // declare last index; set it in the loop
        int lastIndex = -1;

        // first index first
        while (low <= high) {
            int mid = (low + high) / 2;
            if (data > a[mid]) {
                low = mid + 1;
            } else if (data < a[mid]) {
                high = mid - 1;
            } else {
                lastIndex = mid;
                low = mid + 1;
            }
        }
        System.out.print("Last Index = " + lastIndex + ", ");

        // System.out.println("Ceil = " + ceil + ", " + "Floor = " + floor);
    }
}