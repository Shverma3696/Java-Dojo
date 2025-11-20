/**
 * You are given as input marks of a student
 * Display an appropriate message based on the following rules
 * 
 * >> for marks above 90. print excellent
 * >> for marks above 80 and less than equal to 90. print good
 * >> for marks above 70 and less than equal to 80. print fair
 * >> for marks above 60 and less than equal to 70. print meets expectations
 * >> for marks less than equal to 60. print below par
 * 
 */

public class GradingSystem {
    public static void main(String[] args) {
        int marks = 91;

        if (marks > 90) {
            System.out.println("Excellent !!");
        } else if (marks > 80) {
            System.out.println("Good");
        } else if (marks > 70) {
            System.out.println("Fair");
        } else if (marks > 60) {
            System.out.println("Meets expectation");
        } else {
            System.out.println("Below par.");
        }
    }

}
