
/**
 * Try and print the integer and string taken from the user input in 1 line.
 * 
 * // in previous Java version there used to be an error parsing an integer and string together
 * // so to resolve that users had to use 
 * 
 * >> int number = Integer.parseInt(scan.nextInt());
 * 
 * However, below code is working fine in Java 21, so no need of above way of parsing integer
*/

import java.util.Scanner;

public class MultipleInputs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number = scan.nextInt(); // this does not give a line break at the end
        String name = scan.nextLine(); // this gives line break at the end

        System.out.println("Hello !!" + name + ". Your number = " + number);

        scan.close();
    }
}
