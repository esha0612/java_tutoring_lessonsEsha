class A {
    private int i;
    protected int j;
    public int k;

    public A() {
        i = 10;
        j = 20;
        k = 30;
    }

    // getters
    public int getI() {
        return i;
    }

    public void show() {
        System.out.println("i and j and k: " + i + " " + j + " " + k);
    }
}

class B extends A {
    private int l;

    public B() {
        super();
        l = 40;
    }

    public void show() {
        // This will give error as i is private in A
        // System.out.println("i and j and k and l: " + i + " " + j + " " + k + " " + l);
        System.out.println("i and j and k and l: " + getI() + " " + j + " " + k + " " + l);
    }
}

public class BasicInheritance2 {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();

        a.show();
        b.show();
    }
}