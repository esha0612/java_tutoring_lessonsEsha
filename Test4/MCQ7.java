class M
{
    static
    {
        System.out.println('A');
    }
 
    {
        System.out.println('B');
    }
 
    public M()
    {
        System.out.println('C');
    }
}
 
class N extends M
{
    static
    {
        System.out.println('D');
    }
 
    {
        System.out.println('E');
    }
 
    public N()
    {
        System.out.println('F');
    }
}
 
public class MCQ7
{
    public static void main(String[] args)
    {
        N n = new N();
    }
}

// Predict the output
//C
//B
//A
//F
//E
//D
