class A {
    static int i;

    static void print() {
        System.out.println("i: " + i);
    }

    void print(int i) {
        print();
    }
}

class B extends A {
    static int j;

    static void print() {
        A.print();
        System.out.println("j: " + j);
    }

    void print(int i) {
        B.print();
        super.print(i);
    }
}

class Inheritance7 {
    public static void main(String[] args) {
        B b = new B();
        b.i = 10;
        b.j = 20;
        b.print(A.i);
    }
}