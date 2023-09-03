interface I1 {
    static void m1() {
        System.out.println("I1");
    }
}

public class MCQ15 {
    public static void main(String[] args) {
        I1.m1();
    }
}

// The output is:
// 1. I1
// 2. Compilation error
// 3. Runtime error
// 4. No output