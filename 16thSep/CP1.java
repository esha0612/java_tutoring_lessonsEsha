public class CP1 {
    public static String halfSwap(String str) {
        // Your code here (swap the first half of the string with the second half, if odd, ignore the middle character)
        String first = str.substring(0, (str.length()/2));
        String second = str.substring((str.length()/2), str.length());
        if (str.length()%2 != 0)
            second = str.substring((str.length()/2)+1, str.length());

        return second + first;
    }

    public static void main(String[] args) {
        System.out.println(halfSwap("HelloWorld"));
        System.out.println(halfSwap("HelloWorld!"));
    }
}