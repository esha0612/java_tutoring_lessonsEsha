abstract class A {
    static int i;

    static void display() {
        System.out.println("i = " + i);
    }

    abstract void display2();
}

class B extends A {
    protected int i;

    public B (int i) {
        i = 10; //Doesn't do anything because i is a local variable. The value gets lost.
    }

    static void display() {
        System.out.println("i = " + A.i);
    }

    void display2() {
        A.display();
        B.display();
        System.out.println("i = " + i);
    }
}

public class Inheritance6 {
    public static void main(String[] args) {
        A.i = 10;
        A a = new B(20);
        a.display2();
    }
}