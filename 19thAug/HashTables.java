import java.util.Enumeration;
import java.util.Hashtable;

public class HashTables {
    // Let us attempt the letter count problem using a hashtable

    // variable to store the string
    private String str;
    // variable to store the count of each letter
    private Hashtable<Character, Integer> count;

    // constructor
    public HashTables(String str) {
        this.str = str;
        this.count = new Hashtable<>();
    }

    public void countLetters() {
        // Loop through the string
        for (char c: this.str.toLowerCase().toCharArray()) {
            // If the letter is not in the alphabet, continue
            if (!Character.isLetter(c)) {
                continue;
            }
            // If the hashtable contains the letter
            if (this.count.containsKey(c)) {
                // Increment the count
                this.count.put(c, this.count.get(c) + 1);
            } else {
                // Else add the letter to the hashtable
                this.count.put(c, 1);
            }
        }
    }

    public static void main(String[] args) {
        // A hashtable is a collection of key value pairs.
        // The keys are unique and the values may or may not be unique.
        // The keys are used to access the values.
        // The setter method for a hashtable is put().
        // The getter method for a hashtable is get().
        // The size() method returns the number of key value pairs in the hashtable.
        // The remove() method removes the key value pair from the hashtable.
        // The clear() method removes all the key value pairs from the hashtable.
        // The collections of keys and values can be obtained using the keys() and values() methods respectively.
        // The keys() and values() methods return Enumeration objects.
        // The containsKey() and containsValue() methods check if the hashtable contains the specified key or value respectively.
        // The isEmpty() method checks if the hashtable is empty.
        // The keySet() method returns a set of all the keys in the hashtable.
        // The entrySet() method returns a set of all the key value pairs in the hashtable.
        // The toString() method returns a string representation of the hashtable.
        // The clone() method returns a shallow copy of the hashtable.
        // The equals() method checks if the specified object is equal to the hashtable.
        // The hashCode() method returns the hash code of the hashtable.

        // Hashtables may be initialised using either an empty template as shown below:
        Hashtable<String, Integer> hashtable = new Hashtable<>();
        // Or using generics as shown below:
        // Hashtable<String, Integer> hashtable = new Hashtable<String, Integer>();
        // Hashtables may also contain a load factor and initial capacity as shown below:
        // Hashtable<String, Integer> hashtable = new Hashtable<>(0.5f, 10);
 
        // Adding elements to the hashtable
        hashtable.put("A", 1);
        hashtable.put("B", 2);
        hashtable.put("C", 3);
 
        // Getting values from the hashtable
        int valueA = hashtable.get("A");
        System.out.println("Value of A: " + valueA);
 
        // Removing elements from the hashtable
        hashtable.remove("B");
 
        // Enumerating the elements of the hashtable
        Enumeration<String> keys = hashtable.keys();
        while (keys.hasMoreElements()) {
            String key = keys.nextElement();
            System.out.println("Key: " + key + ", Value: " + hashtable.get(key));
        }

        // Testing the letter count problem
        HashTables hashTables = new HashTables("Hello World!");
        hashTables.countLetters();
        System.out.println(hashTables.count);
    }
}
