import java.util.HashSet;
import java.util.Set;

public class Recursion3 {
    // Write a recursive method to generate all possiblle substrings of a given string
    public static void generateSubstrings(Set<String> substrings, String s, int start, int end) {
        // TODO: Write your code here
        if (start > end) {
            return;
        }
        substrings.add(s.substring(start, end + 1));
        generateSubstrings(substrings, s, start, end - 1);
        generateSubstrings(substrings, s, start + 1, end);
    }
    
    public static void main(String[] args) {
        // Test substrings
        Set<String> substrings = new HashSet<String>();
        String s = "abc";
        generateSubstrings(substrings, s, 0, s.length() - 1);
        System.out.println(substrings); // [a, ab, abc, b, bc, c]
    }
}
