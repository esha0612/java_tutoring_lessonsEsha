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

public class MCQ5 {
    public static void main(String[] args) {
        A a = (B) new A();
        a.show();
    }
}

// The output is:
// 1. A
// 2. B
// 3. Compilation error 
// 4. Runtime error ---> my guess, parent class cannot by typecasted to subclass
