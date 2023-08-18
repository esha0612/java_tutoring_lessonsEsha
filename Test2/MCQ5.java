public class MCQ5 {
    public static void main(String args[])  
    {  
        int i=20+ +9- -12+ +4- -13+ +19; 
        // This is simply a confusing way to write the following:
        // int i = 20 + (+9) - (-12) + (+4) - (-13) + (+19);
        System.out.println(i);  
    }
}

// The output for the code will be:
//  1. 77 -> correct answer (treat it like normal expression)
//  2. 33
//  3. Compile time error
//  4. 66