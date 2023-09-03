class A
{
    void A()
    {
        System.out.println(1);
    }
}
 
class B extends A
{
    void B()
    {
        A();
    }
}
 
public class MCQ9
{
    public static void main(String[] args)
    {
        new B().B();
    }
}

// The output is:
// 1. 1
// 2. Compilation error
// 3. Runtime error
// 4. No output