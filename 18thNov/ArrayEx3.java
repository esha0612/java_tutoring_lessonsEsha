// Here, I want you to find an element inside an array of integers again.
// But this time, the array is sorted.
// Again, try to find the most efficient way to do this.

public class ArrayEx3 {
    // variables
    int[] array;

    // constructor
    ArrayEx3(int[] array) {
        this.array = array;
    }

    // methods
    public int findElement(int element) {
        // YOUR CODE HERE
        int left = 0, right = this.array.length-1;

        while (left <= right){
            int mid = (left+right)/2;
            if (this.array[mid] == element){
                return mid;
            }
            else if (this.array[mid] < element){
                left = mid+1;
            }
            else{
                right = mid-1;
            }
        }

        return -1;
    }

    // Main method
    public static void main (String[] args) {
        ArrayEx3 obj = new ArrayEx3(new int[]{1, 2, 3, 4, 5});
        System.out.println(obj.findElement(3));
        System.out.println(obj.findElement(6));
    }
}
