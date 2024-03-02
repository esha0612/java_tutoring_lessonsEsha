class Base {
    public void Print() {
        System.out.println("Base");
    }         
}
 
class Derived extends Base {    
    public void Print() {
        System.out.println("Derived");
    }
}
 
public class Inheritance17 {
    public static void DoPrint( Base o ) {
        System.out.println("Base Print called");
        o.Print();   
    }
    public static void DoPrint(Derived o) {
        System.out.println("Derived Print called");
        o.Print();   
    }
    public static void DoPrint(Object o) {
        System.out.println("Object Print called");
        System.out.println("Object");
    }
    public static void main(String[] args) {
        Base x = new Base();
        Base y = new Derived();
        Derived z = new Derived();
        DoPrint(x);
        DoPrint(y);
        DoPrint(z);
        DoPrint((Base)z);
        DoPrint((Derived)y);
        // DoPrint((Derived)x); // subclass reference to superclass object is not allowed
        DoPrint("hello");
    }
}