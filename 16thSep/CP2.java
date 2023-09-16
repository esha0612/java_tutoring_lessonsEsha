public class CP2 {
    // consider two strings, str1 and str2
    // return true if any rearrangement of str1 is a substring of str2
    // return false otherwise
    // e.g. isSubstring("abc", "abc") -> true
    //      isSubstring("abc", "cba") -> true
    // you may define additional helper methods if you want
    
    public static boolean isSubstring(String str1, String str2) {
        // Your code here
        boolean bool = false;
        for (int i = 0; i < str1.length(); i++) {
            if (str2.contains(str1.substring(i,i+1))) {
                bool = true;
            }
        }
        if (bool) {
            for (int i = 0; i < str2.length()-1; i++ ) {
                if (str1.contains(str2.substring(i, i+1))) {
                    bool = true;
                }
            }
        }
        return bool;
    }

    public static void main(String[] args) {
        System.out.println(isSubstring("abc", "abc"));
        System.out.println(isSubstring("abc", "cba"));
        System.out.println(isSubstring("abc", "ab"));
        System.out.println(isSubstring("abc", "abcd"));
        System.out.println(isSubstring("abc", "dabc"));
    }
}
