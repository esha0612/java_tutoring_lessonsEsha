public class MCQ3 {
    public static void main(String[] args) {
        method(null);
       }
       public static void method(Object o) {
        System.out.println("Object method");
       }
       public static void method(String s) {
        System.out.println("String method");
       }
}

// The output will be:
// 1. Object method
// 2. String method
// 3. Compilation fails
// 4. None of the above