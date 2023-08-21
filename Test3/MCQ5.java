public class MCQ5 {
    public static void main (String[] args) {
        String s1 = "Java";  
        String s2 = "Java";  
        StringBuilder sb1 = new StringBuilder();  
        sb1.append("Ja").append("va");  
        System.out.println(s1 == s2);  
        System.out.println(s1.equals(s2));  
        System.out.println(sb1.toString() == s1);  
        System.out.println(sb1.toString().equals(s1));
    }
}

// How many times will true be printed?
// 1. 0
// 2. 1
// 3. 2
// 4. 3
// 5. 4
// 6. None of the above