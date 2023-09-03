class Test {
 
    static int i;
    int j;
 
    // Hint: This is a static block. It is executed before the main method.
    static
    {
        i = 10;
        System.out.println("static block called ");
    }
}
 
public class MCQ5 {
    public static void main(String args[])
    {
        System.out.println(Test.i);
    }
}

// Predict the output