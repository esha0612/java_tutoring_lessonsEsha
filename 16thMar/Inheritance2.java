class A {
    protected void test () {
        System.out.println("Testing A");
    }
}

class B extends A {
    // The visibility of the overriding method has to be >= the visibility of the overridden (inherited) method.
    // If the method being overridden is public, the overriding method can only be public.
    public void test() {
        System.out.println("Testing B");
    }
}

public class Inheritance2 {
    public static void main (String[] args) {
        (new B()).test();
    }
}