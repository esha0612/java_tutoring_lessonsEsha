class A
{
    static
    {
        System.out.println("THIRD");
    }
}
 
class B extends A
{
    static
    {
        System.out.println("SECOND");
    }
}
 
class C extends B
{
    static
    {
        System.out.println("FIRST");
    }
}
 
public class MCQ6
{
    public static void main(String[] args)
    {
        C c = new C();
    }
}

// The output is:
// 1. FIRST SECOND THIRD
// 2. THIRD SECOND FIRST --> my guess
// 3. THIRD FIRST SECOND
// 4. Compile time error
