import java.util.HashSet;

public class CP2_test {
    public static boolean isAnagram(String s1, String s2) {
        // check if s1 and s2 are of same length
        if (s1.length() != s2.length()) {
            return false;
        }

        // make two Sets of characters from s1 and s2
        HashSet<Character> set1 = new HashSet<Character>();
        HashSet<Character> set2 = new HashSet<Character>();

        // add all characters from s1 to set1
        for (int i = 0; i < s1.length(); i++) {
            set1.add(s1.charAt(i));
            set2.add(s2.charAt(i));
        }

        // check if set1 and set2 are equal
        if (set1.equals(set2)) {
            System.out.println(s1 + " and " + s2 + " are anagrams");
            return true;
        } else {
            System.out.println(s1 + " and " + s2 + " are not anagrams");
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(CP2.isAnagram("listen", "silent"));
        System.out.println(CP2.isAnagram("triangle", "integral"));
        System.out.println(CP2.isAnagram("cat", "dog"));
    }
}
