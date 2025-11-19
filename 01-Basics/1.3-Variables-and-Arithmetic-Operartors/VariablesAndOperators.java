public class VariablesAndOperators {
    public static void main(String[] args) {

        int x = 15; // integer
        int y = 10; // integer

        int sum = x + y; // calculate sum and it is also interger

        System.out.println("sum = " + sum);

        // multiplication
        int product = x * y;
        System.out.println("Product = " + product);

        // division (quotient and remainder)
        int var1 = x / y;
        int var2 = y / x;
        int var3 = x % y;
        System.out.println(var1);
        System.out.println(var2);
        System.out.println(var3);

        // exp calclations
        int exp = (x * y) / (x + y);
        System.out.println(exp);
    }
}
