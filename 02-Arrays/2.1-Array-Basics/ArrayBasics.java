/**
 * 1. Declaring and Initializing Arrays
 * 
 */

public class ArrayBasics {
    public static void main(String[] args) {

        // 1. 2 lines approach
        // declaring
        // int[] arr;

        // initializing
        // arr = new int[5];

        // 2. 1 line approach
        int[] arr = new int[5];
        arr[0] = 51;
        arr[1] = 45;
        arr[2] = 80;
        arr[3] = 75;
        arr[4] = 65;

        // get array of length using arr.length
        // System.out.println(arr.length);

        // printing array
        // wrong approach
        // System.out.println(arr);

        // correct approach
        // for (int i = 0; i < arr.length; i++) {
        // System.out.println(arr[i]);
        // }

        // what happens when copying arrays or its values
        int[] arr2 = arr;

        arr2[3] = 1000;

        // check and print arr 1 first then arr2
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
    }
}
