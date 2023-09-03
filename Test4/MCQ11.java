class One
{
    int x = 2121;
}
 
class Two
{
    int x = 1212;
 
    {
        System.out.println(x);
    }
}
 
public class MCQ11
{
    public static void main(String[] args)
    {
        Two two = new Two();
    }
}

// The output is:
// 1. 2121
// 2. 1212
// 3. Compilation error
// 4. Runtime error