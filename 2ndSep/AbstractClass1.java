abstract class Initial {
    // Since we cannot declare objects for an abstract class, why bother having a constructor at all?
    // Despite the fact that we cannot create objects for an abstract class, we can still have a constructor
    // This is to initialize the variables of the abstract class when we create an object for the subclass
    // The subclass needs to be able to call the constructor of the abstract class using the super keyword

    public Initial() {
        System.out.println("Constructor of AbstractClass1");
    }

    public void method1() {
        System.out.println("Method 1 of AbstractClass1");
    }

    // Abstract methods are methods that do not have a body
    // They are declared using the abstract keyword
    // They are used to enforce the subclasses to implement the method
    // If a subclass does not implement the abstract method, it will be an abstract class itself
    // Abstract methods can only be declared in abstract classes
    public abstract void method2();
}

public abstract class AbstractClass1 extends Initial {
    public AbstractClass1() {
        // super() is called implicitly if we do not call it explicitly
        System.out.println("Constructor of AbstractClass2");
    }

    /* public void method2() {
        System.out.println("Method 2 of AbstractClass2");
    } */

    public static void main(String[] args) {
        // We cannot create objects for an abstract class
        // Initial obj = new Initial();
    }
}