/**
 * 1. You are given a number 'n', representing the size of array 'a'.
 * 2. You are given 'n' numbers, representing elements of array 'a'.
 * 3. You are required to print all subsets of the given array 'a'.
 * 4. Constraints : 1 >= n <= 10
 * 
 * Hint: total number of subsets = 2 power length of array
 * E.g., [a,b,c] => total subsets = 2^3 = 8
 * 
 */

public class SubsetsOfAnArray {
    public static void main(String[] args) {

        // given
        int[] a = { 10, 20, 30 };

        printAllSubsets(a);
    }

    public static void printAllSubsets(int[] a) {

        // 1. find total number of subsets
        int totalSubsets = (int) Math.pow(2, a.length);

        for (int i = 0; i < totalSubsets; i++) { // loop to iterate and print all subsets

            String subset = ""; // string to catch and print subsets 1 by 1

            int temp = i; // to use and modify i

            // the number of bits of binary number will be equal to array.lenght
            // therefore loop of j ranges from 0 - a.length
            for (int j = a.length - 1; j >= 0; j--) { // reverse loop to print in correct order ; binary

                // converting to binary digit
                int rem = temp % 2;
                temp = temp / 2;

                // catching the element if bit = 1 & forming subset
                if (rem == 0) {
                    subset = "-\t" + subset;
                } else {
                    subset = a[j] + "\t" + subset;
                }
            }

            // print subset
            System.out.println(subset);
        }
    }

}