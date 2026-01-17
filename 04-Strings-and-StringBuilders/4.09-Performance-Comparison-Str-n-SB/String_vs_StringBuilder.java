/**
 * Comparing performance for large operations in strings and StringBuilder
 * performance metric = execution time
 * 
 * Note:-
 * -> String take O(n^2) time because String are immutable so everytime a char
 * is added to the same string a copy of that string is generated/created first
 * and then the new char is added to that
 * 
 * vs
 * 
 * -> StringBuilder takes only O(n) time because it is a mutable class, it
 * simply adds the new char in the same string
 * 
 */

public class String_vs_StringBuilder {
    public static void main(String[] args) {

        // given a large integer

        // int n = 1000000;
        // result = no answer (taking too much time) (string) vs less than 57ms
        // (StringBuilder)

        int n = 100000;
        // result = approx 3500ms (string) vs less than 50ms (StringBuilder)

        // 1. String
        @SuppressWarnings("unused")
        String str = "";
        long startTime1 = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            str += i;
        }
        long endTime1 = System.currentTimeMillis();

        long durationString = endTime1 - startTime1;
        System.out.println("Execution time for String = " + durationString);

        // 2. StringBuilder
        StringBuilder sb = new StringBuilder();
        long startTime2 = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            sb.append(i);
        }
        long endTime2 = System.currentTimeMillis();

        long durationStringBuilder = endTime2 - startTime2;
        System.out.println("Execution time for StringBuilder = " + durationStringBuilder);
    }
}
