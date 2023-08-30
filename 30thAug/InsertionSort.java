// This is insertion sort.
// Insertion sort is an approach to sorting, where we insert the current element in the correct position in the sorted array.
// This is a O(n^2) algorithm.
// This is an in-place algorithm (no extra memory is required).
// This is a stable algorithm (the order of equal elements is preserved).
// There can be optimizations done to this algorithm, like if there are no swaps in a pass, then the array is already sorted.
// In insertion sort, after each pass, the first i elements are sorted.
// So in the inner loop, we don't need to check the first i elements, as they are already in place.
// The best case time complexity of insertion sort is O(n), when the array is already sorted.
// The worst case time complexity of insertion sort is O(n^2), when the array is sorted in reverse order.

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = { 5, 4, 3, 2, 1 };
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            // Insert the current element in the correct position in the sorted array.
            int current = arr[i];
            int j = i - 1;
            // The logic here is to shift all the elements greater than the current element to the right.
            while (j >= 0 && arr[j] > current) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = current;
        }
    }
}
