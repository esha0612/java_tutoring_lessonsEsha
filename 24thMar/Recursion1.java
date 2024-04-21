public class Recursion1 {
    // Write a method to compute the sum of integers up to a given number n
    public static int sumTillN(int n) {
        // TODO: Write your code here
        return (n == 0) ? 0 : n + sumTillN(n - 1);
    }

    // Write a method to compute the nth Fibonacci number
    public static int nthFibonacci(int n) {
        // TODO: Write your code here
        return (n <= 1) ? n : nthFibonacci(n - 1) + nthFibonacci(n - 2);
    }

    // Write a method to compute the sum of the first n Fibonacci numbers using the nth Fibonacci number method
    public static int sumFibonacci(int n) {
        // TODO: Write your code here
        return (n == 0) ? 0 : nthFibonacci(n) + sumFibonacci(n - 1);
    }

    // Write a method to compute the sum of a geometric progression with first term a, common ratio r and n terms as parameters
    public static int sumGeometricProgression(int a, int r, int n) {
        // TODO: Write your code here
        return (n == 0) ? 0 : a * (int) Math.pow(r, n-1) + sumGeometricProgression(a, r, n - 1);   
    }

    public static void main (String[] args) {
        System.out.println(sumTillN(5)); // 15
        System.out.println(nthFibonacci(5)); // 5
        System.out.println(sumFibonacci(5)); // 12
        System.out.println(sumGeometricProgression(1, 2, 5)); // 31
    }
}