/**
 * 1. Behaviour of "+", when adding strings
 */

public class AddingStrings {
    public static void main(String[] args) {

        // 1.
        String s1 = "Hello";
        String s2 = "World";
        String s3 = s1 + " " + s2;
        System.out.println(s3); // output = Hello World

        // 2.
        String s4 = "Tello";
        s4 += ' ';
        s4 += 'W';
        s4 += 'e';
        s4 += 'l';
        s4 += 'l';
        s4 += 55; // exception case - here 55 gets converted to String
        System.out.println(s4); // output = Tello Well55

        // 3. Exception cases
        System.out.println("Mello" + 10 + 20); // output = Mello1020
        System.out.println(10 + "Mello" + 20); // output = 10Mello20
        System.out.println(10 + 20 + "Mello"); // output = 30Mello

    }
}
