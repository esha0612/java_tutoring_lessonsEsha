class M
{
    int i;
 
    public M(int i)
    {
        this.i = i--;
    }
}
 
class N extends M
{
    public N(int i)
    {
        super(++i);
 
        System.out.println(i);
    }
}
 
public class MCQ8
{
    public static void main(String[] args)
    {
        N n = new N(26);
    }
}

// The output is:
// 1. 26
// 2. 27
// 3. 28
// 4. 29