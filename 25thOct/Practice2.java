public class Practice2 {
    // A string is a palindrome if it remains the same when reversed. For example, "racecar" is a palindrome.
    // Write a method that takes a string and returns true if it is a palindrome and false otherwise.
    public static boolean isPalindrome(String s) {
        for (int i=0; i<s.length()/2; i++) {
            if (s.charAt(i)!=s.charAt(s.length()-i-1)) {
                return false;
            }
        }
        return true;
    }

    // Write a method that takes a string and returns true if it is a palindrome and false otherwise in one line.
    public static boolean isPalindrome2(String s) {
        return s.equals(new StringBuilder(s).reverse().toString());
    }

    // Write a method that takes a string and returns true if it is a palindrome and false otherwise in recursive way.
    public static boolean isPalindrome3(String s) {
        if (s.length()<=1) {
            return true;
        }
        return s.charAt(0)==s.charAt(s.length()-1) && isPalindrome3(s.substring(1, s.length()-1));
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("racecar"));
        System.out.println(isPalindrome2("racecar"));
        System.out.println(isPalindrome3("racecar"));
    }
}
