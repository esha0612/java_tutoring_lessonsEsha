public class MCQ9 {
    public static void main (String[] args) {
        int n = 5;
        System.out.println(n & 1);
    }
}

// The output will be:
// 1. 0
// 2. 1 --> Correct (5 in binary is 101, so the last bit is 1, anything & 1 will be 1)
// 3. 6
// 4. Compilation error