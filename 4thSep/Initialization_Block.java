class A {
    int a;

    public A () {
        System.out.println("Value of a: " + a);
    }

    {
        a = 10;
    }

    public A (int a) {
        this.a = a;
        System.out.println("Value of a: " + this.a);
    }
}

public class Initialization_Block {
    public static void main (String[] args) {
        A a1 = new A();
        A a2 = new A(20);
    }
}
