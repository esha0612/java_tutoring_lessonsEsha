import java.io.IOException;

public class TryCatch {
    // a try catch block is used to catch exceptions of any type
    // the try block is the code that may throw an exception
    // the catch block is the code that handles the exception
    // the catch block is only executed if an exception is thrown
    // an exception is thrown when the code in the try block encounters an error
    // the catch block is only executed if the exception thrown is of the same type as the catch block
    // if the exception thrown is not of the same type as the catch block, the exception is passed to the next try catch block
    // if no try catch block catches the exception, the program terminates
    // the finally block is executed regardless of whether an exception is thrown or not
    // the finally block is usually used to close resources (e.g. files, sockets, etc.)
    // the finally block is executed after the try block and any catch blocks
    // the finally block is executed before the next try catch block
    // exceptions are errors that occur during the execution of a program (e.g. divide by zero, out of bounds, etc.) at runtime
    // if we dont know the specific type of exception that may be thrown, we can use the Exception class
    public static void main(String[] args) {
        try {
            int x = 5;
            System.out.println(x/0);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException");
        /* } catch (IOException e) {
            System.out.println("IOException"); */
        } catch (Exception e) {
            System.out.println("Exception");
        } finally {
            System.out.println("Finally");
        }
    }
}