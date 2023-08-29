// This is a class which determines the order of constructor calling in case of inheritance

class A {
    A() {
        System.out.println("A");
    }
}

class B extends A {
    B() {
        super();
        System.out.println("B");
    }
}

class C extends B {
    C() {
        super();
        System.out.println("C");
    }

    protected void newLine() {
        System.out.println("----\n");
    }
}

// This is multi-level inheritance

public class ConstructorOrder {
    public static void main(String[] args) {
        C c = new C();
        c.newLine();
    }
}