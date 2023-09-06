class A {
    static int i = 10;

    static void A() {
        System.out.println(i);
    }
}

class B extends A {
    static int i = 20;

    static void A() {
        System.out.println(i);
    }
}

public class MCQ16 {
    public static void main(String[] args) {
        A a = new B();
        a.A();
    }
}

// Predict the output
// 10
