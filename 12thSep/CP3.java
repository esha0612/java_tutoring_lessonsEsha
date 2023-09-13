public class CP3 {
    // Given two Strings s1 and s2, find the number of times the second string occurs in the first string.
    // For example, given s1 = "abababa", s2 = "aba", the answer is 3.
    public static int count(String s1, String s2) {
        // your code here
        int count = 0;
        
        for (int i = 0; i < s1.length() - s2.length() + 1; i++){
            // if the first character of s2 is not in this position of s1, skip this iteration
            if (s1.charAt(i) != s2.charAt(0)) {
                continue;
            }
            if (s1.substring(i).contains(s2)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(count("abababa", "aba"));
    }
}
