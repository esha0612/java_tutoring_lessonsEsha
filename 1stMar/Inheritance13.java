class A {
    int i, j;
    int count = 0;

    void print1() {
        count++;
        System.out.println("i: " + i);
        if (count < 3)
            print1();
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

public class Inheritance13 {
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