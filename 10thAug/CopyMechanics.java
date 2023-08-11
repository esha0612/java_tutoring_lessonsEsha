import java.util.Arrays;

public class CopyMechanics {
    public static int[] modify (int[] x) {
        x[0] = 10;
        return x;
    }

    public static int[] modify2 (int[] x) {
        x = new int[2];
        x[0] = 10;
        x[1] = 10;
        return x;
    }

    public static int modify3 (int y) {
        y = 10;
        return y;
    }

    public static void main (String [] args) {
        int[] x = { 5, 10 };
        System.out.println("The value of x is: " + Arrays.toString(x));
        System.out.println("The value of x returned from the function is: " + Arrays.toString(modify(x)));
        System.out.println("The value of x after calling the function is: " + Arrays.toString(x));

        x[0] = 5;
        System.out.println("The value of x is: " + Arrays.toString(x));
        System.out.println("The value of x returned from the function is: " + Arrays.toString(modify2(x)));
        System.out.println("The value of x after calling the function is: " + Arrays.toString(x));

        int y = 5;
        System.out.println("The value of y is: " + y);
        System.out.println("The value of y returned from the function is: " + modify3(y));
        System.out.println("The value of y after calling the function is: " + y);
    }
}
