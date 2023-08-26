public class Recursion_Factorial {
    private static int num;

    public Recursion_Factorial() {
        this.num = 0;
    }

    public Recursion_Factorial(int num) {
        this.num = num;
    }

    public static int factorial(int num) {
        if (num == 0 || num == 1) {
            return 1;
        } else {
            return num * factorial(num - 1);
        }
    }

    public static void main (String[] args) {
        Recursion_Factorial f1 = new Recursion_Factorial();
        Recursion_Factorial f2 = new Recursion_Factorial(5);
        f1.num = 10;
        f2.num = 5;
        // once you complete the factorial function, predict the output of the following:
        System.out.println("Factorial of f1.num: " + factorial(f1.num)); //The output will be 5!, which is 120
        System.out.println("Factorial of f2.num: " + factorial(f2.num)); //The output will be 5!, which is 120
    }
}
