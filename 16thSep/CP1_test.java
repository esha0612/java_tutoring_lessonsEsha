public class CP1_test {
    public static String halfSwap(String str) {
        // swap the first half of the string with the second half, if odd, ignore the middle character)
        return str.length() % 2 == 0 ? str.substring(str.length()/2) + str.substring(0, str.length()/2) : str.substring(str.length()/2 + 1) + str.substring(0, str.length()/2);
    }

    public static void main(String[] args) {
        System.out.println(halfSwap("HelloWorld"));
        System.out.println(halfSwap("HelloWorld!"));
    }
}
