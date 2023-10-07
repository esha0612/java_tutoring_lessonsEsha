public class FreeCode1 {
    // Write a method that takes in a String and returns the number of
    // occurences of the letter passed as parameter in the String.
    // For example, if the String is "banana", and the character is 'a', the method should return 3.
    // You are permitted only to use the indexOf() and length() methods of the String class.
    // You are not permitted to use the charAt() method of the String class.
    // You are not permitted to use the substring() method of the String class.
    // You are not permitted to use the toCharArray() method of the String class.
    // You are not permitted to use the split() method of the String class.
    public static int countAs(String s, char c) {
        // TODO: Write your code here
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.indexOf(c, i) == i) {
                count++;
            }
        }
        return count;
    }

    // Write a method that takes in a String and returns the number of
    // vowels in the String.
    // Feel free to use the countAs() method you wrote above.
    public static int countVowels(String s) {
        // TODO: Write your code here
        String dummy = s.toLowerCase();
        return countAs(dummy, 'a') + countAs(dummy, 'e') + countAs(dummy, 'i') + countAs(dummy, 'o') + countAs(dummy, 'u');
    }

    // Main method for testing your code.
    public static void main (String[] args) {
        System.out.println(countAs("banana", 'a')); // Should print 3
        System.out.println(countAs("banana", 'b')); // Should print 1
        System.out.println(countAs("banana", 'c')); // Should print 0
        System.out.println(countAs("banana", 'n')); // Should print 2
        System.out.println(countAs("banana", 'z')); // Should print 0
        System.out.println(countVowels("banana")); // Should print 3
        System.out.println(countVowels("Hervaeus")); // Should print 4
        System.out.println(countVowels("aeiou")); // Should print 5
        System.out.println(countVowels("bcdfghjklmnpqrstvwxyz")); // Should print 0
    }
}
