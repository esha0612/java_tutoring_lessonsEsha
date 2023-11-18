// For the given array, print the sum of all the elements
// Input: 1 2 3 4 5
// Output: 15
// For each of today's programmes, I want at least two distinct solutions

class ArrayEx1 {
    // variables
    int[] array;

    // constructor
    ArrayEx1(int[] array) {
        this.array = array;
    }

    // methods
    public int arraySum1() {
        // YOUR CODE HERE
        int sum = 0;
        for (int element : this.array){
            sum+=element;
        }
        return sum;
    }

    public int arraySum2(int index) {
        // YOUR CODE HERE
        if (index == this.array.length-1){
            return this.array[index];
        }
        return this.array[index] + arraySum2(index+1);
    }

    // Main method
    public static void main (String[] args) {
        ArrayEx1 obj = new ArrayEx1(new int[]{1, 2, 3, 4, 5});
        System.out.println(obj.arraySum1());
        System.out.println(obj.arraySum2(0));
    }
}