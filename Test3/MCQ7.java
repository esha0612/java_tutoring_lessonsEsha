public class MCQ7 {
    public static void main(String args[])  
    {  
        String str = "ONE" + 1 + 2 + "TWO" + "THREE" + 3 + 4 + "FOUR" + "FIVE" + 5;
        System.out.println(str);
    }  
}

// The output will be:
// 1. ONE3TWOTHREE7FOURFIVE5
// 2. ONE12TWOTHREE7FOURFIVE5
// 3. ONE3TWOTHREE34FOURFIVE5
// 4. ONETWOTHREEFOURFIVE15
// 5. ONE12TWOTHREE34FOURFIVE5 --> Correct (it behaves like a StringBuilder and appends the numbers to the string as if they were strings themselves)

