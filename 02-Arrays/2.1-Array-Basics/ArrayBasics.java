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
        System.out.println();

        // checking what happens with function calls
        swap(arr2, 0, 4);

        // check and print arr 1 first then arr2 again
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }

    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

/**
 * when an array is declared a variable of its name is created in STACK
 * with NULL as its default value
 * 
 * However, when the same array is initialized:
 * - in the STACK; the value null changes to the HEAP address
 * - in the HEAP; the full array elements is stored in the heap
 * 
 * Therefore, the array variable in the stack is simply pointing to the memory
 * address in the heap and all the elements are in the HEAP itself.
 */