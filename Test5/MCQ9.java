class A {
    public int x;
    { x = 10; }

    public A() {
        this(5);
    }

    private A(int x) {
        this.x = x;
    }
}

class B extends A {
    public B() {
        this(10);
    }

    private B(int x) {
        super();
    }
}

public class MCQ9 {
    public static void main (String[] args) {
        A a = new B();
        System.out.println(a.x);
    }
}

// The output is:
// 1. 5 --> my guess
// 2. 10
// 3. Compilation error
// 4. Runtime error
