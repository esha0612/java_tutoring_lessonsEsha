// This is quick sort.
// Quick sort is a divide and conquer algorithm.
// The idea is to pick an element as pivot and partition the given array around the picked pivot.
// There are many different versions of quick sort that pick pivot in different ways.
// Here we will pick the last element as pivot, but we can swap it with a random element to make it randomzied quick sort.
// The time complexity of quick sort is O(nlogn) in average case and O(n^2) in worst case.
// The space complexity of quick sort is O(logn).
// The partition function is used for partitioning the array.
// The partition function returns the index of the pivot element.
// The logic of partition function is to place the pivot element at its correct position in the sorted array, 
// so that when we merge the two sorted halves, the array is sorted around the pivot element.

public class QuickSort {
    public static void main (String[] args) {
        int[] arr = { 5, 4, 3, 2, 1 };

        quickSort(arr, 0, arr.length - 1);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void quickSort (int[] arr, int start, int end) {
        if (start < end) {
            // Partition the array around the pivot element
            int pivot = partition(arr, start, end);

            // Sort the two halves
            quickSort(arr, start, pivot - 1);
            quickSort(arr, pivot + 1, end);
        }
    }

    public static int partition (int[] arr, int start, int end) {
        // Swap the last element with some random element to make it randomized quick sort
        int random = start + (int) (Math.random() * (end - start + 1));
        swap(arr, random, end);

        // Pick the last element as pivot
        int pivot = arr[end];

        // Index of smaller element
        int i = start - 1;

        for (int j = start; j < end; j++) {
            // If current element is smaller than or equal to pivot
            if (arr[j] <= pivot) {
                // Increment index of smaller element
                i++;

                // Swap the elements
                swap(arr, i, j);
            }
        }

        // Swap the pivot element with the element at index i + 1
        swap(arr, i + 1, end);

        // Return the index of the pivot element
        return i + 1;
    }

    public static void swap (int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp; 
    }
}
