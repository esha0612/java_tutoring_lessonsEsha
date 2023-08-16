import java.lang.Math;
import java.util.ArrayList;

public class Recap {
    public static void main (String[] args) {
        // Problem 1
        int a = 10;
        int b = 20;
        int c = a++ + ++b;
        // print the variables a, b, c
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        // print the value of the expression c++ + a++ + ++b
        System.out.println(c++ + a++ + ++b);

        // Problem 2
        int x = 10;
        System.out.println(x++ + ++x + x++ + ++x + x++ + ++x);

        // Problem 3
        int y = 7;
        System.out.println(x++); 
        System.out.println((Math.pow(++x, 4)) % y); //theory of congruence modulus (18 mod 7-> 4^2 mod 7-> 2^2 mod 7 = 4)
        
        // Problem 4
        ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>();
        // this is shorthand for creating an arraylist
        arr.add(new ArrayList<Integer>() {{add(1); add(2); add(3);}});
        arr.add(new ArrayList<Integer>() {{add(4); add(5); add(6);}});
        System.out.println(arr);

        // Problem 5
        // create an arraylist of integers
        ArrayList<Integer> arr2 = new ArrayList<Integer>() {{add(5); add(2); add(3); add(0); add(-2); add(-1); add(1);}};
        // print the arraylist
        System.out.println(arr2);
        // sort the members of the arraylist in ascending order with as few lines of code as possible
        // use selection sort (each step we find the smallest element and put it in the front)
        /* for (int i = 0; i < arr2.size(); i++) {
            int min = i;
            for (int j = i + 1; j < arr2.size(); j++) {
                if (arr2.get(j) < arr2.get(min)) {
                    min = j;
                }
            }
            int temp = arr2.get(i);
            arr2.set(i, arr2.get(min));
            arr2.set(min, temp);
        } */
        arr2.sort(null);
        // print the sorted arraylist
        System.out.println(arr2);
    }
}