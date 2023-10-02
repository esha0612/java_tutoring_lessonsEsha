// This is called Linear Search
// Time Complexity: O(n)
// Space Complexity: O(1)
// The idea is to traverse the array and check if the element is present or not
// If present, return the index
// If not present, return -1
// This is a very basic approach

public class LinearSearch {
    int [] arr;

    public LinearSearch(int [] arr) {
        this.arr = arr;
    }

    public int search(int key) {
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String [] args) {
        int [] arr = {1, 2, 3, 4, 5};
        LinearSearch ls = new LinearSearch(arr);
        System.out.println(ls.search(3));
    }
}