// Let's do an example where instead of a for loop, we use a while loop and an equivalent recursive method.
// Such an example is extracting the digits of a number.
// For example, if the number is 1234, the digits are 1, 2, 3, and 4.
// We can extract the digits of a number by repeatedly dividing the number by 10 and taking the remainder.
// Usually, we use a while or do-while loop to do this.
// Let's demonstrate both and their recursive equivalent.

import java.util.ArrayList;
import java.util.Iterator;
import java.util.stream.Stream;

public class ExtractDigits {

    // Iterative method (while loop)
    public static void extractDigits(int n) {
        while (n > 0) {
            System.out.println(n % 10);
            n /= 10;
        }
    }

    // Iterative method (do-while loop)
    public static void extractDigits2(int n) {
        do {
            System.out.println(n % 10);
            n /= 10;
        } while (n > 0);
    }

    // Recursive method
    public static void extractDigitsRecursive(int n) {
        if (n > 0) {
            System.out.println(n % 10);
            extractDigitsRecursive(n / 10);
        }
    }

    // Let us say that instead of printing the digits, we want to return them in an array.
    // But we do not want to restrict ourselves to a fixed size array
    // (because we do not know how many digits there are or what is the max number of digits).
    
    public static ArrayList<Integer> extractDigitsArray(int n){
        ArrayList<Integer> array = new ArrayList<Integer>();
        while (n > 0) {
            array.add(n % 10);
            n /= 10;
        }
        return array;
    }

    // This can also be done using what is called a Generator.
    // A Generator is a method that returns an Iterable object.
    // An Iterable object is an object that can be iterated over using a for-each loop.
    // For example, an ArrayList is an Iterable object.
    // We can create our own Iterable object by implementing the Iterable interface.
    // The Iterable interface has one method called iterator() that returns an Iterator object.
    public static Iterable<Integer> extractDigitsIterable(int n) {
        return new Iterable<Integer>() {
            @Override
            public Iterator<Integer> iterator() {
                return new Iterator<Integer>() {
                    int number = n;
                    @Override
                    public boolean hasNext() {
                        return number > 0;
                    }
                    @Override
                    public Integer next() {
                        int result = number % 10;
                        number /= 10;
                        return result;
                    }
                };
            }
        };
    }

    // We can also do this using streams.
    // Streams are a new feature in Java 8.
    // Streams are a way to process collections of data in a functional way.
    public static Iterable<Integer> extractDigitsStream(int n) {
        return () -> {
            return Stream.iterate(n, i -> i / 10)
                         .takeWhile(i -> i > 0)
                         .map(i -> i % 10)
                         .iterator();
        };
    }

    // A dirty approach would be to assume the number has at most x digits (say 100).
    // Then we can create an array of size 100 and fill it with the digits.
    // But this is not a good approach because it is not general.
    // This will likely be a sparse array (most of the elements will be 0).
    // This is a waste of memory.
    // We can do better by using an ArrayList.
    // A shortcut to returning the digits without non-leading zeros would be to convert to String and back.
    public static int[] extractDigitsArray2(int n) {
        String s = Integer.toString(n);
        int[] result = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            result[i] = Character.getNumericValue(s.charAt(i));
        }
        return result;
    }

    // Main method
    public static void main(String[] args) {
        extractDigits(1234);
        extractDigits2(1234);
        extractDigitsRecursive(1234);
        System.out.println(extractDigitsArray(1234).toString());

        // Testing the Generator
        for (int digit : extractDigitsIterable(1234)) {
            System.out.println(digit);
        }

        // Same thing with for-each loop
        extractDigitsIterable(1234).forEach(digit -> System.out.println(digit));

        // Same thing with streams
        extractDigitsStream(1234).forEach(digit -> System.out.println(digit));

        // Testing the dirty approach (while printing, we can ignore the leading zeros by using printf)
        int[] digits = extractDigitsArray2(1234);
        for (int digit : digits) {
            System.out.printf("%d ", digit);
        }
    }
}
