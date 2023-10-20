// Next in line for iterative vs recursive is the Fibonacci sequence.
// The Fibonacci sequence is a series of numbers where a number is the sum of the two numbers before it.
// Starting with 0 and 1, the sequence goes 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, etc.
// Recursively, this can be expressed as:
// fib(n) = fib(n-1) + fib(n-2)
// For the recursive definition to work, the base case must be defined as fib(0) = 0 and fib(1) = 1.
// This is an example that is much easier to understand recursively than iteratively.
// But here, the iterative method is much more efficient.
// This is because the recursive method will calculate the same values over and over again.
// This is called overlapping subproblems.
// The iterative method can be made to only calculate each value once by storing the previous two values in variables.
// We will also tackle the problem of calculating the nth Fibonacci number in a more general way.
// Further, we will tackle the problem of calculating the sum of the first n Fibonacci numbers.
// Here too, we have overlapping subproblems, and we will use dynamic programming to solve this problem efficiently.

public class Fibonacci {

    // Recursive method to calculate nth Fibonacci number
    public static int fib(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return fib(n-1) + fib(n-2);
    }

    // Iterative method to calculate nth Fibonacci number
    public static int fibIterative(int n) {
        int prev1 = 0;
        int prev2 = 1;
        int result = 0;
        for (int i = 2; i <= n; i++) {
            result = prev1 + prev2;
            prev1 = prev2;
            prev2 = result;
        }
        return result;
    }

    // Mathematical method to calculate nth Fibonacci number
    public static int fibMath(int n) {
        double phi = (1 + Math.sqrt(5)) / 2;
        return (int) ((Math.pow(phi, n) - Math.pow(-phi, -n)) / Math.sqrt(5));
    }

    // Recursive method to calculate sum of first n Fibonacci numbers
    public static int fibSum(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return fibSum(n-1) + fib(n);
    }

    // Iterative method to calculate sum of first n Fibonacci numbers
    public static int fibSumIterative(int n) {
        int prev1 = 0;
        int prev2 = 1;
        int result = 1;
        for (int i = 2; i <= n; i++) {
            int nth = prev1 + prev2;
            result += nth;
            prev1 = prev2;
            prev2 = nth;
        }
        return result;
    }

    // Mathematical method to calculate sum of first n Fibonacci numbers using Binet's formula
    public static int fibSumMath(int n) {
        double phi = (1 + Math.sqrt(5)) / 2;
        return (int) ((Math.pow(phi, n+2) - Math.pow(-phi, -n-2)) / Math.sqrt(5) - 1);
    }

    // Mathematical method to calculate sum of first n Fibonacci numbers using series difference
    // We observe that:
    // fib(n) = fib(n+2) - fib(n+1)
    // fib(n-1) = fib(n+1) - fib(n)
    // fib(n-2) = fib(n) - fib(n-1)
    // fib(n-3) = fib(n-1) - fib(n-2)
    // ..
    // fib(0) = fib(2) - fib(1)
    // Adding all these equations, we get:
    // fib(n) + fib(n-1) + fib(n-2) + fib(n-3) + ... + fib(0) = fib(n+2) - fib(1)
    // fibSum(n) = fib(n+2) - 1
    // We can use this to calculate the sum of the first n Fibonacci numbers.
    public static int fibSumMath2(int n) {
        return fibMath(n+2) - 1;
    }

    // Main method
    public static void main(String[] args) {
        System.out.println(fib(5));
        System.out.println(fibIterative(5));
        System.out.println(fibMath(5));
        System.out.println(fibSum(5));
        System.out.println(fibSumIterative(5));
        System.out.println(fibSumMath(5));
        System.out.println(fibSumMath2(5));
    }
}
