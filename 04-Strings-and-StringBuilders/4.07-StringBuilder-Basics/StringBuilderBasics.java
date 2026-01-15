/**
 * StringBuilder Basics
 * - Declaring
 * - Initialising
 * - taking input from console
 * - length()
 * - charAt()
 * - setCharAt()
 * - insert()
 * - append()
 * - substring
 * 
 * Importnant Note:-
 * >> StringBuilder class is mutable and provide built-in methods like insert()
 * and setCharAt()
 * >> Performance is better compared to strings (see problem 4.08)
 * 
 */

public class StringBuilderBasics {
    public static void main(String[] args) {

        // 1. Declaring and initialising
        StringBuilder sb = new StringBuilder("Hello-World");
        System.out.println(sb);

        // 2. Taking input from console is similar to Strings

        // 3. Length() of sb
        int lengthOfStringBuilder = sb.length();
        System.out.println("Length of SB = " + lengthOfStringBuilder);

        // 4. charAt() method
        char ch = sb.charAt(0);
        System.out.println("Char at given index = " + ch);

        // 5. setCharAt() method : changes the instance/character at given index
        sb.setCharAt(0, 'C');
        System.out.println("1. Modified String (setCharAt) = " + sb);

        // 6. Insert() method - inserts the char at the given index and shift/changes
        // the index of the following chars of string
        sb.insert(2, 'y');
        System.out.println("2. Modified String (insert) = " + sb);

        // 7. remove or delete chars
        // 7.1. method 1 -> deleteCharAt(<index>); deletes char at given index
        sb.deleteCharAt(2);
        System.out.println("3. Modified String (deleteCharAt) = " + sb);

        // 7.2. method 2 -> delete(<start-index>, <end-index>); end-index is exclusive;
        // deletes the substring between the given indexes
        // treat end index as [end-1]
        sb.delete(5, 12);
        System.out.println("4. Modified String (delete-substring-startIdx-endIdx) = " + sb);

        // 8. append method
        sb.append('?');
        System.out.println("char appended = " + sb);

        // 9. Substring in stringbuilder
        String ss = sb.substring(3, 5);
        System.out.println("substring = " + ss);

    }
}
