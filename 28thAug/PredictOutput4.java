class SuperClass {
    SuperClass(int i) {
        System.out.println("Super");
    }
}

class SubClass extends SuperClass {
    SubClass() {
        this(10);
        System.out.println("Sub1");
    }

    SubClass(int i) {
        super(i);
        System.out.println("Sub2");
    }
}


public class PredictOutput4 {
    public static void main(String[] args) {
        SubClass s = new SubClass();
    }
}
