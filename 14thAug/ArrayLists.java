import java.util.ArrayList;

public class ArrayLists {
    public static void main (String [] args) {
        // ArrayLists are dynamic, user defined arrays
        // They are not arrays in the traditional sense, they are objects that contain arrays and array manipualtion methods
        // They are imported from the java.util package
        // They are not a primitive data type, they are objects of the ArrayList class
        // ArrayLists can hold values of any data type (primitive or object/user defined)
        // ArrayLists are created with the following syntax
        ArrayList<String> cars = new ArrayList<String>();
        // The above line creates an ArrayList of Strings called cars
        // The <String> indicates that the ArrayList will only hold Strings
        // The ArrayList class has many useful methods for manipulating the ArrayList
        // The most common methods are add(), remove(), get(), set(), size(), and clear()
        // add() adds an element to the ArrayList
        cars.add("BMW");
        cars.add("Audi");
        cars.add("Mercedes");
        cars.add("Lamborghini");
        cars.add("Ferrari");
        // remove() removes an element from the ArrayList
        cars.remove("BMW");
        // get() returns the element at the specified index
        System.out.println(cars.get(0));
        // set() changes the element at the specified index
        cars.set(0, "BMW");
        // size() returns the number of elements in the ArrayList
        System.out.println(cars.size());
        // clear() removes all elements from the ArrayList
        cars.clear();

        cars.add("BMW");
        cars.add("Audi");
        cars.add("Mercedes");
        cars.add("Lamborghini");
        cars.add("Ferrari");
        // ArrayLists can be passed to the constructor of other ArrayLists
        ArrayList<String> cars2 = new ArrayList<String>(cars);
        // ArrayLists can be iterated through using a for loop
        for (int i = 0; i < cars2.size(); i++) {
            System.out.println(cars2.get(i));
        }
        // ArrayLists can also be iterated through using a enhanced-for loop
        for (String car : cars2) {
            System.out.println(car);
        }
        // ArrayLists can also be iterated through using a for-each loop
        cars2.forEach((car) -> {
            System.out.println(car);
        });

        // A tricky example with an ArrayList of integers using the for-each loop
        System.out.println("\n\n\nTricky example");
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.forEach((number) -> {
            number += 1;
        });
        numbers.forEach((number) -> {
            System.out.println(number);
        });
        // The above code will not add 1 to each element in the ArrayList
        // This is because the for-each loop creates a copy of each element in the ArrayList
        // The copy is then modified, but the original element is not modified
        // To modify the original element, the for-each loop must be used with the set() method
        for (int i = 0; i < numbers.size(); i++) {
            numbers.set(i, numbers.get(i) + 1);
        }

        // ArrayLists are dynamic, so they can be resized at any time
        // ArrayLists are resized by adding or removing elements

        // Another tricky example with an ArrayList of ArrayLists
        System.out.println("\n\n\nAnother tricky example");
        ArrayList<ArrayList<Integer>> numbers2 = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> numbers3 = new ArrayList<Integer>();
        numbers3.add(1);
        numbers3.add(2);
        numbers3.add(3);
        numbers2.add(numbers3);
        numbers3 = new ArrayList<Integer>();
        numbers3.add(4);
        numbers3.add(5);
        numbers3.add(6);
        numbers2.add(numbers3);
        numbers2.forEach((number) -> {
            number.forEach((num) -> {
                System.out.println(num);
            });
        });
    }
}
