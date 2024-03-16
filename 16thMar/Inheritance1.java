class A {
    private int i;

    public A(int i) {
        this.i = i;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    protected void print() {
        System.out.println("A: " + i);
    }
}

class B extends A {
    static int i;

    public B(int i) {
        super(i); 
        i = 10; //refers to the i in the parameter
    }

    protected void print() {
        super.print();
        System.out.println("B: " + i);
    }
}

public class Inheritance1 {
    public static void main(String args[]) {
        A a = new B(20);
        a.print();
    }
}