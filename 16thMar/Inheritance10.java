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
    static int j;

    public B(int i, String[] Args) {
        super(i++);
        i = 20; 
        this.i = i++ + super.i++;
        j = Args.length + ++super.i + ++i;
    }

    void show() {
        super.show();
        System.out.println("j = " + j);
    }
}

public class Inheritance10 {
    public static void main(String[] args) {
        B b = new B(10, args);
        b.show();
    }
}