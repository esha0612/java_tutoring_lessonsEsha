class A {
    public A(int x) {
        System.out.println("A");
    }
}

class B extends A {
    public B(char c) {
        System.out.println("B");
    }
}

public class MCQ8 {
    public static void main(String[] args) {
        A a = new B('c');
    }
}

// The output is:
// 1. A
// 2. B --> my guess
// 3. Compilation error 
// 4. Runtime error
