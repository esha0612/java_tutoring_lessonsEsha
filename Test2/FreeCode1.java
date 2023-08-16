package Test2;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class FreeCode1 {
    // This is a class which deals with numbers.
    // We have 3 class variables, one of which is an ArrayList of integers.
    // The second and third are integers, which are used to store the minimum and maximum threshold of the ArrayList.
    // We have 2 constructors, one default and one with parameters.
    // Your task is to write 2 methods.
    // The first method is called prune(), which removes all numbers from the ArrayList which are less than the minimum threshold or greater than the maximum threshold.
    // The second method is called findConnection(), which finds the longest sequence of consecutive even numbers in the ArrayList.

    // Class variables
    private ArrayList<Integer> numbers;
    private int minThreshold;
    private int maxThreshold;

    // Default constructor
    public FreeCode1() {
        numbers = new ArrayList<Integer>();
        minThreshold = 0;
        maxThreshold = 0;
    }

    // Constructor with parameters
    public FreeCode1(ArrayList<Integer> numbers, int minThreshold, int maxThreshold) {
        this.numbers = numbers;
        this.minThreshold = minThreshold;
        this.maxThreshold = maxThreshold;
    }

    // Method to prune the ArrayList
    public void prune() {
        // Your code here
    }

    // Method to find the longest sequence of consecutive even numbers
    // If there are multiple sequences of the same length, return the last one
    public ArrayList<Integer> findConnection() {
        ArrayList<Integer> longestEvenSubsequence = new ArrayList<Integer>();
        // Your code here

        return longestEvenSubsequence;
    }

    // Main method
    public static void main(String[] args) {
        // Create an ArrayList of integers
        ArrayList<Integer> numbers = new ArrayList<Integer>() {{add(1); add(2); add(4); add(18); add(9); add(2); add(3); add(8); add(12); add(14); add(10);}};

        // Create an object of the class
        FreeCode1 fc = new FreeCode1(numbers, 5, 15);

        // Print the ArrayList
        System.out.println("Original ArrayList: " + fc.numbers);

        // Prune the ArrayList
        fc.prune();

        // Print the pruned ArrayList
        System.out.println("Pruned ArrayList: " + fc.numbers);

        // Find the longest sequence of consecutive even numbers
        ArrayList<Integer> longestEvenSubsequence = fc.findConnection();

        // Print the longest sequence of consecutive even numbers
        System.out.println("Longest sequence of consecutive even numbers: " + longestEvenSubsequence);

        // Print the length of the longest sequence of consecutive even numbers
        System.out.println("Length of the longest sequence of consecutive even numbers: " + longestEvenSubsequence.size());
    }
}
