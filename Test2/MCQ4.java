package Test2;

public class MCQ4 {
    public static void main(String[] arr){
          System.out.println("String main");
    }
    public static void main(String arr){
          System.out.println("String[] main");
    }
}

// The output will be:
// 1. String[] main
// 2. String main
// 3. Compilation error
// 4. Runtime error