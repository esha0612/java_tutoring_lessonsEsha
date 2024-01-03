public class Recursion1 {
    // Simplest form of recursion, which is addition
    // Recursion needs a base case, which is usually an end scenario where the recursion stops
    // It then needs a recursive case, which is the case where the function calls itself
    // This is based on the theory of mathematical induction. Keep in mind the recursion should always reach the base case
    // Otherwise, it will keep calling itself infinitely, and the program will crash or run out of memory

    // First, let us add all the numbers from 1 to n
    static int addN (int n) {
        // Base case
        if (n == 1) {
            return 1;
        }
        return n + addN(n - 1);
    }

    // Now, let us add all the numbers from a to b
    static int addAB (int a, int b) {
        // Base case
        if (a == b) {
            return a;
        }
        return a + addAB(a + 1, b);
    }

    // Let's do the same in reverse
    static int addABReverse (int a, int b) {
        // Base case
        if (a == b) {
            return a;
        }
        return b + addABReverse(a, b - 1);
    }

    // Now, let us find the factorial of a number
    static int factorial (int n) {
        // Base case
        if (n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    // Driver code
    public static void main (String[] args) {
        // Adding all the numbers from 1 to 10
        System.out.println("Adding all the numbers from 1 to 10: " + addN(10));

        // Adding all the numbers from 5 to 10
        System.out.println("Adding all the numbers from 5 to 10: " + addAB(5, 10));

        // Adding all the numbers from 10 to 5
        System.out.println("Adding all the numbers from 10 to 5: " + addABReverse(5, 10));

        // Finding the factorial of 5
        System.out.println("Factorial of 5: " + factorial(5));
    }
}
