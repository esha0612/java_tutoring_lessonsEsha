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

class Inheritance5 {
    public static void main(String[] args) {
        B b = (B)new A();
        A a = (A)b;

        a.i = 10;
        a.j = 20;

        a.print();
    }
}