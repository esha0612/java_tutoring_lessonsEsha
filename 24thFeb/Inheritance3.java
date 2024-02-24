class A {
    private int i;
    protected int j;

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

class Inheritance3 {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        a.j = 10;
        b.j = 20;
        b.k = 30;
        a.print();
        b.print();
    }
}