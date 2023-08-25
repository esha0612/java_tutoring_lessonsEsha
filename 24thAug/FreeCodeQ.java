public class FreeCodeQ {
    protected static int num;

    public FreeCodeQ() {
        this.num = 0;
    }

    public FreeCodeQ(int num) {
        this.num = num;
    }

    public int factorial() {
        // compute factorial of this.num and return it

        return 0;
    }

    public static void main(String[] args) {
        FreeCodeQ f1 = new FreeCodeQ();
        FreeCodeQ f2 = new FreeCodeQ(5);
        f1.num = 10;
        f2.num = 5;
        // once you complete the factorial function, predict the output of the following:
        System.out.println("Factorial of f1.num: " + f1.factorial());
        System.out.println("Factorial of f2.num: " + f2.factorial());
    }
}