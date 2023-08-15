public class User_Defined {
    public static void string_utility_methods () {
        // user defined types
        // String is a user defined type
        // String is also a wrapper class
        // wrapper classes are classes that wrap around primitive types
        // String wraps around char, but the main wrapper class for char is called Character

        // String is the first user defined type we will learn
        // String is a sequence of characters
        // String has a bunch of utility methods as well as class variables like length
        // String is immutable, meaning once you create a String, you cannot change it
        // if you want to change a String, you have to create a new String
        // this is because String is a reference type, and reference types are immutable
        // we will learn more about reference types later

        // how do we create a String?
        // there are two ways
        // 1. using the new keyword (this is the conventional way to declare objects to any class)
        String s = new String("hello world");
        // 2. using the literal syntax (this is a special syntax for String, it is implicitly converted to the new keyword)
        String s2 = "hello world";
        // the literal syntax is more convenient, but it is not as flexible as the new keyword

        // how do we convert a character array to a String?
        char[] c = {'h', 'e', 'l', 'l', 'o', ' ', 'w', 'o', 'r', 'l', 'd'};
        String s3 = new String(c);

        // how do we convert a String to a character array?
        char[] c2 = s3.toCharArray();

        // how do we get the length of a String?
        int length = s3.length();

        // how do we get a character at a specific index?
        // the format is String.charAt(index)
        char c3 = s3.charAt(0);

        // how do we get a substring?
        // the format is String.substring(startIndex, endIndex)
        String s4 = s3.substring(0, 5);

        // how do we compare two Strings?
        // the format is String.equals(String)
        boolean b = s3.equals(s4);

        // how do we compare two Strings ignoring case?
        // the format is String.equalsIgnoreCase(String)
        boolean b2 = s3.equalsIgnoreCase(s4);

        // how do we check if a String contains a substring?
        // the format is String.contains(String)
        boolean b3 = s3.contains("hello");

        // how do we check if two Strings are lexicographically equal? (returns positive if s3 > s4, negative if s3 < s4, 0 if s3 == s4)
        // the format is String.compareTo(String)
        int i = s3.compareTo("hello vorld");
        System.out.printf("Difference between %s and %s is i = %d\n", s3, s4, i);

        // how do we check if a String starts with a substring?
        // the format is String.startsWith(String)
        boolean b4 = s3.startsWith("hello");

        // how do we check if a String ends with a substring?
        // the format is String.endsWith(String)
        boolean b5 = s3.endsWith("world");

        // how do we check if a String is empty?
        // the format is String.isEmpty()
        boolean b6 = s3.isEmpty();

        // how do we check if a String is null?
        // the format is String == null
        boolean b7 = s3 == null;

        // how do we reverse a String?
        // the format is String.reverse()
        // this method is not available in the String class
        // we have to use the StringBuilder class
        StringBuilder sb = new StringBuilder(s3);
        sb.reverse();
        String s5 = sb.toString();

        // how do we convert a String to uppercase?
        // the format is String.toUpperCase()
        String s6 = s3.toUpperCase();

        // how do we convert a String to lowercase?
        // the format is String.toLowerCase()
        String s7 = s3.toLowerCase();

        // how do we replace a character in a String?
        // the format is String.replace(char, char)
        String s8 = s3.replace('h', 'j');

        // how do we replace a substring in a String?
        // the format is String.replace(String, String)
        String s9 = s3.replace("hello", "goodbye");

        // how do we trim a String?
        // the format is String.trim()
        String s10 = "   hello world   ";
        String s11 = s10.trim();

        // how do we split a String based on a delimiter?
        // the format is String.split(String regex)
        String[] s12 = s3.split(" ");
    }

    // write a method that takes in a String and returns the number of vowels in the String
    public static int return_vowel_count (String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' ||s.charAt(i) == 'o' || s.charAt(i) == 'u')
                count++;
        }
        return count;
    }

    // write a method that takes in a String, trims it, and finds out the number of occurrences of the word "and"
    public static int return_and_count (String s) {
        int count = 0;
        String[] s2 = s.trim().split(" ");
        for (String str : s2){
            if (str.equals("and"))
                count++;            
        }
        return count;
    }


    public static void main (String[] args) {
        // call return_vowel_count here
        System.out.println("vowel count : " + return_vowel_count("hello world"));

        // call return_and_count here
        System.out.println("and count : " + return_and_count("hello and world and and"));
    }
}
