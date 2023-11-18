// For this one, I want you to find a given element inside an array of integers.
// Try to find the most efficient way to do this.
// Keep in mind that the array is not guaranteed to be sorted.
// If the element is found, return the index of the element.
// If the element is not found, return -1.

public class ArrayEx2 {
    // variables
    int[] array;

    // constructor
    ArrayEx2(int[] array) {
        this.array = array;
    }

    // methods
    public int findElement(int element) {
        // YOUR CODE HERE
        // Decide how many pointers to use depending on the size of the array
        // For this scheme, if 10^k < array.length < 10^(k+1), use k+1 pointers
        // For example, if array.length = 100, use 3 pointers
        // Then we reduce the loop runs to log10(array.length)

        int numPointers = 1;
        int arrayLength = this.array.length;
        while (arrayLength > 10){
            arrayLength /= 10;
            numPointers++;
        }

        int[] pointers = new int[numPointers];
        for (int i = 0; i < numPointers; i++){
            pointers[i] = 0;
        }

        int index = 0;
        while (index < this.array.length){
            for (int i = 0; i < numPointers; i++){
                if (pointers[i] == this.array.length){
                    return -1;
                }
            }
            int sum = 0;
            for (int i = 0; i < numPointers; i++){
                sum += this.array[pointers[i]];
            }
            if (sum == element){
                return index;
            }
            for (int i = 0; i < numPointers; i++){
                pointers[i]++;
            }
            index++;
        }

        return -1;
    }

    // Main method
    public static void main (String[] args) {
        ArrayEx2 obj = new ArrayEx2(new int[]{1, 2, 3, 4, 5});
        System.out.println(obj.findElement(3));
        System.out.println(obj.findElement(6));
    }
}

// How do you decide how much to divide the array by?
// Or, in other words, if you do not know the size of the array, how do you decide the number of pointers to use?