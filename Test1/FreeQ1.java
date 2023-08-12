/* 
 * The purpose of the first programme is to have a class called Signboard
 * The signboard class has a constructor that takes in 2 parameters, a String and an int
 * The String is the message to be displayed on the signboard
 * The int is the maximum number of characters per line allowed on the signboard
 * The first method, getNumLines, returns the number of lines required to display the message
 * The second method, displayMessage, displays the message as it would appear on the signboard (aka with the correct number of lines)
 * Each line should be trimmed of any leading or trailing whitespace
 * For example, if the message is "Hello World" and the maximum number of characters per line is 5, the message would be displayed as:
 * Hello
 * World
 * Your code should work for any message and any maximum number of characters per line
 * You may assume that the message will not contain any newline characters
 * Your task is to complete the getNumLines and displayMessage methods
 */

class Signboard {
    private String message;
    private int maxCharsPerLine;

    // constructor
    public Signboard(String message, int maxCharsPerLine) {
        this.message = message;
        this.maxCharsPerLine = maxCharsPerLine;
    }

    protected int getNumLines() {
        int numLines = 0;
        // your code here

        return numLines;
    }

    protected String displayMessage() {
        String display = "";
        // your code here

        return display;
    }

    public static void main(String[] args) {
        Signboard signboard = new Signboard("Hello World", 5);
        signboard.displayMessage();
    }
}