/*
 * The purpose of the second programme is to have a class called Calculator
 * This class has 4 methods, add, subtract, multiply and divide
 * Each method is overloaded and carries out the action mentioned in the method documentation
 * Your task is to complete the methods
 * Use the main method to test your code
 */

class FreeQ2 {
    
    // returns the sum of 2 numbers a and b
    private double add(double a, double b) {
        // your code here
    }

    // returns the sum of an array of numbers
    private double add(double[] numbers) {
        // your code here
    }

    // returns the concatenation of 2 strings a and b
    private String add(String a, String b) {
        // your code here
    }

    // returns the difference of 2 numbers a and b
    private double subtract(double a, double b) {
        // your code here
    }

    // returns the first differing character between 2 strings a and b
    private char subtract(String a, String b) {
        // your code here
    }

    // returns the product of 2 numbers a and b
    private double multiply(double a, double b) {
        // your code here
    }

    // returns the product of an array of numbers
    private double multiply(double[] numbers) {
        // your code here
    }

    // returns the product of 2 matrices a and b
    private double[][] multiply(double[][] a, double[][] b) {
        // your code here
    }

    // returns the quotient of 2 numbers a and b
    private double divide(double a, double b) {
        // your code here
    }

    // test the above methods inside this main method
    public static void main(String[] args) {
        // testing add methods
        FreeQ2 calculator = new FreeQ2();
        System.out.println(calculator.add(1, 2));
        System.out.println(calculator.add(new double[]{1, 2, 3}));
        System.out.println(calculator.add("Hello", "World"));

        // testing subtract methods
        System.out.println(calculator.subtract(1, 2));
        System.out.println(calculator.subtract("Hello", "World"));

        // testing multiply methods
        System.out.println(calculator.multiply(1, 2));
        System.out.println(calculator.multiply(new double[]{1, 2, 3}));
        System.out.println(calculator.multiply(new double[][]{{1, 2}, {3, 4}}, new double[][]{{1, 2}, {3, 4}}));

        // testing divide methods
        System.out.println(calculator.divide(1, 2));
    }
}
