public class CP4 {
    public static void main(String[] args) {
        String s1 = new String("hello");
        String s2 = new String("hello");

        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));

        s1 = "hello";
        s2 = "hello";

        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));

        s1 = "hello";
        StringBuilder sb = new StringBuilder("hello");
        s2 = sb.toString();

        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));

        s1 = "hello";
        s2 = new String("hello");

        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));

        String s3 = "hello" + 4 + 5 + 'a' + "b" + 6 + 7;
        System.out.println(s3);
    }
}
