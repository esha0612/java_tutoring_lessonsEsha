class A
{
    int i = 10;

    void display()
    {
        System.out.println("Class A");
    }
}
 
class B extends A
{
    int i = 20;

    void display()
    {
        System.out.println("Class B");
    }
}
 
public class MCQ2
{    public static void main(String[] args)
    {
        A a = new B();
 
        System.out.println(a.i);
        // However, the following line will print "Class B" because of method overriding
        a.display();
    }
}

// The output will be:
// 1. 10 --> Correct answer
// 2. 20 
// 3. Compilation Error
// 4. Runtime Error
