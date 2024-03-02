class A {
    int i;

    void print() {
        System.out.println("i: " + i);
    }

    void print(int i) {
        System.out.println("i: " + i);
    }
}

class B extends A {
    int i;

    void print() {
        System.out.println("i: " + i);
    }

    void print(Object o) {
        if (o instanceof A) {
            System.out.println("i: " + ((A)o).i);
        } else if (o instanceof B) {
            System.out.println("i: " + ((B)o).i);
        } else if (o instanceof Integer) {
            System.out.println("i: " + (Integer)o);
        } else {
            System.out.println("i: " + o);
        }
    }
}

public class Inheritance19 {
    public static void main (String[] args) {
        A a = new B();
        ((B)a).i = 10;
        a.i = 20;
        a.print();
        a.print(30);
        ((B)a).print();
        ((B)a).print(40);
        ((B)a).print("hello");
    }
}