public class PrivateConsructor1 {
    private int i;

    private PrivateConsructor1() {
        i = 10;
    }

    public void show() {
        System.out.println("i: " + i);
    }

    public static void main(String[] args) {
        // This will give error as constructor is private
        PrivateConsructor1 p = new PrivateConsructor1();
        p.show();
    }
}
