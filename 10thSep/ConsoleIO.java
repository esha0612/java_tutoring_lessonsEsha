// This is a simple program to demonstrate the use of Console class
// Console class is used to read input from the user via console
// Console class is present in java.io package
// Console class is faster than Scanner class as it reads the input as a stream of characters
// However, it is not type safe due to stream reading

import java.io.IOException;

public class ConsoleIO {
    public static void main(String[] args) throws IOException {
        java.io.Console console = System.console();
        System.out.println("Enter your name: ");
        String name = console.readLine();
        System.out.println("Enter your age: ");
        int age = Integer.parseInt(console.readLine());
        System.out.println("Enter your salary: ");
        double salary = Double.parseDouble(console.readLine());
        System.out.println("Name: " + name + "\nAge: " + age + "\nSalary: " + salary);
    }
}
