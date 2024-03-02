class A {
    int i, j;

    void print1() {
        System.out.println("i: " + i);
        print2();
    }

    void print2() {
        System.out.println("j: " + j);
        print1();
    }
}

class B extends A {
    int i, j;

    void print1() {
        super.print1();
        System.out.println("i1: " + i);
    }

    void print2() {
        super.print2();
        System.out.println("j1: " + j);
    }
}

public class Inheritance14 {
    public static void main (String[] args) {
        A a = new B();
        ((B)a).i = 10;
        a.i = 20;
        ((B)a).j = 30;
        a.j = 40;
        a.print1();
        a.print2();
    }
}

// This code will result in a stack overflow error. The print1() method of class A calls the print2() method of class A, which in
// turn calls the print1() method of class A, and so on. This will continue until the stack overflows.