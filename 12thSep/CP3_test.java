public class CP3_test {
    // Given two Strings s1 and s2, find the number of times the second string occurs in the first string.
    // For example, given s1 = "abababa", s2 = "aba", the answer is 3.
    public static int count(String s1, String s2) {
        int count = 0;
        for (int i = 0; i < s1.length()-s2.length()+1; i++) {
            if (s1.substring(i, i+s2.length()).equals(s2)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(count("abababa", "aba"));
    }
}