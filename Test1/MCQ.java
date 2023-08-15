/*
 * This class contains methods, the output of each of which is part of an MCQ
 * Your task is to choose the correct answer for each MCQ based on the code for each method
 */

public class MCQ {

    // method 1
    private static void method1() {
        int[] numbers = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i] * 2;
        }
        System.out.println(sum);
    }
    /* 
     * What is the output of method1?
     * a) 30 answer!
     * b) 60
     * c) 15
     * d) 10
     */
    
    // method 2
    private static void method2() {
        int a = 32768;
        short b = (short) a;
        int c = a + b;
        System.out.println(c++);
    }
    /* 
     * What is the output of method2?
     * a) 65534
     * b) 32767
     * c) 0 Answer!
     * d) 65535
     */

    // sometimes life in unfair, and you might see some code that you don't understand or have encountered previously
    // in this case, you can use the internet to search for answers, but please start with your own intuition
    // if you are still stuck, you can ask me for help
    // interface for method3
    private interface StringFunction {
        String run(String s);
    }

    // helper method for method3
    private static String printFormatted(String s, StringFunction f) {
        return f.run(s);
    }
    
    // method 3
    private static void method3() {
        StringFunction exclaim = (s) -> s + "!";
        StringFunction ask = (s) -> s + "?";
        System.out.println(printFormatted("Hello", exclaim) + " " + printFormatted("Hello", ask));
    }
    /* 
     * What is the output of method3?
     * a) Hello! Hello? Answer
     * b) Hello! Hello!
     * c) Hello!
     * d) Hello?
     */

    // helper method for method4
    private static int[] change(int[] arr) {
        for (int num: arr) {
            num = num * 2;
        }
        return arr;
    }

    // method 4
    private static void method4() {
        int[] arr = {1, 2, 3, 4, 5};
        int[] newArr = change(arr);
        for (int num: newArr) {
            System.out.print(num + " ");
        }
    }

    /*
     * What is the output of method4?
     * a) 2 4 6 8 10
     * b) 1 2 3 4 5 Need help, don't understand
     * c) Compilation error
     * d) Runtime error
     */

    // This is here to tempt you to break the rules and look at the answers before you try to solve the questions
    public static void main(String[] args) {
        method1();
        method2();
        method3();
        method4();
    }
}
