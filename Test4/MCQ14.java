abstract class A
{
    int i = 10;
    void methodOfA()
    {
        abstract class B
        {
            void methodOfB()
            {
                System.out.println(i);
            }
        }
    }
}

public class MCQ14
{
    public static void main(String[] args)
    {
        A a = new A()
        {
            void methodOfA()
            {
                System.out.println(i++);
            }
        };
        a.methodOfA();
    }
}

// Predict the output