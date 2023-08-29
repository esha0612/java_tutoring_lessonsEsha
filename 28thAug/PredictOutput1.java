public class PredictOutput1 {
    PredictOutput1() {
        this(10);
        System.out.println(0);
    }

    PredictOutput1(int x) {
        this(10, 20);
        System.out.println(x);
    }

    PredictOutput1(int x, int y) {
        System.out.println(x + y);
    }

    public static void main(String[] args) {
        PredictOutput1 p = new PredictOutput1();
    }
}
