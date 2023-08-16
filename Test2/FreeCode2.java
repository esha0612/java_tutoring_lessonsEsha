package Test2;

public class FreeCode2 {
    // This problem deals with the String class.
    // A pangram is a sentence containing every letter in the English Alphabet.
    // This class has a class variable called message that is a String.
    // Write a method called isPangram that returns true if the message is a pangram and false otherwise.
    // Do not assume the case of the letters in the message. The string may also have punctuation.
    // Your task is to implement the method isPangram which checks if the message is a pangram.

    private String message;

    public FreeCode2(String message) {
        this.message = message;
    }

    public boolean isPangram() {
        boolean isPangram = false;
        // your code here

        return isPangram;
    }

    public static void main(String[] args) {
        FreeCode2 fc = new FreeCode2("The quick brown fox jumps over the lazy dog");
        System.out.println(fc.isPangram()); // should print true
        fc = new FreeCode2("The quick brown fox jumped over the lazy dog");
        System.out.println(fc.isPangram()); // should print false
        fc = new FreeCode2("The five boxing wizards jump quickly");
        System.out.println(fc.isPangram()); // should print true
        fc = new FreeCode2("The five boxing wizards jump quick");
        System.out.println(fc.isPangram()); // should print false
    }
}
