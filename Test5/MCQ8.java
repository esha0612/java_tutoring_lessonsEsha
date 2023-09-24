class A {
    public A(int x) {
        System.out.println("A");
    }
}

class B extends A {
    public B(char c) {
        System.out.println("B"); //super() is called, but there is no default constructor in A
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
// 3. Compilation error --> correct answer
// 4. Runtime error
