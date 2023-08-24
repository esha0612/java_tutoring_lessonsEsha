public class MCQ12 {
    public static void main (String[] args) {
        int n = 89;
        System.out.println(n >> 1);
        System.out.println(n >> 2);
    }
}

// The output will be:
// 44 (89 in binary is 1011001, so 1011001 >> 1 = 101100 = 44)
// 22 (89 in binary is 1011001, so 1011001 >> 2 = 10110 = 22)
// Right shift by 1 is the same as dividing by 2
// Right shift by 2 is the same as dividing by 4 (or 2 * 2)