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

class Inheritance6 {
    public static void main(String[] args) {
        // Notice how we do not have to explicitly cast to A, this is implicitly allowed by Java
        A a = new B();

        a.i = 10;
        a.j = 20;

        // Since you cast a subclass object to a base type, you can only access the base class methods and variables
        // a.k = 30; // This will give an error

        a.print();

        B b = (B)a;
        b.k = 30;

        b.print();

        // The question here is why it prints 10, 20, 30 and not 0, 0, 30
        // This is because b is a referenmce to the same object as a (notice that there is no new operator)
        // So both a and b are pointing to the same object (aka same memory location)
    }
}