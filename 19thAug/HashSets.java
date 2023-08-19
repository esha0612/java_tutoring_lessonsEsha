import java.util.HashSet;
import java.util.TreeSet;

public class HashSets {
    public static void main(String[] args) {

        // Create a HashSet object called numbers
        HashSet<Integer> numbers = new HashSet<Integer>();
    
        // Add values to the set
        numbers.add(4);
        numbers.add(7);
        numbers.add(8);
        numbers.add(15);
        numbers.add(11);
        numbers.add(9);
    
        // Show which numbers between 1 and 10 are in the set
        for(int i = 1; i <= 10; i++) {
          if(numbers.contains(i)) {
            System.out.println(i + " was found in the set.");
          } else {
            System.out.println(i + " was not found in the set.");
          }
        }

        // Print the HashSet
        System.out.println(numbers);

        // Try to add a duplicate
        numbers.add(4);
        // Print the HashSet
        System.out.println(numbers);

        // Sort the HashSet
        // HashSet is not sorted
        // To sort a HashSet, we need to convert it to a TreeSet
        // TreeSet is a set where the elements are sorted
        // TreeSet is slower than HashSet

        // Create a TreeSet object called sortedNumbers
        TreeSet<Integer> sortedNumbers = new TreeSet<Integer>(numbers);
        // Print the TreeSet
        System.out.println(sortedNumbers);
      }
}
