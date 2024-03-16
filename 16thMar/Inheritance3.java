final class A {
    public void method1() {
        System.out.println("A's method1()");
    }
}

class B {
    A a;

    public B(A a) {
        this.a = a;
    }

    public void method2() {
        System.out.println("B's method2()");
    }
}

public class Inheritance3 {
    public static void main(String[] args) {
        B b = new B(new A());
        b.a.method1();
        b.method2();
    }
}