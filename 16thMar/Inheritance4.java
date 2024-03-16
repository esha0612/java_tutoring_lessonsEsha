abstract class A {
    int i;

    abstract void display();
}

class B extends A {
    void display() {
        System.out.println("i = " + i);
    }
}

public class Inheritance4 {
    public static void main(String[] args) {
        B b = new B();
        b.i = 10;
        b.display();
    }
}