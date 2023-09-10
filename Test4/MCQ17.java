public class MCQ17  
{    
    static  
    {  
        System.out.println("Static Block-1");  
    }  

    public static void main(String args[])  
    {    
        System.out.println("Main Method");    
    }    

    static  
    {  
        System.out.println("Static Block-2");  
    }
} 

// Predict the output
// Static Block-1
// Static Block-2
// Main Method

// Static blocks are called first since they are called when the class is loaded into memory.
// If there are multiple static blocks, then they are executed in procedural order.