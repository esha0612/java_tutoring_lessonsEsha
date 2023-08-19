import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Hashtable;

public class Dictionaries {
    // variable to store the string
    private String str;
    // variable to store the count of each letter
    private Dictionary<Character, Integer> dict;

    // constructor
    public Dictionaries (String str) {
        this.str = str;
        this.dict = new Hashtable<>();
    }

    private void countLetters () {
        // A dictionary is a collection of key value pairs.
        // The keys are unique and the values may or may not be unique.
        // The keys are used to access the values.
        // The setter method for a dictionary is put().
        // The getter method for a dictionary is get().
        // The size() method returns the number of key value pairs in the dictionary.
        // The remove() method removes the key value pair from the dictionary.
        // The clear() method removes all the key value pairs from the dictionary.
        // The collections of keys and values can be obtained using the keys() and values() methods respectively.
        // The keys() and values() methods return Enumeration objects.
        // The containsKey() and containsValue() methods check if the dictionary contains the specified key or value respectively.
        // The isEmpty() method checks if the dictionary is empty.
        // The keySet() method returns a set of all the keys in the dictionary.
        // The entrySet() method returns a set of all the key value pairs in the dictionary.
        // The toString() method returns a string representation of the dictionary.
        // The clone() method returns a shallow copy of the dictionary.
        // The equals() method checks if the specified object is equal to the dictionary.
        // The hashCode() method returns the hash code of the dictionary.
        // Dictionaries are usually implemented using the Hashtable class.


        // Let's say we want to count the number of times each letter occurs in a string.
        // The String will always be in lower case.

        // We only want to include letters in the alphabet. We don't want to include spaces, numbers, special characters etc.
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        
        // Loop through the string
        for (char c: this.str.toLowerCase().toCharArray()) {
            // If the letter is not in the alphabet, continue
            if (!alphabet.contains(String.valueOf(c))) {
                continue;
            }
            // If the dictionary contains the letter
            if (this.dict.get(c) != null) {
                // Increment the count
                this.dict.put(c, this.dict.get(c) + 1);
            } else {
                // Else add the letter to the dictionary
                this.dict.put(c, 1);
            }
        }
    }

    public static void main (String[] args) {
        // Create a new instance of the class
        Dictionaries dict = new Dictionaries("hello world");
        // Call the countLetters method
        dict.countLetters();
        // Print the dictionary
        System.out.println(dict.dict);

        // How do we print the keys?
        // We can use the keys() method to get an Enumeration object
        Enumeration<Character> keys = dict.dict.keys();
        // We can loop through the Enumeration object
        while (keys.hasMoreElements()) {
            // Print the key
            System.out.println(keys.nextElement());
        }
    }
}
