class Test {
 
    static int i;
    int j;
 
    // Hint: This is a static block. It is executed before the main method.
    static
    {
        i = 10;
        System.out.println("static block called ");
    }

    // Hint: This is a non-static block. It is executed before the constructor.
    {
        j = 20;
        System.out.println("non-static block called");
    }
}
 
public class MCQ5 {
    public static void main(String args[])
    {
        System.out.println(Test.i);
    }
}

// Predict the output:
// static block is called
// 10
