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

public class Inheritance11 {
    public static void main (String[] args) {
        A a = new B();
        ((B)a).i = 10;
        a.i = 20;
        a.print();
    }
}