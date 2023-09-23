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

public class MCQ2 {
    public static void main(String[] args) {
        B b = (B) new A();
        b.show();        
    }
}

// The output is:
// 1. A
// 2. B
// 3. Compilation error
// 4. Runtime error ---> my guess (explicit type casting leads to runtime error)
