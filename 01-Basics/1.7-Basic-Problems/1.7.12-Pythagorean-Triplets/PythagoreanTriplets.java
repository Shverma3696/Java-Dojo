/**
 * 1. You are required to check if a grven set Of numbers is a valid pythagorean
 * triplet
 * 2. Take as input three numbers 'a', 'b' and 'c'.
 * 3. Print true if they can form a pythagorean triplet and false otherwise
 * 
 */

public class PythagoreanTriplets {
    public static void main(String[] args) {

        int a = 5, b = 3, c = 4;

        if (a > b && a > c) {
            if ((a * a) == (b * b) + (c * c)) {
                System.out.println("True");
            }
        } else if (b > a && b > c) {
            if ((b * b) == (a * a) + (c * c)) {
                System.out.println("True");
            }
        } else if (c > a && c > b) {
            if ((c * c) == (a * a) + (b * b)) {
                System.out.println("True");
            }
        } else {
            System.out.println("False");
        }

    }
}

/**
 * Sumeet Sir's Solution:
 * 
 * int a = 5, b = 3, c = 4; // inputs
 * 
 * int max = a; // assume
 * if(b >= max){
 * max = b;
 * }
 * if(c >= max){
 * max = c;
 * }
 * 
 * if(max == a){
 * boolean flag = ((a*a) == (b*b + c*c));
 * System.out.println(flag);
 * 
 * } else if (max == b){
 * boolean flag = ((b*b) == (a*a + c*c));
 * System.out.println(flag);
 * 
 * } else {
 * boolean flag = ((c*c) == (a*a + b*b));
 * System.out.println(flag);
 * }
 * 
 */
