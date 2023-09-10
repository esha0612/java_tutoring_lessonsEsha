// This is a simple program to demonstrate the use of Scanner class
// Scanner class is used to read input from the user via console or files (depends on the constructor used)
// Scanner class is present in java.util package

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ScannerIO {
    protected static void readFromConsole() throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        System.out.println("Enter your salary: ");
        double salary = sc.nextDouble();
        System.out.println("Name: " + name + "\nAge: " + age + "\nSalary: " + salary);
        sc.close();
    }

    protected static void readFromFile() throws IOException {
        Scanner sc = new Scanner(new File(System.getProperty("user.dir") + "\\input"));
        while (sc.hasNextLine()) {
            System.out.println("Name: " + sc.nextLine());
            System.out.println("Age: " + sc.nextInt());
            System.out.println("Salary: " + sc.nextDouble());
        }
        sc.close();
    }

    public static void main(String[] args) throws IOException {
        readFromConsole();
        readFromFile();
    }
}