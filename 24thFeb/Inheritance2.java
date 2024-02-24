class A {
    static int i;
    int j;

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

class Inheritance2 {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        a.i = 10;
        a.j = 20;
        a.print();
        b.i = 30;
        b.j = 40;
        b.k = 50;
        b.print();
        a.print();
    }
}