public class Recursion2 {

    // Write a method to compute the sum of the integers up to a given number n
    public static int sumTillN(int n) {
        return n == 0 ? 0 : n + sumTillN(n - 1);
    }

    // Write a method to compute the sum of the first n Fibonacci numbers without using the nth Fibonacci number method
    public static int sumFibonacci(int n) {
        // Store the nth Fibonacci number in an array
        int[] fib = new int[n + 1];
        fib[0] = 0;
        fib[1] = 1;
        int sum = fib[0] + fib[1];
        for (int i = 2; i <= n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
            sum += fib[i];
        }

        return sum;
    }

    // If we want to use the nth Fibonacci number method, we can do it like this
    public static int nthFibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return nthFibonacci(n - 1) + nthFibonacci(n - 2);
    }

    public static int sumFibonacci2(int n) {
        if (n == 0) return 0;
        return nthFibonacci(n) + sumFibonacci2(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(sumTillN(5));
        System.out.println(sumFibonacci(5));
    }
}