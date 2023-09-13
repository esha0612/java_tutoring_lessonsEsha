// Given a number n, print the sum of all the numbers from 1 to n.

public class CP1 {
    public static int sum(int n) {
        // your code here
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static int sum2(int n) {
        if (n == 0)
            return 0;
        return n + sum2(n-1);
    }
    
    public static void main(String[] args) {
        System.out.println(sum(10));
    }
}