public class Recursion3 {
    int num_fibonacci;
    int[] coefficients;

    public Recursion3(int n) {
        num_fibonacci = n;
        coefficients = new int[n + 1];
    }

    public void calculateCoeffFibonacci() {
        // Each Fibonacci number can be cauculated as a linear combination of the first two Fibonacci numbers
        // F(n) = a * F(0) + b * F(1)

        // Build up the coefficients array
        // Assume the first two Fibonacci numbers are 0 and 1
        // We only need to store the values of b since a is to be multiplied by 0
        coefficients[0] = 0;
        coefficients[1] = 1;

        for (int i = 2; i <= num_fibonacci; i++) {
            coefficients[i] = coefficients[i - 1] + coefficients[i - 2];
        }
    }

    // Using the coefficients, calculate the nth Fibonacci number
    public int nthFibonacci(int n) {
        if (n > num_fibonacci) return -1;
        return coefficients[n];
    }

    // Using the coefficients, calculate the sum of the first n Fibonacci numbers
    public int sumFibonacci(int n) {
        if (n > num_fibonacci) return -1;
        int sum_a = 0;
        for (int i = 0; i <= n; i++) {
            sum_a += coefficients[i];
        }
        return sum_a;
    }

    public static void main(String[] args) {
        Recursion3 r = new Recursion3(6);
        r.calculateCoeffFibonacci();
        System.out.println(r.nthFibonacci(6));
        System.out.println(r.sumFibonacci(6));
    }
}
