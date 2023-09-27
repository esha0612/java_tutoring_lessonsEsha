// We have an array which contains a sequence of integers.
// Given this sequence, your job is to calculate whether this is an arithmetic progression or not.
// If it is, return the common difference. If it is not, return -1.
// Size of the array will be at least 3.

public class FreeCode3 {
    int[] arr;
    
    public FreeCode3(int[] arr) {
        this.arr = arr;
    }

    public int isArithmeticProgression() {
        // TODO: implement this method
        for (int i = 0; i < arr.length - 2; i++) {
            if (arr[i + 1] - arr[i] != arr[i + 2] - arr[i + 1]) {
                return -1;
            }
        }
        return arr[1] - arr[0];
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9};
        FreeCode3 fc = new FreeCode3(arr);
        System.out.println(fc.isArithmeticProgression()); // should print 2

        int[] arr2 = {1, 3, 5, 7, 8};
        FreeCode3 fc2 = new FreeCode3(arr2);
        System.out.println(fc2.isArithmeticProgression()); // should print -1
    }
}
