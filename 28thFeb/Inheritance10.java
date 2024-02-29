class A {
    int i, j;

    void print() {
        System.out.println("i: " + i);
        System.out.println("j: " + j);
    }
}

class B extends A {
    int k;

    void print() {
        super.print();
        System.out.println("k: " + k);
    }
}

public class Inheritance10 {
    public static void main (String[] args) {
        /* A a = new A();
        a.i = 10;
        a.j = 20;
        B b = (B)a;
        b.print(); // This will give a ClassCastException */

        A a = new B();
        a.i = 10;
        a.j = 20;
        B b = (B)a;
        b.j = 30;
        b.k = 40;
        a.print();
    }
}