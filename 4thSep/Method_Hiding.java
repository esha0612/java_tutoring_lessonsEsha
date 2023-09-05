/* Java program to show that if static method is redefined by
   a derived class, then it is not overriding, but instead method hiding */
 
// Superclass
class Base {
    // Static method in base class which will be hidden in subclass
    public static void display() {
        System.out.println("Static or class method from Base");
    }
     
     // Non-static method which will be overridden in derived class
     public void print()  {
         System.out.println("Non-static or Instance method from Base");
    }
}
 
// Subclass
class Derived extends Base {
     
    // This method is hidden by display() in Base
    public static void display() {
         System.out.println("Static or class method from Derived");
    }
    
    // This method overrides print() in Base
    public void print() {
         System.out.println("Non-static or Instance method from Derived");
   }
}

public class Method_Hiding {
    public static void main(String args[ ])  {
        // Base class reference to Derived class object
        Base obj1 = new Derived();
         
        // As per overriding rules this should call to class Derive's static
        // overridden method. Since static method can not be overridden, it
        // calls Base's display()
        obj1.display();
        // Here overriding works and Derive's print() is called
        obj1.print();

        // Derived class reference to Derived class object
        Derived obj2 = new Derived();
        // Here overriding works and Derive's display() is called
        obj2.display();
        // Here overriding works and Derive's print() is called
        obj2.print();

        // Direct calls, work as expected
        Base.display();
        Derived.display();
     }
}