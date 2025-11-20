
/**
 * one input type at a time
 * 
 * 1. INT as user input
 * 
 * 2. STRING as user input
 * 
 * use input as : 90 Shubham (number followed by name in 1 go before pressing enter)
*/

import java.util.Scanner;

public class SingleInput {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // 1. Integer as input
        int number = scan.nextInt();
        System.out.println("number inputted = " + number);

        System.out.println(); // to leave a blank line

        // 2. String
        String name = scan.nextLine();
        System.out.println("Hello !!" + name);

        scan.close(); // closing scanner is optional but it is a recommended good practice
    }
}
