import java.util.Arrays;

public class Streaming_Ex2 {
    public static void main (String[] args) {
        // We want to use streams to work with String objects in this example

        // For the first example, given a String s, we want to print the number of vowels in it
        String s = "Hello World";
        System.out.println("Number of vowels in " + s + ": " + s.chars().filter(c -> "aeiouAEIOU".indexOf(c) != -1).count());

        // For the second example, given a String s, we want to reverse it using streams
        s = "Hello World";
        System.out.println("Reversed string of " + s + ": " + new StringBuilder(s).reverse().toString());

        // For the third example, given a paragraph, we want to count the number of times
        // the word "the" appears in it using streams
        s = "The quick brown fox jumps over the lazy dog. The quick brown fox jumps over the lazy dog. The quick brown fox jumps over the lazy dog.";
        // First, we need to split the paragraph into words
        // String[] words = s.split(" ");
        // Then, we need to filter the words to only include the word "the"
        // System.out.println("Number of times the word \"the\" appears in the paragraph: " + Arrays.stream(words).filter(word -> word.equals("the")).count());

        // So, the one line solution is:
        System.out.println("Number of times the word \"the\" appears in the paragraph: " + Arrays.stream(s.split(" ")).filter(word -> word.toLowerCase().equals("the")).count());
    }
}
