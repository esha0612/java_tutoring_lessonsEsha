public class More_Varibles {
    public static void main (String args[]) {
        // first we do some conversions back and forth
        double d = 3.941592653589793238462643383279502884197169399375105820974944592307816406286;
        // double is a 64 bit floating point number
        // implicit conversion from double to int is not allowed in java because you lose precision
        // what about explicit conversion?
        int i = (int) d;
        System.out.println("i = " + i);

        // if we did want to round off a double to an int, we can use Math.round()
        i = (int) Math.round(d);
        System.out.println("i rounded off = " + i);

        // what about the other way around?
        i = 3;
        // this is allowed because you can convert an int to a double without losing precision, because double allocates more memory
        d = i;
        System.out.println("d = " + d);

        // what about float?
        float f = 3.141592653589793238462643383279502884197169399375105820974944592307816406286f;
        // float is a 32 bit floating point number
        double d2 = f;
        System.out.println("f = " + f);
        System.out.println("d2 from f = " + d2);

        // what about the other way around?
        f = (float) d2;
        System.out.println("f back from d2 = " + f);

        // A new example of double to float conversion
        double d3 = 3.141592653589793238462643383279502884197169399375105820974944592307816406286;
        float f2 = (float) d3;
        System.out.println("f2 = " + f2);

        // short and byte
        short s = 32767;
        byte b = (byte) s;
        System.out.println("s = " + s);
        System.out.println("b = " + b);

        // int and short
        int i2 = 2147483647;
        short s2 = (short) i2;
        System.out.println("i2 = " + i2);
        System.out.println("s2 = " + s2);

        // int and byte
        int i3 = 2147483647;
        byte b2 = (byte) i3;
        System.out.println("i3 = " + i3);
        System.out.println("b2 = " + b2);

        int i4 = -2147483647;
        short s3 = (short) i4;
        System.out.println("i4 = " + i4);
        System.out.println("s3 = " + s3);
        byte b3 = (byte) i4;
        System.out.println("b3 = " + b3);

        // double and long
        double d4 = 3.141592653589793238462643383279502884197169399375105820974944592307816406286;
        long l = (long) d4;
        System.out.println("d4 = " + d4);
        System.out.println("l = " + l);

        // long and int
        long l2 = 9223372036854775807L;
        int i5 = (int) l2;
        System.out.println("l2 = " + l2);
        System.out.println("i5 = " + i5);

        // int and byte part 2
        i3 = 2147483646;
        b2 = (byte) i3;
        System.out.println("i3 = " + i3);
        System.out.println("b2 = " + b2);
    }
}
