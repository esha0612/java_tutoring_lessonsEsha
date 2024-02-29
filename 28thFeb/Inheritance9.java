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

    void prettyPrint() {
        System.out.println("i: " + i);
        System.out.println("j: " + j);
        System.out.println("k: " + k);
    }
}

class C extends B {
    int l;

    void print() {
        super.print();
        System.out.println("l: " + l);
    }

    void prettyPrint() {
        super.prettyPrint();
        System.out.println("l: " + l);
    }
}

public class Inheritance9 {
    public static void main (String[] args) {
        /* C c = new C();
        c.i = 10;
        c.j = 20;
        c.k = 30;
        c.l = 40;
        c.prettyPrint(); */
        // So here, the statement super.prettyPrint() in C's prettyPrint() method calls B's prettyPrint() method
        // because B is the immediate superclass of C.
        // But the calling class is still C, so i, j, and k, which are short for this.i, this.j, and this.k, are
        // resolve to C's i, j, and k, respectively.
        // You have to calculate the text replacements for super and this before every such call.

        A c1 = new C();
        c1.i = 10;
        c1.j = 20;
        // c1.k = 30; // This will give an error
        // c1.l = 40; // This will give an error
        //c1.print();
        // c1.prettyPrint(); // This will give an error 
        // This is because the reference type is A, so you can only access the methods and variables of A
        // Even though we have allocated the memory for C, the compiler does not know how to access these
        // memory locations using a reference of type A
        // This can be remedied by casting c1 to C or a "compatible type" to C
        // A compatible type is a type that is either a subclass of C or a superclass of C with an equivalent prototype
        // An equivalent prototype means that every method and member variable of C is also present in the compatible type class
        // Of course, a compatible type must be related to C in the inheritance hierarchy

        B c2 = (B)c1;
        c2.k = 30;
        //c2.prettyPrint();
        // c2.l = 20; // This will give an error

        C c3 = (C)c2;
        c3.l = 40;
        c3.prettyPrint();
    }
}