import java.util.HashSet;
import java.util.Set;

public class Sets {
    // we will attempt the Pangram problem using a set
    
    // variable to store the string
    private String str;
    // variable to store the count of each letter
    private Set<Character> set;

    // constructor
    public Sets (String str) {
        this.str = str;
        this.set = new HashSet<>();
    }

    public boolean isPangram() {
        // A set is a collection of unique elements.
        // The add() method adds an element to the set.
        // The remove() method removes an element from the set.
        // The clear() method removes all the elements from the set.
        // The size() method returns the number of elements in the set.
        // The contains() method checks if the set contains the specified element.
        // The isEmpty() method checks if the set is empty.
        // The toArray() method returns an array of all the elements in the set.
        // The iterator() method returns an iterator for the set.
        // The toString() method returns a string representation of the set.
        // The clone() method returns a shallow copy of the set.
        // The equals() method checks if the specified object is equal to the set.
        // The hashCode() method returns the hash code of the set.
        // Sets are usually implemented using the HashSet class.

        // A pangram is a sentence that contains all the letters of the alphabet.
        // Let's say we want to check if a string is a pangram.
        // The string will always be in lower case.

        // We only want to include letters in the alphabet. We don't want to include spaces, numbers, special characters etc.
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        
        // Loop through the string
        for (char c: this.str.toLowerCase().toCharArray()) {
            // If the letter is not in the alphabet, continue
            if (!alphabet.contains(String.valueOf(c))) {
                continue;
            }
            // If the set contains the letter
           /* if (this.set.contains(c)) {
                // Continue
                continue;
            } else {
                // Else add the letter to the set
                this.set.add(c);
            }*/
            this.set.add(c);
            // even if we skip the if-else, as sets only contain unique elements, the letter will only be added once
        }
        // If the size of the set is 26, return true
        if (this.set.size() == 26) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Sets s = new Sets("The quick brown fox jumps over the lazy dog");
        System.out.println(s.isPangram());
    }
}
