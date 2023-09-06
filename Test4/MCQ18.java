import java.util.Arrays;

public class MCQ18
{  
    public static void main(String args[])   
    {  
        String str="Java|Python|Hadoop";  
        String[] array = str.split("\\|");  
        System.out.println(Arrays.toString(array));  
    }  
}

// The output is:
// 1. [Java, Python, Hadoop]
// 2. [Java|Python|Hadoop]
// 3. [Java\\|Python\\|Hadoop] --> my guess
// 4. [Java\\ Python\\ Hadoop]
