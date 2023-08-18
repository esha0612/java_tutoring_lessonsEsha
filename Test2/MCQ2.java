public class MCQ2 {
    public static void main(String[] args) {
        System.out.println('j' + 'a' + 'v' + 'a');
    }
}

// The output will be:
// 1. java
// 2. 418 -> correct answer (add all ASCII values for each char)
// 3. 106
// 4. Compile time error


// Trick:
// Only strings get concatenated, the characters are simply added (after implicit conversion to int)