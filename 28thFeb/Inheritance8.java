class A {
    protected int i;
    static int j;

    void print() {
        System.out.println("i: " + i);
        System.out.println("j: " + j);
    }
}

class B extends A {
    int k;

    void print() {
        System.out.println("i: " + i);
        System.out.println("j: " + j);
        System.out.println("k: " + k);
    }
}

class C extends B {
}

public class Inheritance8 {
    public static void main (String[] args) {
        //C c = new C();
        //c.print();
        //A c1 = new C();
        //c1.print();
        B c2 = new C();
        c2.print();
    }
}