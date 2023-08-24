import java.util.Arrays;

public class MCQ2 {
    public static void main(String[] args) throws Exception {
        char[] chars = new char[] {'\u0097'};
        System.out.println(Arrays.toString(chars));
        String str = new String(chars);
        System.out.println(str);
        byte[] bytes = str.getBytes();
        System.out.println(Arrays.toString(bytes));
        System.out.println(new String(bytes));
    }
}

// Predict the output of the code snippet above.
// The lesson here is that you should never use the default platform encoding when converting bytes to characters or vice versa.
// The default platform encoding is dependent on the platform on which the code is running.
// If you want to convert bytes to characters or vice versa, always specify the encoding explicitly.
// In this case, the encoding is UTF-8.
// Also, converting a character to a byte and back to a character is not guaranteed to give you the same character.
// This is because the byte representation of a character is dependent on the encoding.
// Also also, converting a character array to a string adds a trailing null character to the string.
// This is because the String constructor takes a char array as an argument, and the char array is null-terminated.