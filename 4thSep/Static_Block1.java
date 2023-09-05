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

public class Static_Block1 {
    public static void main(String[] args) {
        Test t1 = new Test();
        Test t2 = new Test();
    }
}
