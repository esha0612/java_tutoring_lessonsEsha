import java.util.ArrayList;

public class Recursion2 {
    // Write a method to check if a given string is a palindrome
    public static boolean isPalindrome(String s, int i) {
        // TODO: Write your code here
        return (i >= s.length()/2) ? true : (s.charAt(i) == s.charAt(s.length()-1-i)) && isPalindrome(s, i+1);
    }
    
    // Given a string s, write a method to compute all possible permutations of the letters of the string and store it in an ArrayList
    // Assume that the letters in the string are unique
    public static void strPermutations(String s, ArrayList<String> permutations, String prefix) {
        if (s.length() == 0) {
            permutations.add(prefix);
            return;
        }
        
        for (int i = 0; i < s.length(); i++) {
            String next = s.substring(0, i) + s.substring(i+1);
            strPermutations(next, permutations, prefix + s.charAt(i));
        }
    }

    public static void main(String[] args) {
        // Test isPalindrome
        System.out.println(isPalindrome("racecar", 0)); // true
        System.out.println(isPalindrome("hello", 0)); // false
        System.out.println(isPalindrome("madam", 0)); // true

        // Test strPermutations
        ArrayList<String> permutations = new ArrayList<>();
        strPermutations("abc", permutations, "");
        System.out.println(permutations); // [abc, acb, bac, bca, cab, cba]
    }
}
