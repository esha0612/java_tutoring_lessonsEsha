public class MCQ1 {
    static int a = 10;
    public static void main(String args[]){
        MCQ1 s1 = new MCQ1();
        MCQ1 s2 = new MCQ1();
        System.out.println("s1.a value :"+s1.a);
        System.out.println("s2.a value :"+s2.a);
        s1.a=20;
        System.out.println("s1.a value :"+s1.a);
        System.out.println("s2.a value :"+s2.a);
    }
}

// Predict the output
// 10
// 10
// 20
// 20
