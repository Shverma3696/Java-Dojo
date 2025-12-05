/**
 * Please note: this is made up question just for improve problem solving
 * there is no such thing as an Inverse number in Mathematical terms
 * 
 * 1. You are given a number following certain constraints
 * 
 * 2. The key constraint is, if the number is 5 digits long. It will contain all
 * the digits trom 1 to 5 without missing any and without repeating any
 * E.g., 23451 is a 5 digit long number containing all digits from 1 to 5
 * without missing and repeating any digit from 1 to 5
 * 
 * Take a look at few other valid numbers - 624135, 81456273 etc.
 * Here are a few invalid numbers 139, 7421357 etc.
 * 
 * 3. The inverse of a number is defined as the number created by interchanging
 * the face value and index of digits of number
 * E.g., for 426135 (reading from right to left,
 * >> 5 is in place 1,
 * >> 3 is in place 2,
 * >> 1 is in place 3,
 * >> 6 is in place 4,
 * >> 2 is in place 5, and
 * >> 4 is in place 6).
 * >>> the inverse will be 416253
 * 
 * More examples : inverse of 2134 ->> 1243 and inverse of 24153 ->> 24153
 * 
 * 4. Take as input number 'n', assume that the number will follow constraints
 * and print it's inverse
 * 
 * Sumeet sir's solutions at the last
 */

public class InverseNumber {
    public static void main(String[] args) {

        // int n = 2134; // inverse = 1243
        int n = 426135; // inverse = 416253

        int temp = n;
        int count = 0; // number of digits

        while (temp != 0) {
            temp = temp / 10;
            count++;
        }

        int inverseNumber = 0;
        int digit, mult; // multiplier to create the inverse number

        for (int pos = 1; pos <= count; pos++) { // position of digits
            digit = n % 10;
            mult = (int) Math.pow(10, digit - 1);

            inverseNumber = inverseNumber + (pos * mult);

            n = n / 10;
        }

        System.out.println(inverseNumber);
    }
}

/**
 * rough work:
 * 
 * 2134 % 10 = 4
 * 
 * number :
 * mult = math.pow(10, 4-1)
 * 
 * number = number + (i * mult)
 */

/*
 * Sumeet Sir's Solution:
 * 
 * >> int n = 2143;
 * 
 * >> int inv = 0; // inverted number to be created
 * >> int op = 1; // orignal place
 * 
 * >> while(n != 0) {
 * 
 * ---- int od = n % 10; // orignal digit
 * ---- int id = op; // inverted digit
 * ---- int ip = od; //inverted place
 * 
 * ---- // make change to inv using ip and id
 * ---- inv = inv + (id * (int)Math.pow(10, ip-1));
 * 
 * ---- n = n / 10; // reduce the number
 * ----op++;
 * }
 * 
 * system. out. println(inv);l
 * 
 */
