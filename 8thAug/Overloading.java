public class Overloading {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        print();
    }

    // this method is overloaded
    // overloaded methods have the same name but different parameters
    // overloaded methods can have different return types
    // overloaded methods can have different access modifiers
    // overloaded methods can throw different exceptions
    // overloaded methods can have different method bodies
    public static void main (int i) {
        System.out.println("Hello World! :" + i);
    }

    public static void main (char c) {
        System.out.println("Hello World! :" + c);
    }

    public static void main (String args) {
        System.out.println("Hello World! :" + args);
    }

    public static void main (String args, int i) {
        System.out.println("Hello World! :" + args + i);
    }

    public static void print() {
        main(5);
    }
}

class Overloading2 {
    public static void main(String[] args) {
        System.out.println("Hello World2!");

        // we can call the overloaded method from other classes too
        // we can do this with any class in the same package
        Overloading.main(5);
        //Overloading.main(null);
        Overloading.main("Hello");
        Overloading.main("Hello", 5);
    }
}
