class A {
    static int i;

    public A(int i) {
        this.i = i;
    }

    int getI() {
        return i;
    }

    void show() {
        System.out.println("i = " + i);
    }
}

class B extends A {
    static int i;

    public B(int i) {
        super(i++);
        i = 20; 
        this.i = i++ + super.i++;
    }

    void show() {
        super.show();
        System.out.println("i = " + i);
    }
}

public class Inheritance9 {
    public static void main(String[] args) {
        B b = new B(10);
        b.show();
    }
}