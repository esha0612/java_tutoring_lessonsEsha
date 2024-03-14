public class Recursion5 {
    // Consider a series where 0th term = 2, 1st term = 3.
    // From the 2nd term onwards, the nth term = 3.(n-1)th term + (-1).(n-2)th term

    // Write a method to compute the nth term of the series using recursion
    /* public static int nthTerm(int n) {
        if (n == 0) return 2;
        if (n == 1) return 3;
        return 3 * nthTerm(n - 1) - nthTerm(n - 2);
    } */

    int numOfTerms;
    class Tuple {
        int first;
        int second;
        Tuple(int first, int second) {
            this.first = first;
            this.second = second;
        }
    }
    Tuple[] coefficients;
    int Term1 = 2;
    int Term2 = 3;
    // We represent the nth term as a linear combination of the first two terms
    // nth term = a * Term1 + b * Term2
    // We store the values of a and b in the coefficients array

    public Recursion5(int numOfTerms) {
        this.numOfTerms = numOfTerms;
        coefficients = new Tuple[numOfTerms];
        coefficients[0] = new Tuple(1, 0);
        coefficients[1] = new Tuple(0, 1);
    }
}
