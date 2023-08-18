public class MCQ3 {
    public static void main(String[] arr){
        Integer num1 = 100; //not int!
        Integer num2 = 100;
        Integer num3 = 500;
        Integer num4 = 500;
          
        if(num1 == num2){
            System.out.println("num1 == num2");
        }
        else{
            System.out.println("num1 != num2");
        }
        if(num3 == num4){
            System.out.println("num3 == num4");
        }
        else{
            System.out.println("num3 != num4");
        }
    }
}

// This has no choices, just predict your answer in a comment and we shall discuss it in class.

// Trick:
// The output will be:
// 1. num1 == num2
// 2. num3 != num4

// Explanation:
// The reason for this is that the Integer class caches values between -128 and 127 for reuse.
// So autoboxing will return the same reference for num1 and num2, but not for num3 and num4 because they are outside the caching range.
// All the num variables are actually references to Integer objects, not primitive int values (aka normal variables).
// The == operator here compares the references, not the values.
// The expected output here would have been num1 != num2 and num3 != num4.
// But due to autoboxing, the == operator returns true for num1 and num2 since they are both references to the same cached Integer object.