class A {
    protected void show() {
        System.out.println("A");
    }
}

class B extends A {
    public void show() {
        System.out.println("B");
    }
}

public class MCQ4 {
    public static void main(String[] args) {
        A a = (A) new B();
        a.show();
    }
}

// The output is:
// 1. A
// 2. B --> correct answer
// 3. Compilation error 
// 4. Runtime error --> my guess
