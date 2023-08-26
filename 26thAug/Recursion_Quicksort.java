public class Recursion_Quicksort {
    // this class will contain an array and a method to sort the array using quicksort
    private static int[] arr;

    public Recursion_Quicksort() {
        this.arr = new int[0];
    }

    public Recursion_Quicksort(int[] arr) {
        this.arr = arr;
    }

    public void quicksort(int[] arr, int low, int high) {
        // this method will sort the array using quicksort
        if (low < high) {
            int pivot = partition(arr, low, high);
            quicksort(arr, low, pivot - 1);
            quicksort(arr, pivot + 1, high);
        }
    }

    public int partition(int[] arr, int low, int high) {
        // this method will partition the array
        // choose last element as pivot
        int pivot = arr[high];
        int i = low - 1;

        // iterate through the array
        for (int j = low; j < high; j++) {
            // if the current element is smaller than the pivot
            if (arr[j] < pivot) {
                i++;
                // swap the elements
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // swap the pivot with the element at i+1
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        // return the index of the pivot
        return i + 1;
    }

    public void printArray(int[] arr) {
        // this method will print the array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    // main method
    public static void main(String[] args) {
        int[] arr = { 10, 7, 8, 9, 1, 5 };
        Recursion_Quicksort obj = new Recursion_Quicksort(arr);
        obj.quicksort(arr, 0, arr.length - 1);
        obj.printArray(arr);
    }
}