import java.util.Arrays;

public class Recap {
    // write a function which receives an array of natural numbers
    // for each value, it sums up their factors and replaces the value with the sum
    // e.g. [1, 2, 3, 4, 5] -> [1, 3, 4, 7, 6]
    // return the array with the sum of factors
    private static int [] sumOfFactors (int [] numbers) {
        // your code here
        for (int i = 0; i < numbers.length; i++) {
            int sum = 0;
            for (int j = 1; j <= numbers[i]; j++) {
                if (numbers[i] % j == 0) {
                    sum += j;
                }
            }
            numbers[i] = sum;
        }
        return numbers;
    }

    public static void main (String [] args) {
        // shorthand for if else
        // condition ? true : false
        // exercise 1
        int x = 5;
        int y = 10;
        int result = x > y ? x : y;
        System.out.println(result);
        
        // shorthand for incrementing and decrementing
        // exercise 2
        int a = 2;
        while (true) {
            System.out.println("Hello");
            // put a condition to break the loop using ternary operator after 10 times
            if (--a == 0) {
                break;
            }
        }

        // shorthand for for loop
        // exercise 3
        // let's say we have an array of numbers
        int [] numbers = {1, 2, 3, 4, 5};
        // call the function sumOfFactors
        // print the result
        System.out.println("The original array is: " + Arrays.toString(numbers));
        System.out.println("The result is: " + Arrays.toString(sumOfFactors(numbers)));
        System.out.println("The original array after calling the fucntion is: " + Arrays.toString(numbers));
    }
}
