// Let's try an ArrayList of the simplest type: Integer

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList1 {
    public static void main (String[] args) {
        // Notice that we are using the wrapper class Integer, not the primitive type int
        // This is because ArrayLists can only store objects, not primitive types
        // So this is a point to remember for primitive types, pass the appropriate wrapper class as a template
        ArrayList<Integer> list = new ArrayList<Integer>();

        // Adding elements to the ArrayList
        list.add(1);
        list.add(2);
        list.add(3);

        // Printing the ArrayList so far
        System.out.println("ArrayList so far :" + list + "\n");

        // Adding an element at a specific index - the format is list.add(index, element)
        // Unlike arrays, ArrayLists are dynamic, so we can add elements at any index
        // Also unlike arrays, inserting an element at a specific index does not overwrite the element at that index
        // Instead, it shifts all the elements after that index to the right by one position
        list.add(1, 4);

        // Printing the ArrayList so far
        System.out.println("ArrayList so far: " + list + "\n");

        // Removing an element at a specific index - the format is list.remove(index)
        // This also shifts all the elements after that index to the left by one position
        list.remove(1);

        // Printing the ArrayList so far
        System.out.println("ArrayList so far: " + list + "\n");

        // Getting the element at a specific index - the format is list.get(index)
        // This does not remove the element at that index
        // This is what we typically use to access elements in an ArrayList during iteration
        System.out.println("Element at index 1: " + list.get(1) + "\n");

        // Getting the size of the ArrayList - the format is list.size()
        // This is what we typically use to access the size of an ArrayList during iteration
        System.out.println("Size of the list: " + list.size() + "\n");

        // Iterating over the ArrayList
        // Obviously, we can use a for loop to iterate over the ArrayList
        // But we can also use the enhanced for loop, which is much more convenient

        // First the old for loop
        System.out.println("Iterating over the ArrayList using a for loop:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i) + " ");
        }
        System.out.println();

        // Now the enhanced for loop
        System.out.println("Iterating over the ArrayList using an enhanced for loop:");
        for (Integer i : list) {
            System.out.println(i + " ");
        }
        System.out.println();

        // Clearing the ArrayList - the format is list.clear()
        // This removes all the elements from the ArrayList
        list.clear();

        // Printing the ArrayList so far
        System.out.println("ArrayList so far: " + list + "\n");

        // Checking if the ArrayList is empty - the format is list.isEmpty()
        // This returns a boolean value
        System.out.println("Is the ArrayList empty? " + list.isEmpty() + "\n");

        // Let's see some specific functions for ArrayLists of certain types
        // For example, let's see some functions for ArrayLists of Integers

        // Creating an ArrayList of Integers
        ArrayList<Integer> list2 = new ArrayList<Integer>();

        // Adding 10 elements to the ArrayList randomly in a loop
        for (int i = 0; i < 10; i++) {
            list2.add((int)(Math.random() * 100));
        }

        // Printing the ArrayList so far
        System.out.println("ArrayList so far: " + list2 + "\n");

        // Sorting the ArrayList - the format is Collections.sort(list)
        // This sorts the ArrayList in ascending order
        // This is a static method, so we call it using the class name Collections
        // This is why we imported the Collections class at the beginning
        Collections.sort(list2);

        // Printing the ArrayList so far
        System.out.println("ArrayList so far: " + list2 + "\n");
    }
}