public class Recursion4 {
    // Write a method to compute the sum of an arithmetic series using recursion
    public int sumArithmeticSeries(int firstNumber, int commonDifference, int numberOfTerms) {
        if (numberOfTerms == 1) return firstNumber;
        return firstNumber + sumArithmeticSeries(firstNumber + commonDifference, commonDifference, numberOfTerms - 1);
    }

    // Write a method to compute the sum of a geometric series using recursion
    public int sumGeometricSeries(int firstNumber, int commonRatio, int numberOfTerms) {
        if (numberOfTerms == 1) return firstNumber;
        return firstNumber + sumGeometricSeries(firstNumber * commonRatio, commonRatio, numberOfTerms - 1);
    }

    // Test those methods in the main method
    public static void main(String[] args) {
        Recursion4 r = new Recursion4();
        System.out.println(r.sumArithmeticSeries(1, 1, 5));
        System.out.println(r.sumGeometricSeries(1, 2, 5));
    }
}
