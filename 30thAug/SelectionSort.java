// This is selection sort.
// Selection sort is an approach to sorting, where we find the minimum element in the array and swap it with the first element.
// This is a O(n^2) algorithm.
// This is an in-place algorithm (no extra memory is required).
// This is not a stable algorithm (the order of equal elements is not preserved).
// There can be optimizations done to this algorithm, like if there are no swaps in a pass, then the array is already sorted.
// In selection sort, after each pass, the smallest element is selected and placed at the ith position of the array.
// So in the inner loop, we don't need to check the first i elements, as they are already in place.
// The best and worst case time complexity of selection sort is O(n^2).

import java.util.Arrays;

public class SelectionSort {
    public static void main (String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void selectionSort (int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            // Find the minimum element in the array.
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex])
                    minIndex = j;
            }
            // Swap the minimum element with the first element.
            swap(arr, i, minIndex);
        }
    }

    public static void swap (int[] arr, int i, int j) {
        // Swap the elements at indices i and j.
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
