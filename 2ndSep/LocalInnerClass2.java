class Outer {
    private int data = 10;

    public Outer(int data) {
        this.data = data;
    }

    protected int getData() {
        return data;
    }

    public void check() {
        Outer o = new Outer(5);
        // Outer o = new Outer(25);

        if (o.getData() < 20) {
            class Inner {
                public int getData() {
                    return o.getData();
                }
            }
            Inner i = new Inner();
            System.out.println(i.getData());
        }
        else {
            System.out.println("No data");
        }
    }
}

public class LocalInnerClass2 {
    public static void main(String[] args) {
        Outer o = new Outer(10);
        o.check();
    }
}