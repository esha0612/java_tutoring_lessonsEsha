// The first program to demonstrate the use of an iterative method and its recursive equivalent is factorial.
// The factorial of a number is the product of all the integers from 1 to that number.
// For example, the factorial of 5 is 1 * 2 * 3 * 4 * 5 or 120. The factorial of 0 is defined to be 1.
// The formula for factorial can be written as:
// n! = n * (n - 1) * (n - 2) * ... * 1
// Recursively, this can be expressed as:
// n! = n * (n - 1)!
// For the recursive definition to work, the base case must be defined as 0! = 1.


public class Factorial {

    // Recursive method
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n-1);
    }

    // Iterative method
    public static int factorialIterative(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(factorial(5));
        System.out.println(factorialIterative(5));
    }
}