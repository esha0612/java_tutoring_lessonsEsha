public class CP2 {
    // Given 2 strings s1 and s2, check if they are anagrams of each other.
    // An anagram of a string is another string that contains the same characters, only the order of characters can be different.
    public static boolean isAnagram(String s1, String s2) {
        // your code here
        boolean bool = true;
        for (int i = 0; i < s1.length()-1; i++ ) {
            if (!s2.contains(s1.substring(i, i+1))) {
                bool = false;
                break;
            }
        }

        if (bool) {
            for (int i = 0; i < s2.length()-1; i++ ) {
                if (!s1.contains(s2.substring(i, i+1))) {
                    bool = false;
                    break;
                }
            }
        }

        return bool;
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("listen", "silent"));
        System.out.println(isAnagram("triangle", "integral"));
        System.out.println(isAnagram("cat", "dog"));
    }
}
