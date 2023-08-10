public class primitive_dtypes {

    // The main method is the entry point of the program
    // public (access modifier): anyone can access this method
    // static: this method is associated with the class, not an object and can be called without creating an instance of the class
    // static: this also means that the method can't access any instance variables of the class
    // static: this also means there is only one copy of the method in memory
    // void (return type): this method doesn't return anything
    public static void main (String[] args) {

        // Primitive data types in Java
        // byte: 8-bit signed two's complement integer
        // short: 16-bit signed two's complement integer
        // int: 32-bit signed two's complement integer
        // long: 64-bit signed two's complement integer
        // float: 32-bit IEEE 754 floating point
        // double: 64-bit IEEE 754 floating point
        // boolean: true or false
        // char: 16-bit Unicode character

        byte b = 127;
        // this is called type casting (implicit casting)
        // the compiler automatically converts the byte to a short
        // impicit casting is possible because a short can hold a larger value than a byte
        short s = b;

        System.out.println("byte: " + b);
        System.out.println("short: " + s);

        s = 32767;
        System.out.println("short changed: " + s);

        // this is called type casting (explicit casting)
        // the compiler doesn't automatically convert the short to a byte
        byte b2 = (byte) s;
        System.out.println("back to byte: " + b2);

        short s2 = b2;
        System.out.println("back to short: " + s2);

        boolean bool = false;
        System.out.println("boolean: " + bool);

        // ternary operator
        // boolean to int is not an allowed type cast, implicit or explicit
        int i = bool ? 1 : 0;
        System.out.println("int: " + i);

        // character to integer
        char c = '0';
        System.out.println("char: " + c);
        int i2 = c;
        System.out.println("convert to int: " + i2);

        // integer to character
        int i3 = 65;
        System.out.println("int: " + i3);
        char c2 = (char) i3;
        System.out.println("convert to char: " + c2);

        // a short example with the aforementioned info
        char c3 = 'A';
        System.out.println("char: " + c3);
        int i4 = c3;
        System.out.println("convert to int: " + i4);
        // we want to print true or false based on whether the character formed by adding these two is a letter in the alphabet
        System.out.println("is letter: " + (((c3 + i4) >= 95 && (c3 + i4) <= 122) || ((c3 + i4) >= 65 && (c3 + i4) <= 90)));
        // we can also check as characters and not integers
        System.out.println("is letter: " + (((char) (c3 + i4) >= 'a' && (char) (c3 + i4) <= 'z') || ((char) (c3 + i4) >= 'A' && (char) (c3 + i4) <= 'Z')));
        // another way to do this is using the isAlphabetic method of the Character class
        System.out.println("is letter: " + Character.isAlphabetic(c3 + i4));

        // using the Character class instead of primitive char
        Character c4 = 'A';
        System.out.println("char: " + c4);
        Integer i5 = 4;
        System.out.println("convert to int: " + i5);
        Integer i6 = Integer.valueOf(c4);
        System.out.println("convert to int: " + i6);
    }
}
