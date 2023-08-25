class Calculator {
    // This is a simple calculator which supports +, -, *, /, % on two numbers only (aka no overloaded methods).

    // member variables
    protected static int n1, n2;

    // constructors
    public Calculator() {
        this.n1 = 0;
        this.n2 = 0;
    }

    public Calculator(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    // member methods
    protected static int add() {
        return n1 + n2;
    }

    protected static int subtract() {
        return n1 - n2;
    }

    protected static int multiply() {
        return n1 * n2;
    }

    protected static int divide() {
        return n1 / n2;
    }
}

public class Static_Members {
    public static void main (String[] args) {
        Calculator.n1 = 10;
        Calculator.n2 = 5;

        System.out.println("Addition: " + Calculator.add());
        System.out.println("Subtraction: " + Calculator.subtract());
        System.out.println("Multiplication: " + Calculator.multiply());
        System.out.println("Division: " + Calculator.divide());

        // Let's try some experiments

        // 1. Let's make objects of Calculator
        Calculator c1 = new Calculator();
        Calculator c2 = new Calculator();

        // 2. Let's change the values of n1 and n2 in c1
        c1.n1 = 20;
        c1.n2 = 10;

        // 3. Let's print the values of n1 and n2 in c2
        System.out.println("c2.n1: " + c2.n1);
        System.out.println("c2.n2: " + c2.n2);

        // 4. Let's change the values of n1 and n2 in c2
        c2.n1 = 30;
        c2.n2 = 15;

        // 5. Let's print the values of n1 and n2 in c1
        System.out.println("c1.n1: " + c1.n1);
        System.out.println("c1.n2: " + c1.n2);
    }
}