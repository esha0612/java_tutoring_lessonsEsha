// This is bubble sort.
// Bubble sort is a brute force approach to sorting, where we compare each element with the next element and swap them if they are not in order.
// This is a O(n^2) algorithm.
// This is an in-place algorithm (no extra memory is required).
// This is a stable algorithm (the order of equal elements is preserved).
// There can be optimizations done to this algorithm, like if there are no swaps in a pass, then the array is already sorted.
// In bubble sort, after each pass, the largest element is bubbled to the end of the array.
// So in the inner loop, we don't need to check the last i elements, as they are already in place.
// The best case time complexity of bubble sort is O(n), when the array is already sorted.
// The worst case time complexity of bubble sort is O(n^2), when the array is sorted in reverse order.

import java.util.Arrays;

public class BubbleSort {
    // main method to test the code (this is for ascending order sorting)
    public static void main(String[] args) {
        int[] arr = { 5, 4, 3, 2, 1 };
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped = false;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            // The last i elements are already in place, so we don't need to check them.
            for (int j = 0; j < n - i - 1; j++) {
                // If the current element is greater than the next element, then swap them.
                if (arr[j] > arr[j + 1]) {
                    swapped = true;
                    swap(arr, j, j + 1);
                }
            }
            // If there are no swaps in a pass, then the array is already sorted.
            if (!swapped) {
                break;
            }
        }
    }

    public static void swap(int[] arr, int i, int j) {
        // Swap the elements at indices i and j.
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}