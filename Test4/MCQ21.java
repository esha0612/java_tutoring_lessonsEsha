class A {
    protected static int i;
}

public class MCQ21 {
    public static void main (String[] args) {
        System.out.println(A.i);
    }
}

// The output will be:
// 1. 0 --> Correct (becuase java provides a default value of 0 to static variables in a static block)
// 2. Garbage value
// 3. Compile time error
// 4. Runtime error