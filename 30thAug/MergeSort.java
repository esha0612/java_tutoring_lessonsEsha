// This is merge sort.
// Merge sort is a divide and conquer algorithm.
// The idea is to divide the array into two halves and then merge the two sorted halves.
// The merge function is used for merging two halves.
// We keep dividing the array into two halves until we reach a stage where there is only one element in the array.
// A single element is always sorted so we start merging back the sorted halves.
// The time complexity of merge sort is O(nlogn) in all the cases.
// The space complexity of merge sort is O(n).

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = { 5, 4, 3, 2, 1 };

        mergeSort(arr, 0, arr.length - 1);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void mergeSort(int[] arr, int start, int end) {
        if (start < end) {
            // Find the middle point
            int mid = (start + end) / 2;

            // Sort first and second halves
            mergeSort(arr, start, mid);
            mergeSort(arr, mid + 1, end);

            // Merge the sorted halves
            merge(arr, start, mid, end);
        }
    }

    public static void merge(int[] arr, int start, int mid, int end) {
        // Find sizes of two subarrays to be merged
        int n1 = mid - start + 1;
        int n2 = end - mid;

        // Create temp arrays
        int[] left = new int[n1];
        int[] right = new int[n2];

        // Copy data to temp arrays
        for (int i = 0; i < n1; i++) {
            left[i] = arr[start + i];
        }
        for (int j = 0; j < n2; j++) {
            right[j] = arr[mid + 1 + j];
        }

        // Merge the temp arrays

        // Initial indexes of first and second subarrays
        int i = 0, j = 0;

        // Initial index of merged subarry array
        int k = start;
        while (i < n1 && j < n2) {
            arr [k++] = left[i] <= right[j] ? left[i++] : right[j++];
        }

        // Copy remaining elements of left[] if any
        while (i < n1) {
            arr[k++] = left[i++];
        }

        // Copy remaining elements of right[] if any
        while (j < n2) {
            arr[k++] = right[j++];
        }
    }
}
