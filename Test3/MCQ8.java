public class MCQ8 {
    public static void main (String[] args) {
        long l1 = 1000*60*60*24*365L;  
        long l2 = 1000*60*60*34*365;  
        System.out.println(l1);
        System.out.println(l2);
    }
}

// Predict the output of the code snippet above. You may use a calculator.
// The output will be:
// 31536000000
// 1726327040 (for this one, the value is treated as int and overflows, so the JRE truncates in binary to bring it close to INT_MAX)