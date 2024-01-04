public class Recursion1 {
    
    // We move on to slightly more complex recursion problems

    // First, we find the nth fibonacci number
    // The fibonacci sequence is 0, 1, 1, 2, 3, 5, 8, 13, 21, ...
    // The nth fibonacci number is the sum of the previous two fibonacci numbers
    // So, the 5th fibonacci number is 3 + 2 = 5
    // First, we identify the base case
    // The base case is when n = 0 or n = 1
    static int nthFibonacci (int n) {
        // Let's say 0 is the 0th fibonacci number
        if (n == 0) {
            return 0;
        }
        // Let's say 1 is the 1st fibonacci number
        if (n == 1) {
            return 1;
        }
        // Now, we can return the sum of the previous two fibonacci numbers
        return nthFibonacci(n - 1) + nthFibonacci(n - 2);
    }

    // We end up calculating the same fibonacci numbers multiple times
    // This is inefficient, and we can use memoization to make it more efficient
    // Memoization is storing the results of expensive function calls and returning the cached result when the same inputs occur again
    // We can use an array to store the results of the fibonacci numbers
    // This is called dynamic programming

    // First, we create an array to store the results
    static int[] memo = new int[100];
   // We initialize the first two fibonacci numbers
    static {
        memo[0] = 0;
        memo[1] = 1;
    }

    // Now, we find the nth fibonacci number
    static int nthFibonacciMemoization (int n) {
        // First, we check if the result is already stored in the array
        if (memo[n] != 0 || n == 0) {
            return memo[n];
        }
        // If not, we calculate the result and store it in the array
        memo[n] = nthFibonacciMemoization(n - 1) + nthFibonacciMemoization(n - 2);
        return memo[n];
    }

    // Now, a slightly more complex problem
    // We find the sum of n fibonacci numbers
    // The sum of the first 5 fibonacci numbers is 0 + 1 + 1 + 2 + 3 = 7
    // Just recursion is fine for now, we will use memoization later
    static int sumNFibonacci (int n) {
        // Base case
        if (n == 0) {
            return 0;
        }
        // Recursive case
        return nthFibonacciMemoization(n) + sumNFibonacci(n - 1);
    }

    // Now, we find the sum of the digits of a number
    // The sum of the digits of 123 is 1 + 2 + 3 = 6
    static int sumDigits (int n) {
        // Base case
        if (n == 0) {
            return 0;
        }
        // Recursive case
        return n % 10 + sumDigits(n / 10);
    }

    // Now, we find the number of digits in a number
    // The number of digits in 123 is 3
    static int numDigits (int n) {
        // Base case
        if (n == 0) {
            return 0;
        }
        return 1 + numDigits(n / 10);
        // The problem here is with n = 0, which will return 0
    }

    // Now, we find if a String is a palindrome using recursion
    // A palindrome is a word that is the same when read forwards and backwards
    // Examples: racecar, madam, malayalam, ...
    static boolean isPalindrome (String s) {
        if (s.length() == 0 || s.length() == 1) {
            return true;
        }
        if (s.charAt(0) == s.charAt(s.length() - 1)) {
            return isPalindrome(s.substring(1, s.length() - 1));
        }
        return false;
    }

    // Driver code
    public static void main (String[] args) {
        // Finding the 5th fibonacci number
        System.out.println("5th fibonacci number: " + nthFibonacci(5));

        // Finding the 5th fibonacci number using memoization
        System.out.println("5th fibonacci number using memoization: " + nthFibonacciMemoization(5));

        // Finding the sum of the first 5 fibonacci numbers
        System.out.println("Sum of the first 5 fibonacci numbers: " + sumNFibonacci(5));

        // Finding the sum of the digits of 123
        System.out.println("Sum of the digits of 123: " + sumDigits(123));

        // Finding the number of digits in a number n (prompt the user for n)
        System.out.println("Enter a number: ");
        int n = Integer.parseInt(System.console().readLine());
        System.out.println("Number of digits in " + n + ": " + (n == 0 ? 1 : numDigits(n)));

        // Finding if a String is a palindrome
        System.out.println("Enter a String: ");
        String s = System.console().readLine();
        System.out.println(s + " is a palindrome: " + isPalindrome(s));
    }
}
