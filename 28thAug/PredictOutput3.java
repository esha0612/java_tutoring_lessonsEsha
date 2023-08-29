public class PredictOutput3 {
    PredictOutput3() {
        System.out.println("Constructor");
    }

    PredictOutput3(int x) {
        System.out.println(x);
    }

    static int PredictOutput3() {
        return 10;
    }

    static String PredictOutput3(int x) {
        return "Hello";
    }

    public static void main(String[] args) {
        PredictOutput3 p = new PredictOutput3();
        System.out.println(p.PredictOutput3());
        System.out.println(PredictOutput3.PredictOutput3(10));
        System.out.println(PredictOutput3.PredictOutput3());
    }
}
