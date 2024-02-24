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

class Inheritance4 {
    public static void main(String[] args) {
        // Base class object cannot be assigned to derived class reference
        // In other words, you cannot assign a subclass pointer to a superclass object
        // It will compile if explicit type casting is done, but will throw ClassCastException at runtime
        B b = (B)new A();
        b.i = 10;
        b.j = 20;
        b.k = 30;
        b.print();
    }
}