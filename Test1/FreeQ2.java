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
        return a+b;
    }

    // returns the sum of an array of numbers
    private double add(double[] numbers) {
        // your code here
        int sum = 0;
        for (double element : numbers){
            sum += element;
        }
        return sum;
    }

    // returns the concatenation of 2 strings a and b
    private String add(String a, String b) {
        // your code here
        return a+b;
    }

    // returns the difference of 2 numbers a and b
    private double subtract(double a, double b) {
        // your code here
        return a-b;
    }

    // returns the first differing character between 2 strings a and b
    private char subtract(String a, String b) {
        // your code here
        int length = Math.min(a.length(), b.length());
        for (int i = 0; i < length; i++) {
            char aChar = a.charAt(i);
            char bChar = b.charAt(i);
            if (aChar != bChar) {
                return aChar;
            }
        }
        return a.length() < b.length() ? b.charAt(length) : a.charAt(length);
    }
       
    // returns the product of 2 numbers a and b
    private double multiply(double a, double b) {
        return a*b;
    }

    // returns the product of an array of numbers
    private double multiply(double[] numbers) {
        // your code here
        double product = 1;
        for (double index : numbers) {
            product *= index;
        }
        return product;
    }

    // returns the product of 2 matrices a and b
    private double[][] multiply(double[][] a, double[][] b) {
        // your code here
        int rowsA = a.length;
        int colsA = a[0].length;
        int colsB = b[0].length;
    
        double[][] result = new double[rowsA][colsB];
    
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                double sum = 0.0;
                for (int k = 0; k < colsA; k++) {
                    sum += a[i][k] * b[k][j];
                }
                result[i][j] = sum;
            }
        }
    
        return result;

    }

    // returns the quotient of 2 numbers a and b
    private double divide(double a, double b) {
        // your code here
        return a/b;
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
