import java.util.HashSet;

public class FreeCode3 {
    // This class has a String s.
    protected String s;

    // There is a parameterized constructor that takes a String as input and sets s to that String.
    public FreeCode3(String s) {
        this.s = s;
    }

    // Write a method which returns the maximum number of combinations possible with the unique characters in s.
    // For example, if s is "abc", the method should return 6.
    // If s is "abca", the method should return 6.
    // Note that only unique characters are considered.
    
    // Helper method to calculate factorial
    private long factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n-1);
    }

    protected long maxCombinations() {
        // TODO: Write your code here

        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            set.add(s.charAt(i));
        }
        
        return factorial(set.size());
    }

    // Write a method which returns the length of the longest substring of s that contains only consonants.
    // For example, if s is "abc", the method should return 3.
    // For example, if s is "Hello World", the method should return 5.
    // Note that the count should reset if any non-consonant (including punctuation) is encountered.
    protected int longestConsonantSubstring() {
        // TODO: Write your code here

        String puncString = ".,?!:;\"\'";
        String vowels = "aeiouAEIOU";
        int count = 0, max = 0;

        for (int i = 0; i < s.length(); i++) {
            if (puncString.indexOf(s.charAt(i)) != -1 || vowels.indexOf(s.charAt(i)) != -1) {
                if (count > max) {
                    max = count;
                }
                count = 0;
            } else {
                count++;
            }
        }
        return max;
    }

    // Write a method which returns the length of the longest substring of s that contains only unique characters.
    // This definition of unique means that each character can only appear once in the substring.
    // The count should reset if any character is repeated.
    protected int longestUniqueSubstring() {
        // TODO: Write your code here
        int count = 0, max = 0;
        String dummy = s.toLowerCase();

        // Generate all possible substrings of s after removing punctuation
        // and check if they only contain unique characters
        for (int i = 0; i < dummy.length(); i++) {
            for (int j = i + 1; j <= dummy.length(); j++) {
                String sub = dummy.substring(i, j);
                boolean unique = true;
                for (int k = 0; k < sub.length(); k++) {
                    if (sub.indexOf(sub.charAt(k), k + 1) != -1) {
                        unique = false;
                        break;
                    }
                }
                if (unique) {
                    count = sub.length();
                    if (count > max) {
                        max = count;
                    }
                }
            }
        }
        return max;
    }

    // Write a method which returns the length of the longest substring of s that contains only consecutively non-repeating characters.
    // The count should reset if punctuation is encountered.
    // Note that characters can repeat, but they cannot repeat consecutively.
    protected int longestSubstringWithoutRepeats() {
        // TODO: Write your code here

        String puncString = ".,?!:;\"\'";
        int count = 0, max = 0;

        for (int i = 0; i < s.length(); i++) {
            if (puncString.indexOf(s.charAt(i)) != -1) {
                if (count > max) {
                    max = count;
                }
                count = 0;
            } else {
                if (i == 0 || s.charAt(i) != s.charAt(i - 1)) {
                    count++;
                } else {
                    if (count > max) {
                        max = count;
                    }
                    count = 1;
                }
            }
        }
        return max;
    }

    // Main method for testing your code.
    public static void main (String[] args) {
        FreeCode3 p1 = new FreeCode3("abc");
        FreeCode3 p2 = new FreeCode3("abca");
        FreeCode3 p3 = new FreeCode3("Hello World");
        FreeCode3 p4 = new FreeCode3("Hello World!");
        FreeCode3 p5 = new FreeCode3("Hello World!!!");
        FreeCode3 p6 = new FreeCode3("Hello World!!!!!");
        FreeCode3 p7 = new FreeCode3("Hello World!!!!!!");

        System.out.println(p1.maxCombinations()); // Should print 6
        System.out.println(p2.maxCombinations()); // Should print 6
        System.out.println(p3.maxCombinations()); // Should print 3628800
        System.out.println(p4.maxCombinations()); // Should print 3628800
        System.out.println(p5.maxCombinations()); // Should print 3628800
        System.out.println(p6.maxCombinations()); // Should print 3628800
        System.out.println(p7.maxCombinations()); // Should print 3628800
        System.out.println("--------------------");
        System.out.println(p1.longestConsonantSubstring()); // Should print 3
        System.out.println(p2.longestConsonantSubstring()); // Should print 3
        System.out.println(p3.longestConsonantSubstring()); // Should print 5
        System.out.println(p4.longestConsonantSubstring()); // Should print 5
        System.out.println(p5.longestConsonantSubstring()); // Should print 5
        System.out.println(p6.longestConsonantSubstring()); // Should print 5
        System.out.println(p7.longestConsonantSubstring()); // Should print 5
        System.out.println("--------------------");
        System.out.println(p1.longestUniqueSubstring()); // Should print 3
        System.out.println(p2.longestUniqueSubstring()); // Should print 3
        System.out.println(p3.longestUniqueSubstring()); // Should print 7
        System.out.println(p4.longestUniqueSubstring()); // Should print 7
        System.out.println(p5.longestUniqueSubstring()); // Should print 7
        System.out.println(p6.longestUniqueSubstring()); // Should print 7
        System.out.println(p7.longestUniqueSubstring()); // Should print 7
        System.out.println("--------------------");
        System.out.println(p1.longestSubstringWithoutRepeats()); // Should print 3
        System.out.println(p2.longestSubstringWithoutRepeats()); // Should print 3
        System.out.println(p3.longestSubstringWithoutRepeats()); // Should print 5
        System.out.println(p4.longestSubstringWithoutRepeats()); // Should print 5
        System.out.println(p5.longestSubstringWithoutRepeats()); // Should print 5
        System.out.println(p6.longestSubstringWithoutRepeats()); // Should print 5
        System.out.println(p7.longestSubstringWithoutRepeats()); // Should print 5
    }
}
