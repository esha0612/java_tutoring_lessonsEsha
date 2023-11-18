// For this one, we have an ArrayList of integers.
// I want you to find the longest increasing subsequence in the ArrayList.
// For example, if the ArrayList is [1, 3, -2, 4, 0, 5, 7, 12, 6, 9, 10],
// then the longest increasing subsequence is [-2, 0, 5, 7, 12].
// Keep in mind that the subsequence does not have to be contiguous.

import java.util.ArrayList;

public class ArrayEx4 {
    // variables
    ArrayList<Integer> array;

    // constructor
    ArrayEx4(ArrayList<Integer> array) {
        this.array = array;
    }

    // methods
    public ArrayList<Integer> findLongestIncreasingSubsequence() {
        // YOUR CODE HERE
        ArrayList<ArrayList> array2= new ArrayList<ArrayList>();
        int length =0;
        for (int i = 0; i<array.size(); i++){
            if (array.get(i)<=array2.get(array2.size-1)){
                array2.add(i);
                array2.add(i+1);
            }
        }


        return null;
    }

    // Main method
    public static void main (String[] args) {
        ArrayEx4 obj = new ArrayEx4(new ArrayList<Integer>());
        obj.array.add(1);
        obj.array.add(3);
        obj.array.add(-2);
        obj.array.add(4);
        obj.array.add(0);
        obj.array.add(5);
        obj.array.add(7);
        obj.array.add(12);
        obj.array.add(6);
        obj.array.add(9);
        obj.array.add(10);
        System.out.println(obj.findLongestIncreasingSubsequence());
    }
}
