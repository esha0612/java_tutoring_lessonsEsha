class A {
    private static int i;

    public static void print() {
        System.out.println("i: " + i);
    }

    protected int getI() {
        return i;
    }
}

class B extends A {
    protected static int i;

    public static void print() {
        System.out.println("i: " + i);
    }

    protected int getI() {
        return i;
    }
}

class C extends B {
    protected static int i;

    public static void print() {
        System.out.println("i: " + i);
    }

    protected int getI() {
        return i;
    }
}

class D extends C {
    public static void print() {
        System.out.println("i: " + i);
    }

    protected int getI() {
        return i;
    }
}

public class Inheritance20 {
    public static void main(String[] args) {
        B b = new D();

        b.i = 10;
        ((D)((C)b)).i = 20;
        ((C)b).i = 30;
        ((B)b).i = 40;
        b.print();
        System.out.println(b.getI());
        System.out.println(((D)((C)b)).i);
        System.out.println(((C)b).i);
        System.out.println(((B)b).i);
        System.out.println(((A)b).getI());
        System.out.println(((B)b).getI());
        System.out.println(((C)b).getI());
        System.out.println(((D)b).getI());
        System.out.println((new A()).getI());
        System.out.println((new B()).getI());
        ((D)((C)b)).i = 50;
        b.print();
        System.out.println((new D()).getI());
        System.out.println((new C()).getI());
        System.out.println((new B()).getI());
    }
}