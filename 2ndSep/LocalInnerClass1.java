class Outer {
    private int dividend;
    private int divisor;

    public Outer() {
        dividend = 10;
        divisor = 2;
    }

    public Outer(int dividend, int divisor) {
        this.dividend = dividend;
        this.divisor = divisor;
    }

    protected void getValues() {
        class Inner {
            private int divisor;
            private int remainder;
            private int quotient;

            public Inner(int divisor) {
                this.divisor = divisor;
                quotient = dividend / divisor;
                remainder = dividend % divisor;
            }

            public int getDivisor() {
                return divisor;
            }

            public int getQuotient() {
                return quotient;
            }

            public int getRemainder() {
                return remainder;
            }
        }

        Inner inner = new Inner(this.divisor);
        System.out.println("Divisor: " + inner.getDivisor());
        System.out.println("Quotient: " + inner.getQuotient());
        System.out.println("Remainder: " + inner.getRemainder());
    }
}

public class LocalInnerClass1 {
    public static void main(String[] args) {
        Outer outer = new Outer(30, 3);
        outer.getValues();
    }
}
