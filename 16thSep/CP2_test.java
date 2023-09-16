import java.util.HashSet;

public class CP2_test {
    // consider two strings, str1 and str2
    // return true if any rearrangement of str1 is a substring of str2
    // return false otherwise
    // e.g. isSubstring("abc", "abc") -> true
    //      isSubstring("abc", "cba") -> true
    // you may define additional helper methods if you want
    public static boolean isAnagram(String str1, String str2) {
        // check if str1 is an anagram of str2
        if (str1.length() != str2.length())
            return false;
     
        HashSet<Character> set1 = new HashSet<Character>();
        HashSet<Character> set2 = new HashSet<Character>();

        for (int i = 0; i < str1.length(); i++) {
            set1.add(str1.charAt(i));
            set2.add(str2.charAt(i));
        }

        return set1.equals(set2);
    }


    public static boolean isSubstring(String str1, String str2) {
        if (str1.length() > str2.length())
            return false;

        for (int i = 0; i < str2.length() - str1.length() + 1; i++) {
            if (isAnagram(str1, str2.substring(i, i + str1.length())))
                return true;
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println(isSubstring("abc", "abc"));
        System.out.println(isSubstring("abc", "cba"));
        System.out.println(isSubstring("abc", "ab"));
        System.out.println(isSubstring("abc", "abcd"));
        System.out.println(isSubstring("abc", "dabc"));
    }    
}
