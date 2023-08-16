// In this section we will be discussing user defined data types
// Let's start with classes as they are the most common user defined data type

// Classes are a blueprint for creating objects
// They can contain data members and functions
// Data members are variables that are associated with a class
// Functions are also known as methods
// They are used to manipulate the data members of the class

// Let's create a class called Person
// We will give it 2 data members, name and age
// We will also give it 2 methods, one to set the name and age and one to print the name and age

import java.util.ArrayList;

class Person {
    // Data members
    private String name;
    private int age;

    // Methods

    // This is called a constructor
    // It is used to initialize the data members of the class
    // It has the same name as the class
    // It does not have a return type
    // It can be overloaded
    // Default constructor
    public Person() {
        this.name = "Default";
        this.age = 0;
    }

    // Parameterized constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy constructor
    public Person(Person p) {
        this.name = p.name;
        this.age = p.age;
    }

    public void printNameAndAge() {
        System.out.println("Name: " + name + " Age: " + age);
    }

    // Setter method
    public void setNameAndAge(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter method
    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }
}

// Testing class
public class UserDefined {
    public static void main (String [] args) {

        // We create an object of the Person class
        // This is called instantiation
        // The object is called an instance of the class
        // When we create an object, the constructor is called
        Person p1 = new Person();
        // We can print the data members of the class
        p1.printNameAndAge();

        // Create a second object of the Person class with the parameterized constructor
        Person p2 = new Person("John", 20);
        p2.printNameAndAge();

        // Create a third object of the Person class with the copy constructor
        Person p3 = new Person(p2);
        p3.printNameAndAge();

        // We can use this Person class to create an array of Person objects
        Person [] arr = new Person[3];
        arr[0] = p1;
        arr[1] = p2;
        arr[2] = p3;
        // We can print the name and age of the Person objects in the array
        for (int i = 0; i < arr.length; i++) {
            arr[i].printNameAndAge();
        }

        // We can also do this with ArrayLists
        // ArrayLists are dynamic arrays
        ArrayList<Person> list = new ArrayList<Person>();
        list.add(p1);
        list.add(p2);
        list.add(p3);
        // We can print the name and age of the Person objects in the ArrayList
        list.forEach((person) -> {
            person.printNameAndAge();
        });

        // We can use the setter method to change the name and age of the Person object after instantiation
        p1.setNameAndAge("Jane", 30);
        p1.printNameAndAge();

        // We cannot directly access the data members of the class
        // System.out.println(p1.name); // This will give an error

        // We can use the getter method to access the data members of the class
        System.out.println(p1.getName());
        System.out.println(p1.getAge());
    }
}