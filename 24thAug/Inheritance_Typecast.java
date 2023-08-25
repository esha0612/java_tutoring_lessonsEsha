class A {
    private int i;

    // constructors
    public A() {
        i = 10;
    }

    public A(int i) {
        this.i = i;
    }

    // setters and getters
    public void setI(int i) {
        this.i = i;
    }

    public int getI() {
        return i;
    }
    
    public void show() {
        System.out.println("i = " + i);
    }
}

class B extends A {
    private int j;

    // constructors
    public B() {
        super();
        j = 20;
    }

    public B(int i, int j) {
        super(i);
        this.j = j;
    }

    // setters and getters
    public void setJ(int j) {
        this.j = j;
    }

    public int getJ() {
        return j;
    }
    
    public void show() {
        System.out.println("i and j = " + getI() + " " + j);
    }
}

// testing class
public class Inheritance_Typecast {
    public static void main (String[] args) {
        // normal procedure
        A a = new A(100);
        B b = new B(200, 400);
        a.show();
        b.show();
        System.out.println("Members of a: " + a.getI());
        System.out.println("Members of b: " + b.getI() + " " + b.getJ());

        // typecasting between classes

        // typecasting subclass object to base class is not only allowed but it is implicit
        A a1 = new B();
        // this object will behave like an object of the subclass
        a1.show();

        // typecasting base class object to subclass explicitly (implicit will give a compile time error)
        // is allowed by the compiler, but will give you a **runtime error**
        // this is because the object types for classes are checked at runtime
        B b1 = (B) new A();
        b1.show();
    }
}