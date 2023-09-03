abstract class Calculate
{
    abstract int add(int a, int b);
}
 
public class MCQ13
{
    public static void main(String[] args)
    {
        int result = new Calculate()
        {   
            @Override
            int add(int a, int b)
            {
                return a+b;
            }
        }.add(11010, 022011);
        System.out.println(result);
    }
}

// The output is:
// 1. 132021
// 2. 20235
// 3. Compilation error
// 4. Runtime error