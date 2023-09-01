// Interfaces are used to simulate multiple inheritance in Java, which is not allowed with classes by default.
// Interfaces are also used to implement abstraction in Java.
// Interfaces are used to achieve loose coupling in Java.
// Interfaces are used to achieve total abstraction in Java.

// Interfaces are usually collections of abstract methods and static constants.

// An example follows:

import java.util.Random;

interface Animal {
    public void eat();
    public void travel();
}

// The above interface is implemented by the following class:
public class Mammal implements Animal {
    public void eat() {
        System.out.println("Mammal eats");
    }

    public void travel() {
        System.out.println("Mammal travels");
    }

    public int noOfLegs() {
        return new Random().nextInt(4);
    }

    public static void main(String args[]) {
        Mammal m = new Mammal();
        m.eat();
        m.travel();
        System.out.println(m.noOfLegs());
    }
}