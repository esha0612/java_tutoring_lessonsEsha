public class PredictOutput2 {
    PredictOutput2() {
        this(null);
        System.out.println(0);
    }    

    PredictOutput2(Object o) {
        this(null, null);
        System.out.println(o + " - obj");
    }

    PredictOutput2(String s) {
        this(null, null);
        System.out.println(s + " - str");
    }

    PredictOutput2(String s1, String s2) {
        System.out.println(s1 + " - str - " + s2);
    }

    PredictOutput2(Object o1, Object o2) {
        System.out.println(o1 + " - obj - " + o2);
    }

    public static void main(String[] args) {
        PredictOutput2 p = new PredictOutput2();
    }
}
