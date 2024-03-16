class A {
    void show() {
        System.out.println("A's show()");
    }
}

class B extends A {
    final void show() {
        System.out.println("B's show()");
    }
}

public class Inheritance5 {
    public static void main(String[] args) {
        A a = new B();
        a.show();
        A a1 = new A();
        a1.show();
    }
}