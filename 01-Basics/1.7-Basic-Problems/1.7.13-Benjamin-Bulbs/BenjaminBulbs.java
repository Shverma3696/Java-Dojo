/**
 * 1. You are given 'n' number of bulbs. They are all switched off.
 * 
 * 2. A weird fluctuation in voltage hits the circuit 'n' times.
 * 
 * 2.1. In the 1st fluctuation, all bulbs are toggled.
 * 2.2. In the 2nd fluctuation, every 2nd bulb is toggled.
 * 2.3. In the 3rd fluctuation, every 3rd bulb is and so on.
 * 
 * 3. You've to find which bulbs will be switched on after 'n' fluctuations
 * 
 * 4. Take as input a number 'n'. Representing the number of bulbs.
 * 5. Print all the bulbs that Will be on after the nth fluctuation in voltage.
 */

public class BenjaminBulbs {
    public static void main(String[] args) {

        int n = 20; // input

        for (int i = 1; i * i <= n; i++) {
            System.out.println(i * i);
        }

    }
}

/**
 * n = 10
 * bulbs = b1 b2 b3 b4 b5 b6 b7 b8 b9 b10
 * togl1 = on on on on on on on on on on
 * togl2 = on -- on -- on -- on -- on --
 * togl3 = on -- -- -- on on on -- -- --
 * togl4 = on -- -- on on on on on -- --
 * togl5 = on -- -- on -- on on on -- on
 * togl6 = on -- -- on -- -- on on -- on
 * togl7 = on -- -- on -- -- -- on -- on
 * togl8 = on -- -- on -- -- -- -- -- on
 * togl9 = on -- -- on -- -- -- -- on on
 * tog10 = on -- -- on -- -- -- -- on --
 * 
 * =>> this implies only the perfect square numbers stays ON
 */
