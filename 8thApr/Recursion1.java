class Recursion1 {
    void m1(String s, int n) {
        if (n >= 0) {
            m1(s, n - 1);
            System.out.println(s.charAt(n));
        }
    }

    void m2(String s, int n) {
        if (n >= 0) {
            System.out.println(s.charAt(n));
            m2(s, n - 1);
        }
    }

    void m3(String s, int n) {
        if (n >= 0) {
            System.out.println(s.charAt(n));
            m3(s, n - 1);
            System.out.println(s.charAt(n));
        }
    }

    public static void main(String[] args) {
        Recursion1 r = new Recursion1();
        //r.m1("Hello", 4);
        //System.out.println("**********");
        //r.m2("Hello", 4);
        //System.out.println("**********");
        r.m3("Hello", 4);
    }
}