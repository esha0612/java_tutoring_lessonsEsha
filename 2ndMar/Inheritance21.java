// An abstract class cannot be instantiated (no objects), but can be inherited.
// An abstract class can have both abstract and non-abstract methods.
// An abstract class can have constructors and static methods also.

abstract class A {
    public abstract void print();
    public void print(int i) {
        System.out.println("i: " + i);
    } 
}

class B extends A {
    protected static int i;

    public void print() {
        System.out.println("i: " + i);
    }

    @Override
    public void print(int i) {
        System.out.println("i: " + i);
    }
}

public class Inheritance21 {
    public static void main(String[] args) {
        A a = new B();
        B.i = 10;
        a.print();
        a.print(20);
    }
}