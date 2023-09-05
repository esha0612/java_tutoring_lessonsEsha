class Test {
    static int a;
    int b;

    static {
        a = 10;
        System.out.println("Static block called");
    }

    public Test () {
        System.out.println("Constructor called");
    }
}

public class Static_Block2 {
    public static void main (String[] args) {
        // This will call the static block
        // Even if we don't create any object of Test class (thus no constructor called, and class not loaded into memory),
        // we still refer to the static variable a of Test class, which will load the class into memory and call the static block
        System.out.println(Test.a);
    }
}
