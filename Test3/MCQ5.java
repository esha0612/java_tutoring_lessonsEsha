public class MCQ5 {
    public static void main (String[] args) {
        String s1 = "Java";
        String s2 = "Java";
        StringBuilder sb1 = new StringBuilder();  
        sb1.append("Ja").append("va");
        // line 9 prints true due to String Pool (String literals are stored in a pool), similar to autoboxing for primitive types
        // if they are the same literal, they will point to the same location in memory
        System.out.println(s1 == s2); //checks if they are same reference (aka if they point to the same location in memory)
        System.out.println(s1.equals(s2));
        // line 12 prints false because StringBuilder does not use String Pool, but rather creates a new object
        System.out.println(sb1.toString() == s1);  
        System.out.println(sb1.toString().equals(s1));
    }
}

// How many times will true be printed?
// 1. 0
// 2. 1
// 3. 2
// 4. 3 --> Correct because s1 == s2, s1.equals(s2), and sb1.toString().equals(s1)
// 5. 4
// 6. None of the above