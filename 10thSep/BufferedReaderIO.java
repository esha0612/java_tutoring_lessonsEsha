// This class demonstrates the use of BufferedReader class 
// BufferedReader class is used to read input from the user via console or files (depends on the constructor used)
// BufferedReader class is present in java.io package
// BufferedReader class is faster than Scanner class as it reads the input as a stream of characters
// However, it is not type safe due to stream reading

import java.io.BufferedReader;
import java.io.IOException;

public class BufferedReaderIO {
    protected static void readFromConsole() throws IOException {
        BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
        System.out.println("Enter your name: ");
        String name = br.readLine();
        System.out.println("Enter your age: ");
        int age = Integer.parseInt(br.readLine());
        System.out.println("Enter your salary: ");
        double salary = Double.parseDouble(br.readLine());
        System.out.println("Name: " + name + "\nAge: " + age + "\nSalary: " + salary);
        br.close();
    }

    protected static void readFromFile() throws IOException {
        BufferedReader br = new BufferedReader(new java.io.FileReader(System.getProperty("user.dir") + "\\input"));
        String line;
        while ((line = br.readLine()) != null) {
            System.out.println("Name: " + line);
            System.out.println("Age: " + Integer.parseInt(br.readLine()));
            System.out.println("Salary: " + Double.parseDouble(br.readLine()));
        }
        br.close();
    }

    public static void main(String[] args) throws IOException {
        readFromConsole();
        readFromFile();
    }
}