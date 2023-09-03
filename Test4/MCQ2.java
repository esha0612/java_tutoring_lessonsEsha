class A
{
    int i = 10;
}
 
class B extends A
{
    int i = 20;
}
 
public class MCQ2
{    public static void main(String[] args)
    {
        A a = new B();
 
        System.out.println(a.i);
    }
}

// The output will be:
// 1. 10
// 2. 20
// 3. Compilation Error
// 4. Runtime Error