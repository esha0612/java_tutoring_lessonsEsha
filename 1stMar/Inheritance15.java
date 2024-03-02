class A {
    int i;

    void print() {
        System.out.println("i: " + i);
    }
}

class B extends A {
    int i;

    void print() {
        System.out.println("i1: " + i);
    }
}

// class C extends A {
// the above will give a runtime error as while A a = new C() is allowed since
// base class reference can point to derived class object, and A is the base class,
// (B)a is not allowed since B is not the base class for C, and a is an object of C,
// even though a is a reference of type A. A a = new B() will allow (B)a.
class C extends B {
    int i;

    void print() {
        System.out.println("i2: " + i);
    }
}

public class Inheritance15 {
    public static void main (String[] args) {
        A a = new C();
        ((B)a).i = 10;
        a.i = 20;
        a.print();
    }
}