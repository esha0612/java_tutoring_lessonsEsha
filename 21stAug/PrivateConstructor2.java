class Singleton {
    private static Singleton instance;
    private String info;

    private Singleton() {
        info = "This is a Singleton class";
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    // getters
    public String getInfo() {
        return info;
    }
}

// test class
public class PrivateConstructor2 {
    public static void main(String[] args) {
        // Singleton s = new Singleton(); // error: Singleton() has private access in Singleton
        // The getInstance() method is static so we can call it without creating an object
        Singleton s = Singleton.getInstance();
        System.out.println(s.getInfo());
    }
}