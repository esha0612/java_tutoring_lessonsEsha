class A
{
    String s = "Class A";
}
 
class B extends A
{
    String s = "Class B";
    
    // Hint: This is an instance initializer block. It is executed before the constructor of the class.
    {
        System.out.println(super.s);
    }
}
 
class C extends B
{
    String s = "Class C";
 
    {
        System.out.println(super.s);
    }
}
 
public class MCQ4
{
    public static void main(String[] args)
    {
        C c = new C();
 
        System.out.println(c.s);
    }
}

// Predict the output