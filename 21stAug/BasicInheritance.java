// This is an example of basic inheritance

class A {
    private int i;
    public int j;

    public A() {
        i = 10;
        j = 20;
    }

    // setter and getter
    public void set(int i, int j) {
        this.i = i;
        this.j = j;
    }

    public int getI() {
        return this.i;
    }

    public int getJ() {
        return this.j;
    }

    public void show() {
        System.out.println("i and j: " + i + " " + j);
    }
}

class B extends A {
    private int k;

    public B() {
        super();
        k = 30;
    }

    // setter and getter
    public void set(int i, int j, int k) {
        set(i, j);
        this.k = k;
    }

    public int getK() {
        return this.k;
    }

    public void show() {
        System.out.println("i and j and k:" + getI() + " " + j + " " + k);
    }

    public void sum() {
        System.out.println("i + j + k: " + (getI() + j + k));
    }
}

public class BasicInheritance {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();

        a.show();
        b.show();

        b.sum();
    }
}